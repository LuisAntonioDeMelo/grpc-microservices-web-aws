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
    comments = "Source: ativo.proto")
public final class AtivoServiceGrpc {

  private AtivoServiceGrpc() {}

  public static final String SERVICE_NAME = "AtivoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.AtivoDTO,
      com.grpc.proto.AtivoDTO> getAdicionarAtivoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "adicionarAtivo",
      requestType = com.grpc.proto.AtivoDTO.class,
      responseType = com.grpc.proto.AtivoDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.AtivoDTO,
      com.grpc.proto.AtivoDTO> getAdicionarAtivoMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.AtivoDTO, com.grpc.proto.AtivoDTO> getAdicionarAtivoMethod;
    if ((getAdicionarAtivoMethod = AtivoServiceGrpc.getAdicionarAtivoMethod) == null) {
      synchronized (AtivoServiceGrpc.class) {
        if ((getAdicionarAtivoMethod = AtivoServiceGrpc.getAdicionarAtivoMethod) == null) {
          AtivoServiceGrpc.getAdicionarAtivoMethod = getAdicionarAtivoMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.AtivoDTO, com.grpc.proto.AtivoDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AtivoService", "adicionarAtivo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.AtivoDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.AtivoDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new AtivoServiceMethodDescriptorSupplier("adicionarAtivo"))
                  .build();
          }
        }
     }
     return getAdicionarAtivoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.AtivoRequest,
      com.grpc.proto.AtivoDTO> getObterPorIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterPorId",
      requestType = com.grpc.proto.AtivoRequest.class,
      responseType = com.grpc.proto.AtivoDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.AtivoRequest,
      com.grpc.proto.AtivoDTO> getObterPorIdMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.AtivoRequest, com.grpc.proto.AtivoDTO> getObterPorIdMethod;
    if ((getObterPorIdMethod = AtivoServiceGrpc.getObterPorIdMethod) == null) {
      synchronized (AtivoServiceGrpc.class) {
        if ((getObterPorIdMethod = AtivoServiceGrpc.getObterPorIdMethod) == null) {
          AtivoServiceGrpc.getObterPorIdMethod = getObterPorIdMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.AtivoRequest, com.grpc.proto.AtivoDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AtivoService", "obterPorId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.AtivoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.AtivoDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new AtivoServiceMethodDescriptorSupplier("obterPorId"))
                  .build();
          }
        }
     }
     return getObterPorIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.AtivoRequest,
      com.grpc.proto.AtivosReponse> getObterAtivosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterAtivos",
      requestType = com.grpc.proto.AtivoRequest.class,
      responseType = com.grpc.proto.AtivosReponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.AtivoRequest,
      com.grpc.proto.AtivosReponse> getObterAtivosMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.AtivoRequest, com.grpc.proto.AtivosReponse> getObterAtivosMethod;
    if ((getObterAtivosMethod = AtivoServiceGrpc.getObterAtivosMethod) == null) {
      synchronized (AtivoServiceGrpc.class) {
        if ((getObterAtivosMethod = AtivoServiceGrpc.getObterAtivosMethod) == null) {
          AtivoServiceGrpc.getObterAtivosMethod = getObterAtivosMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.AtivoRequest, com.grpc.proto.AtivosReponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AtivoService", "obterAtivos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.AtivoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.AtivosReponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AtivoServiceMethodDescriptorSupplier("obterAtivos"))
                  .build();
          }
        }
     }
     return getObterAtivosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AtivoServiceStub newStub(io.grpc.Channel channel) {
    return new AtivoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AtivoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AtivoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AtivoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AtivoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AtivoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void adicionarAtivo(com.grpc.proto.AtivoDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.AtivoDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getAdicionarAtivoMethod(), responseObserver);
    }

    /**
     */
    public void obterPorId(com.grpc.proto.AtivoRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.AtivoDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getObterPorIdMethod(), responseObserver);
    }

    /**
     */
    public void obterAtivos(com.grpc.proto.AtivoRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.AtivosReponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObterAtivosMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAdicionarAtivoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.AtivoDTO,
                com.grpc.proto.AtivoDTO>(
                  this, METHODID_ADICIONAR_ATIVO)))
          .addMethod(
            getObterPorIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.AtivoRequest,
                com.grpc.proto.AtivoDTO>(
                  this, METHODID_OBTER_POR_ID)))
          .addMethod(
            getObterAtivosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.AtivoRequest,
                com.grpc.proto.AtivosReponse>(
                  this, METHODID_OBTER_ATIVOS)))
          .build();
    }
  }

  /**
   */
  public static final class AtivoServiceStub extends io.grpc.stub.AbstractStub<AtivoServiceStub> {
    private AtivoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AtivoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AtivoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AtivoServiceStub(channel, callOptions);
    }

    /**
     */
    public void adicionarAtivo(com.grpc.proto.AtivoDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.AtivoDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdicionarAtivoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obterPorId(com.grpc.proto.AtivoRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.AtivoDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterPorIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obterAtivos(com.grpc.proto.AtivoRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.AtivosReponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterAtivosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AtivoServiceBlockingStub extends io.grpc.stub.AbstractStub<AtivoServiceBlockingStub> {
    private AtivoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AtivoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AtivoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AtivoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.AtivoDTO adicionarAtivo(com.grpc.proto.AtivoDTO request) {
      return blockingUnaryCall(
          getChannel(), getAdicionarAtivoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.AtivoDTO obterPorId(com.grpc.proto.AtivoRequest request) {
      return blockingUnaryCall(
          getChannel(), getObterPorIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.AtivosReponse obterAtivos(com.grpc.proto.AtivoRequest request) {
      return blockingUnaryCall(
          getChannel(), getObterAtivosMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AtivoServiceFutureStub extends io.grpc.stub.AbstractStub<AtivoServiceFutureStub> {
    private AtivoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AtivoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AtivoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AtivoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.AtivoDTO> adicionarAtivo(
        com.grpc.proto.AtivoDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getAdicionarAtivoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.AtivoDTO> obterPorId(
        com.grpc.proto.AtivoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getObterPorIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.AtivosReponse> obterAtivos(
        com.grpc.proto.AtivoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getObterAtivosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADICIONAR_ATIVO = 0;
  private static final int METHODID_OBTER_POR_ID = 1;
  private static final int METHODID_OBTER_ATIVOS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AtivoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AtivoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADICIONAR_ATIVO:
          serviceImpl.adicionarAtivo((com.grpc.proto.AtivoDTO) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.AtivoDTO>) responseObserver);
          break;
        case METHODID_OBTER_POR_ID:
          serviceImpl.obterPorId((com.grpc.proto.AtivoRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.AtivoDTO>) responseObserver);
          break;
        case METHODID_OBTER_ATIVOS:
          serviceImpl.obterAtivos((com.grpc.proto.AtivoRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.AtivosReponse>) responseObserver);
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

  private static abstract class AtivoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AtivoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.Ativo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AtivoService");
    }
  }

  private static final class AtivoServiceFileDescriptorSupplier
      extends AtivoServiceBaseDescriptorSupplier {
    AtivoServiceFileDescriptorSupplier() {}
  }

  private static final class AtivoServiceMethodDescriptorSupplier
      extends AtivoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AtivoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AtivoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AtivoServiceFileDescriptorSupplier())
              .addMethod(getAdicionarAtivoMethod())
              .addMethod(getObterPorIdMethod())
              .addMethod(getObterAtivosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
