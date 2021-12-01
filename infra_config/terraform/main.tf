# #configurar provider
# #configurar authentication
provider "aws" {
    region = "us-east-1"
    acess_key = "AKIAYLG5LSY2CIVXD2YP"
    secret_key = "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"
}

resource "aws_instance" "ls"{
    ami = "ami-13be557e"
    instance_type = "t2.small"
}

data "aws_availability_zones" "available" {
  state = "available"
}

#vpc network
module "vpc" {
   source  = "terraform-aws-modules/vpc/aws"
   version = "~> 3.11.0"

  name = "example_vpc"
  cidr = "10.0.0.0/16"

  azs             = data.aws_availability_zones.available.names
  private_subnets = ["10.0.1.0/24", "10.0.2.0/24"]
  public_subnets  = ["10.0.101.0/24", "10.0.102.0/24"]
  database_subnets = ["10.99.7.0/24", "10.99.8.0/24", "10.99.9.0/24"]

  create_database_subnet_group = true

  enable_ipv6          = false
  enable_nat_gateway   = true
  enable_vpn_gateway   = true
  enable_dns_hostnames = true
  enable_dns_support   = true

  tags = {
    Terraform = "true"
  }
}

module "postgresql_rds" {
  vpc_id = "vpc-20f74844"
  allocated_storage = "20"
  engine_version = "9.4.4"
  instance_type = "db.t2.micro"
  storage_type = "gp2"
  database_identifier = "jl23kj32sdf"
  database_name = "postgres"
  database_username = "postgres"
  database_password = "rootkey2021"
  database_port = "5432"
  backup_retention_period = "21"
  backup_window = "04:00-04:30"
  maintenance_window = "sun:04:30-sun:05:30"
  auto_minor_version_upgrade = false
  multi_availability_zone = true
  storage_encrypted = false
  subnet_group = aws_db_subnet_group.default.name
  parameter_group = aws_db_parameter_group.default.name
  monitoring_interval = "60"
  deletion_protection = true
  cloudwatch_logs_exports = ["postgresql"]

  alarm_cpu_threshold = "75"
  alarm_disk_queue_threshold = "10"
  alarm_free_disk_threshold = "5000000000"
  alarm_free_memory_threshold = "128000000"
  alarm_actions = ["arn:aws:sns..."]
  ok_actions = ["arn:aws:sns..."]
  insufficient_data_actions = ["arn:aws:sns..."]

  project = "Something"
  environment = "Staging"
}