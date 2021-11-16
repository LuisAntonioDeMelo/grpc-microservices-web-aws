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
    comments = "Source: orcamento.proto")
public final class OrcamentoServiceGrpc {

  private OrcamentoServiceGrpc() {}

  public static final String SERVICE_NAME = "OrcamentoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.OrcamentoDTO,
      com.grpc.proto.OrcamentoDTO> getSalvarOrcamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "salvarOrcamento",
      requestType = com.grpc.proto.OrcamentoDTO.class,
      responseType = com.grpc.proto.OrcamentoDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.OrcamentoDTO,
      com.grpc.proto.OrcamentoDTO> getSalvarOrcamentoMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.OrcamentoDTO, com.grpc.proto.OrcamentoDTO> getSalvarOrcamentoMethod;
    if ((getSalvarOrcamentoMethod = OrcamentoServiceGrpc.getSalvarOrcamentoMethod) == null) {
      synchronized (OrcamentoServiceGrpc.class) {
        if ((getSalvarOrcamentoMethod = OrcamentoServiceGrpc.getSalvarOrcamentoMethod) == null) {
          OrcamentoServiceGrpc.getSalvarOrcamentoMethod = getSalvarOrcamentoMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.OrcamentoDTO, com.grpc.proto.OrcamentoDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OrcamentoService", "salvarOrcamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.OrcamentoDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.OrcamentoDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new OrcamentoServiceMethodDescriptorSupplier("salvarOrcamento"))
                  .build();
          }
        }
     }
     return getSalvarOrcamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.emptyOrcamento,
      com.grpc.proto.OrcamentoResponse> getObterOrcamentosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterOrcamentos",
      requestType = com.grpc.proto.emptyOrcamento.class,
      responseType = com.grpc.proto.OrcamentoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.emptyOrcamento,
      com.grpc.proto.OrcamentoResponse> getObterOrcamentosMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.emptyOrcamento, com.grpc.proto.OrcamentoResponse> getObterOrcamentosMethod;
    if ((getObterOrcamentosMethod = OrcamentoServiceGrpc.getObterOrcamentosMethod) == null) {
      synchronized (OrcamentoServiceGrpc.class) {
        if ((getObterOrcamentosMethod = OrcamentoServiceGrpc.getObterOrcamentosMethod) == null) {
          OrcamentoServiceGrpc.getObterOrcamentosMethod = getObterOrcamentosMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.emptyOrcamento, com.grpc.proto.OrcamentoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "OrcamentoService", "obterOrcamentos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.emptyOrcamento.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.OrcamentoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new OrcamentoServiceMethodDescriptorSupplier("obterOrcamentos"))
                  .build();
          }
        }
     }
     return getObterOrcamentosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrcamentoServiceStub newStub(io.grpc.Channel channel) {
    return new OrcamentoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrcamentoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new OrcamentoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrcamentoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new OrcamentoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class OrcamentoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void salvarOrcamento(com.grpc.proto.OrcamentoDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.OrcamentoDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getSalvarOrcamentoMethod(), responseObserver);
    }

    /**
     */
    public void obterOrcamentos(com.grpc.proto.emptyOrcamento request,
        io.grpc.stub.StreamObserver<com.grpc.proto.OrcamentoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObterOrcamentosMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSalvarOrcamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.OrcamentoDTO,
                com.grpc.proto.OrcamentoDTO>(
                  this, METHODID_SALVAR_ORCAMENTO)))
          .addMethod(
            getObterOrcamentosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.emptyOrcamento,
                com.grpc.proto.OrcamentoResponse>(
                  this, METHODID_OBTER_ORCAMENTOS)))
          .build();
    }
  }

  /**
   */
  public static final class OrcamentoServiceStub extends io.grpc.stub.AbstractStub<OrcamentoServiceStub> {
    private OrcamentoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrcamentoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrcamentoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrcamentoServiceStub(channel, callOptions);
    }

    /**
     */
    public void salvarOrcamento(com.grpc.proto.OrcamentoDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.OrcamentoDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSalvarOrcamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obterOrcamentos(com.grpc.proto.emptyOrcamento request,
        io.grpc.stub.StreamObserver<com.grpc.proto.OrcamentoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterOrcamentosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OrcamentoServiceBlockingStub extends io.grpc.stub.AbstractStub<OrcamentoServiceBlockingStub> {
    private OrcamentoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrcamentoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrcamentoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrcamentoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.OrcamentoDTO salvarOrcamento(com.grpc.proto.OrcamentoDTO request) {
      return blockingUnaryCall(
          getChannel(), getSalvarOrcamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.OrcamentoResponse obterOrcamentos(com.grpc.proto.emptyOrcamento request) {
      return blockingUnaryCall(
          getChannel(), getObterOrcamentosMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OrcamentoServiceFutureStub extends io.grpc.stub.AbstractStub<OrcamentoServiceFutureStub> {
    private OrcamentoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private OrcamentoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrcamentoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new OrcamentoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.OrcamentoDTO> salvarOrcamento(
        com.grpc.proto.OrcamentoDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getSalvarOrcamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.OrcamentoResponse> obterOrcamentos(
        com.grpc.proto.emptyOrcamento request) {
      return futureUnaryCall(
          getChannel().newCall(getObterOrcamentosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SALVAR_ORCAMENTO = 0;
  private static final int METHODID_OBTER_ORCAMENTOS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrcamentoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrcamentoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SALVAR_ORCAMENTO:
          serviceImpl.salvarOrcamento((com.grpc.proto.OrcamentoDTO) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.OrcamentoDTO>) responseObserver);
          break;
        case METHODID_OBTER_ORCAMENTOS:
          serviceImpl.obterOrcamentos((com.grpc.proto.emptyOrcamento) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.OrcamentoResponse>) responseObserver);
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

  private static abstract class OrcamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrcamentoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.Orcamento.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrcamentoService");
    }
  }

  private static final class OrcamentoServiceFileDescriptorSupplier
      extends OrcamentoServiceBaseDescriptorSupplier {
    OrcamentoServiceFileDescriptorSupplier() {}
  }

  private static final class OrcamentoServiceMethodDescriptorSupplier
      extends OrcamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrcamentoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrcamentoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrcamentoServiceFileDescriptorSupplier())
              .addMethod(getSalvarOrcamentoMethod())
              .addMethod(getObterOrcamentosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
