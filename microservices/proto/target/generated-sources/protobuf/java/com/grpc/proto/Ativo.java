// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ativo.proto

package com.grpc.proto;

public final class Ativo {
  private Ativo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AtivoDTO_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AtivoDTO_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AtivoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AtivoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AtivosReponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AtivosReponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_emptyAtivo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_emptyAtivo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013ativo.proto\"\211\001\n\010AtivoDTO\022\n\n\002id\030\001 \001(\003\022\022" +
      "\n\ncliente_id\030\002 \001(\003\022\016\n\006codigo\030\003 \001(\t\022\022\n\nqu" +
      "antidade\030\004 \001(\001\022\014\n\004nome\030\005 \001(\t\022\022\n\nvalorMoe" +
      "da\030\006 \001(\001\022\027\n\017valorFracionado\030\007 \001(\001\"\032\n\014Ati" +
      "voRequest\022\n\n\002id\030\001 \001(\003\"*\n\rAtivosReponse\022\031" +
      "\n\006ativos\030\001 \003(\0132\t.AtivoDTO\"\014\n\nemptyAtivo2" +
      "\214\001\n\014AtivoService\022&\n\016adicionarAtivo\022\t.Ati" +
      "voDTO\032\t.AtivoDTO\022&\n\nobterPorId\022\r.AtivoRe" +
      "quest\032\t.AtivoDTO\022,\n\013obterAtivos\022\r.AtivoR" +
      "equest\032\016.AtivosReponseB\022\n\016com.grpc.proto" +
      "P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_AtivoDTO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AtivoDTO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AtivoDTO_descriptor,
        new java.lang.String[] { "Id", "ClienteId", "Codigo", "Quantidade", "Nome", "ValorMoeda", "ValorFracionado", });
    internal_static_AtivoRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AtivoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AtivoRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_AtivosReponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AtivosReponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AtivosReponse_descriptor,
        new java.lang.String[] { "Ativos", });
    internal_static_emptyAtivo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_emptyAtivo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_emptyAtivo_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}