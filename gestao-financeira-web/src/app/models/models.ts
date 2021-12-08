export class Categoria {
  codigo: number
  nome: string
}

export class Pessoa {
  codigo: number
  nome: string
  logradouro: string
  numero: number
  complemento: string
  bairro: string
  cep: string
  ativo: boolean
  cidade: Cidade
}

export class Lancamento {
  codigo: number
  idCliente: number
  idCategoria: number
  descricao: string
  dataLancamento: Date
  dataVencimento: Date
  //pessoa: Pessoa
  //categoria: Categoria
  valor: number
  observacao: string
  tipoLancamento: number
}

export class Cidade {
  codigo: number
  nome: string
  estado: Estado
}

export class Estado {
  codigo: number
  nome: string
}

export enum TipoLancamento {
  despesa = 'DESPESA',
  receita = 'RECEITA',
}

export class User {
  id: number
  idPessoa: number
  login: string
  senha: string
  nome: string
  email: string
  ativo: boolean
}

export class Cliente {
  id: number
  nome: string
  email: string
  telefone: string
  cpf: string
  rg: string
  cidade: number
  estado: number
  diaVencimento: number
  limite: number
  logradouro: string
  numero: string
  complemento: string
  bairo: string
  cep: string
}

export enum TipoLancamento {
  DESPESA = 1,
  RECEITA = 2
}
