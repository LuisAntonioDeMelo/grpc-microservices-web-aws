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
  descricao: string
  dataVencimento: Date
  dataLancamento: Date
  pessoa: Pessoa
  categoria: Categoria
  valor: number
  observacao: string
  tipoLancamento: TipoLancamento
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
  login: string
  senha: string
  nome: string
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
