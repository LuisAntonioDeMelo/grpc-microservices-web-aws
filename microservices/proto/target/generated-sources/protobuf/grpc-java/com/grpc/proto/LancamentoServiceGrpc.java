package com.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: lancamento-service.proto")
public final class LancamentoServiceGrpc {

  private LancamentoServiceGrpc() {}

  public static final String SERVICE_NAME = "LancamentoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.LancamentoRequest,
      com.grpc.proto.LancamentoResponse> getObterLancamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterLancamento",
      requestType = com.grpc.proto.LancamentoRequest.class,
      responseType = com.grpc.proto.LancamentoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.LancamentoRequest,
      com.grpc.proto.LancamentoResponse> getObterLancamentoMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.LancamentoRequest, com.grpc.proto.LancamentoResponse> getObterLancamentoMethod;
    if ((getObterLancamentoMethod = LancamentoServiceGrpc.getObterLancamentoMethod) == null) {
      synchronized (LancamentoServiceGrpc.class) {
        if ((getObterLancamentoMethod = LancamentoServiceGrpc.getObterLancamentoMethod) == null) {
          LancamentoServiceGrpc.getObterLancamentoMethod = getObterLancamentoMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.LancamentoRequest, com.grpc.proto.LancamentoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LancamentoService", "obterLancamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.LancamentoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.LancamentoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LancamentoServiceMethodDescriptorSupplier("obterLancamento"))
                  .build();
          }
        }
     }
     return getObterLancamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.LancamentoDTO,
      com.grpc.proto.LancamentoResponse> getSalvarLancamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "salvarLancamento",
      requestType = com.grpc.proto.LancamentoDTO.class,
      responseType = com.grpc.proto.LancamentoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.LancamentoDTO,
      com.grpc.proto.LancamentoResponse> getSalvarLancamentoMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.LancamentoDTO, com.grpc.proto.LancamentoResponse> getSalvarLancamentoMethod;
    if ((getSalvarLancamentoMethod = LancamentoServiceGrpc.getSalvarLancamentoMethod) == null) {
      synchronized (LancamentoServiceGrpc.class) {
        if ((getSalvarLancamentoMethod = LancamentoServiceGrpc.getSalvarLancamentoMethod) == null) {
          LancamentoServiceGrpc.getSalvarLancamentoMethod = getSalvarLancamentoMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.LancamentoDTO, com.grpc.proto.LancamentoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LancamentoService", "salvarLancamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.LancamentoDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.LancamentoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LancamentoServiceMethodDescriptorSupplier("salvarLancamento"))
                  .build();
          }
        }
     }
     return getSalvarLancamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.pesquisaRequest,
      com.grpc.proto.LancamentosResponse> getListarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listar",
      requestType = com.grpc.proto.pesquisaRequest.class,
      responseType = com.grpc.proto.LancamentosResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.pesquisaRequest,
      com.grpc.proto.LancamentosResponse> getListarMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.pesquisaRequest, com.grpc.proto.LancamentosResponse> getListarMethod;
    if ((getListarMethod = LancamentoServiceGrpc.getListarMethod) == null) {
      synchronized (LancamentoServiceGrpc.class) {
        if ((getListarMethod = LancamentoServiceGrpc.getListarMethod) == null) {
          LancamentoServiceGrpc.getListarMethod = getListarMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.pesquisaRequest, com.grpc.proto.LancamentosResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LancamentoService", "listar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.pesquisaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.LancamentosResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LancamentoServiceMethodDescriptorSupplier("listar"))
                  .build();
          }
        }
     }
     return getListarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.PesquisaLancamentoQuery,
      com.grpc.proto.PesquisaLancamentorResponse> getPesquisarLancamentoPorClienteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pesquisarLancamentoPorCliente",
      requestType = com.grpc.proto.PesquisaLancamentoQuery.class,
      responseType = com.grpc.proto.PesquisaLancamentorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.PesquisaLancamentoQuery,
      com.grpc.proto.PesquisaLancamentorResponse> getPesquisarLancamentoPorClienteMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.PesquisaLancamentoQuery, com.grpc.proto.PesquisaLancamentorResponse> getPesquisarLancamentoPorClienteMethod;
    if ((getPesquisarLancamentoPorClienteMethod = LancamentoServiceGrpc.getPesquisarLancamentoPorClienteMethod) == null) {
      synchronized (LancamentoServiceGrpc.class) {
        if ((getPesquisarLancamentoPorClienteMethod = LancamentoServiceGrpc.getPesquisarLancamentoPorClienteMethod) == null) {
          LancamentoServiceGrpc.getPesquisarLancamentoPorClienteMethod = getPesquisarLancamentoPorClienteMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.PesquisaLancamentoQuery, com.grpc.proto.PesquisaLancamentorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LancamentoService", "pesquisarLancamentoPorCliente"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.PesquisaLancamentoQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.PesquisaLancamentorResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LancamentoServiceMethodDescriptorSupplier("pesquisarLancamentoPorCliente"))
                  .build();
          }
        }
     }
     return getPesquisarLancamentoPorClienteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.LancamentoRequest,
      com.grpc.proto.returnMessage> getDeletarLancamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletarLancamento",
      requestType = com.grpc.proto.LancamentoRequest.class,
      responseType = com.grpc.proto.returnMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.LancamentoRequest,
      com.grpc.proto.returnMessage> getDeletarLancamentoMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.LancamentoRequest, com.grpc.proto.returnMessage> getDeletarLancamentoMethod;
    if ((getDeletarLancamentoMethod = LancamentoServiceGrpc.getDeletarLancamentoMethod) == null) {
      synchronized (LancamentoServiceGrpc.class) {
        if ((getDeletarLancamentoMethod = LancamentoServiceGrpc.getDeletarLancamentoMethod) == null) {
          LancamentoServiceGrpc.getDeletarLancamentoMethod = getDeletarLancamentoMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.LancamentoRequest, com.grpc.proto.returnMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LancamentoService", "deletarLancamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.LancamentoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.returnMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new LancamentoServiceMethodDescriptorSupplier("deletarLancamento"))
                  .build();
          }
        }
     }
     return getDeletarLancamentoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LancamentoServiceStub newStub(io.grpc.Channel channel) {
    return new LancamentoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LancamentoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LancamentoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LancamentoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LancamentoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LancamentoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void obterLancamento(com.grpc.proto.LancamentoRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.LancamentoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObterLancamentoMethod(), responseObserver);
    }

    /**
     */
    public void salvarLancamento(com.grpc.proto.LancamentoDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.LancamentoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSalvarLancamentoMethod(), responseObserver);
    }

    /**
     */
    public void listar(com.grpc.proto.pesquisaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.LancamentosResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListarMethod(), responseObserver);
    }

    /**
     */
    public void pesquisarLancamentoPorCliente(com.grpc.proto.PesquisaLancamentoQuery request,
        io.grpc.stub.StreamObserver<com.grpc.proto.PesquisaLancamentorResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPesquisarLancamentoPorClienteMethod(), responseObserver);
    }

    /**
     */
    public void deletarLancamento(com.grpc.proto.LancamentoRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.returnMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletarLancamentoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getObterLancamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.LancamentoRequest,
                com.grpc.proto.LancamentoResponse>(
                  this, METHODID_OBTER_LANCAMENTO)))
          .addMethod(
            getSalvarLancamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.LancamentoDTO,
                com.grpc.proto.LancamentoResponse>(
                  this, METHODID_SALVAR_LANCAMENTO)))
          .addMethod(
            getListarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.pesquisaRequest,
                com.grpc.proto.LancamentosResponse>(
                  this, METHODID_LISTAR)))
          .addMethod(
            getPesquisarLancamentoPorClienteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.PesquisaLancamentoQuery,
                com.grpc.proto.PesquisaLancamentorResponse>(
                  this, METHODID_PESQUISAR_LANCAMENTO_POR_CLIENTE)))
          .addMethod(
            getDeletarLancamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.LancamentoRequest,
                com.grpc.proto.returnMessage>(
                  this, METHODID_DELETAR_LANCAMENTO)))
          .build();
    }
  }

  /**
   */
  public static final class LancamentoServiceStub extends io.grpc.stub.AbstractStub<LancamentoServiceStub> {
    private LancamentoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LancamentoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LancamentoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LancamentoServiceStub(channel, callOptions);
    }

    /**
     */
    public void obterLancamento(com.grpc.proto.LancamentoRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.LancamentoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterLancamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void salvarLancamento(com.grpc.proto.LancamentoDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.LancamentoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSalvarLancamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listar(com.grpc.proto.pesquisaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.LancamentosResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pesquisarLancamentoPorCliente(com.grpc.proto.PesquisaLancamentoQuery request,
        io.grpc.stub.StreamObserver<com.grpc.proto.PesquisaLancamentorResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPesquisarLancamentoPorClienteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletarLancamento(com.grpc.proto.LancamentoRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.returnMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletarLancamentoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LancamentoServiceBlockingStub extends io.grpc.stub.AbstractStub<LancamentoServiceBlockingStub> {
    private LancamentoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LancamentoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LancamentoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LancamentoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.LancamentoResponse obterLancamento(com.grpc.proto.LancamentoRequest request) {
      return blockingUnaryCall(
          getChannel(), getObterLancamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.LancamentoResponse salvarLancamento(com.grpc.proto.LancamentoDTO request) {
      return blockingUnaryCall(
          getChannel(), getSalvarLancamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.LancamentosResponse listar(com.grpc.proto.pesquisaRequest request) {
      return blockingUnaryCall(
          getChannel(), getListarMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.PesquisaLancamentorResponse pesquisarLancamentoPorCliente(com.grpc.proto.PesquisaLancamentoQuery request) {
      return blockingUnaryCall(
          getChannel(), getPesquisarLancamentoPorClienteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.returnMessage deletarLancamento(com.grpc.proto.LancamentoRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletarLancamentoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LancamentoServiceFutureStub extends io.grpc.stub.AbstractStub<LancamentoServiceFutureStub> {
    private LancamentoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LancamentoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LancamentoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LancamentoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.LancamentoResponse> obterLancamento(
        com.grpc.proto.LancamentoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getObterLancamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.LancamentoResponse> salvarLancamento(
        com.grpc.proto.LancamentoDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getSalvarLancamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.LancamentosResponse> listar(
        com.grpc.proto.pesquisaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.PesquisaLancamentorResponse> pesquisarLancamentoPorCliente(
        com.grpc.proto.PesquisaLancamentoQuery request) {
      return futureUnaryCall(
          getChannel().newCall(getPesquisarLancamentoPorClienteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.returnMessage> deletarLancamento(
        com.grpc.proto.LancamentoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletarLancamentoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OBTER_LANCAMENTO = 0;
  private static final int METHODID_SALVAR_LANCAMENTO = 1;
  private static final int METHODID_LISTAR = 2;
  private static final int METHODID_PESQUISAR_LANCAMENTO_POR_CLIENTE = 3;
  private static final int METHODID_DELETAR_LANCAMENTO = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LancamentoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LancamentoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OBTER_LANCAMENTO:
          serviceImpl.obterLancamento((com.grpc.proto.LancamentoRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.LancamentoResponse>) responseObserver);
          break;
        case METHODID_SALVAR_LANCAMENTO:
          serviceImpl.salvarLancamento((com.grpc.proto.LancamentoDTO) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.LancamentoResponse>) responseObserver);
          break;
        case METHODID_LISTAR:
          serviceImpl.listar((com.grpc.proto.pesquisaRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.LancamentosResponse>) responseObserver);
          break;
        case METHODID_PESQUISAR_LANCAMENTO_POR_CLIENTE:
          serviceImpl.pesquisarLancamentoPorCliente((com.grpc.proto.PesquisaLancamentoQuery) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.PesquisaLancamentorResponse>) responseObserver);
          break;
        case METHODID_DELETAR_LANCAMENTO:
          serviceImpl.deletarLancamento((com.grpc.proto.LancamentoRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.returnMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LancamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LancamentoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.LancamentoServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LancamentoService");
    }
  }

  private static final class LancamentoServiceFileDescriptorSupplier
      extends LancamentoServiceBaseDescriptorSupplier {
    LancamentoServiceFileDescriptorSupplier() {}
  }

  private static final class LancamentoServiceMethodDescriptorSupplier
      extends LancamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LancamentoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LancamentoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LancamentoServiceFileDescriptorSupplier())
              .addMethod(getObterLancamentoMethod())
              .addMethod(getSalvarLancamentoMethod())
              .addMethod(getListarMethod())
              .addMethod(getPesquisarLancamentoPorClienteMethod())
              .addMethod(getDeletarLancamentoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
