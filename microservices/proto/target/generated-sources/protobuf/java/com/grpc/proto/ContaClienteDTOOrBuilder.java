// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conta-cliente.proto

package com.grpc.proto;

public interface ContaClienteDTOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ContaClienteDTO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>int64 cliente_id = 2;</code>
   */
  long getClienteId();

  /**
   * <code>double saldo = 3;</code>
   */
  double getSaldo();

  /**
   * <code>double limitePagamento = 4;</code>
   */
  double getLimitePagamento();

  /**
   * <code>double debitoPendente = 5;</code>
   */
  double getDebitoPendente();

  /**
   * <code>.TipoConta tipoConta = 6;</code>
   */
  int getTipoContaValue();
  /**
   * <code>.TipoConta tipoConta = 6;</code>
   */
  com.grpc.proto.TipoConta getTipoConta();
}