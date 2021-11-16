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
    comments = "Source: pagamento.proto")
public final class PagamentoServiceGrpc {

  private PagamentoServiceGrpc() {}

  public static final String SERVICE_NAME = "PagamentoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.PagamentoDTO,
      com.grpc.proto.PagamentoDTO> getSalvarPagamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "salvarPagamento",
      requestType = com.grpc.proto.PagamentoDTO.class,
      responseType = com.grpc.proto.PagamentoDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.PagamentoDTO,
      com.grpc.proto.PagamentoDTO> getSalvarPagamentoMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.PagamentoDTO, com.grpc.proto.PagamentoDTO> getSalvarPagamentoMethod;
    if ((getSalvarPagamentoMethod = PagamentoServiceGrpc.getSalvarPagamentoMethod) == null) {
      synchronized (PagamentoServiceGrpc.class) {
        if ((getSalvarPagamentoMethod = PagamentoServiceGrpc.getSalvarPagamentoMethod) == null) {
          PagamentoServiceGrpc.getSalvarPagamentoMethod = getSalvarPagamentoMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.PagamentoDTO, com.grpc.proto.PagamentoDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PagamentoService", "salvarPagamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.PagamentoDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.PagamentoDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new PagamentoServiceMethodDescriptorSupplier("salvarPagamento"))
                  .build();
          }
        }
     }
     return getSalvarPagamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.emptyPagamento,
      com.grpc.proto.PagamentoResponse> getObterOrcamentosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterOrcamentos",
      requestType = com.grpc.proto.emptyPagamento.class,
      responseType = com.grpc.proto.PagamentoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.emptyPagamento,
      com.grpc.proto.PagamentoResponse> getObterOrcamentosMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.emptyPagamento, com.grpc.proto.PagamentoResponse> getObterOrcamentosMethod;
    if ((getObterOrcamentosMethod = PagamentoServiceGrpc.getObterOrcamentosMethod) == null) {
      synchronized (PagamentoServiceGrpc.class) {
        if ((getObterOrcamentosMethod = PagamentoServiceGrpc.getObterOrcamentosMethod) == null) {
          PagamentoServiceGrpc.getObterOrcamentosMethod = getObterOrcamentosMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.emptyPagamento, com.grpc.proto.PagamentoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PagamentoService", "obterOrcamentos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.emptyPagamento.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.PagamentoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PagamentoServiceMethodDescriptorSupplier("obterOrcamentos"))
                  .build();
          }
        }
     }
     return getObterOrcamentosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PagamentoServiceStub newStub(io.grpc.Channel channel) {
    return new PagamentoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PagamentoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PagamentoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PagamentoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PagamentoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PagamentoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void salvarPagamento(com.grpc.proto.PagamentoDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.PagamentoDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getSalvarPagamentoMethod(), responseObserver);
    }

    /**
     */
    public void obterOrcamentos(com.grpc.proto.emptyPagamento request,
        io.grpc.stub.StreamObserver<com.grpc.proto.PagamentoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObterOrcamentosMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSalvarPagamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.PagamentoDTO,
                com.grpc.proto.PagamentoDTO>(
                  this, METHODID_SALVAR_PAGAMENTO)))
          .addMethod(
            getObterOrcamentosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.emptyPagamento,
                com.grpc.proto.PagamentoResponse>(
                  this, METHODID_OBTER_ORCAMENTOS)))
          .build();
    }
  }

  /**
   */
  public static final class PagamentoServiceStub extends io.grpc.stub.AbstractStub<PagamentoServiceStub> {
    private PagamentoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PagamentoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PagamentoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PagamentoServiceStub(channel, callOptions);
    }

    /**
     */
    public void salvarPagamento(com.grpc.proto.PagamentoDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.PagamentoDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSalvarPagamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obterOrcamentos(com.grpc.proto.emptyPagamento request,
        io.grpc.stub.StreamObserver<com.grpc.proto.PagamentoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterOrcamentosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PagamentoServiceBlockingStub extends io.grpc.stub.AbstractStub<PagamentoServiceBlockingStub> {
    private PagamentoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PagamentoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PagamentoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PagamentoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.PagamentoDTO salvarPagamento(com.grpc.proto.PagamentoDTO request) {
      return blockingUnaryCall(
          getChannel(), getSalvarPagamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.PagamentoResponse obterOrcamentos(com.grpc.proto.emptyPagamento request) {
      return blockingUnaryCall(
          getChannel(), getObterOrcamentosMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PagamentoServiceFutureStub extends io.grpc.stub.AbstractStub<PagamentoServiceFutureStub> {
    private PagamentoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PagamentoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PagamentoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PagamentoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.PagamentoDTO> salvarPagamento(
        com.grpc.proto.PagamentoDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getSalvarPagamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.PagamentoResponse> obterOrcamentos(
        com.grpc.proto.emptyPagamento request) {
      return futureUnaryCall(
          getChannel().newCall(getObterOrcamentosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SALVAR_PAGAMENTO = 0;
  private static final int METHODID_OBTER_ORCAMENTOS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PagamentoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PagamentoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SALVAR_PAGAMENTO:
          serviceImpl.salvarPagamento((com.grpc.proto.PagamentoDTO) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.PagamentoDTO>) responseObserver);
          break;
        case METHODID_OBTER_ORCAMENTOS:
          serviceImpl.obterOrcamentos((com.grpc.proto.emptyPagamento) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.PagamentoResponse>) responseObserver);
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

  private static abstract class PagamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PagamentoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.Pagamento.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PagamentoService");
    }
  }

  private static final class PagamentoServiceFileDescriptorSupplier
      extends PagamentoServiceBaseDescriptorSupplier {
    PagamentoServiceFileDescriptorSupplier() {}
  }

  private static final class PagamentoServiceMethodDescriptorSupplier
      extends PagamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PagamentoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PagamentoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PagamentoServiceFileDescriptorSupplier())
              .addMethod(getSalvarPagamentoMethod())
              .addMethod(getObterOrcamentosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
