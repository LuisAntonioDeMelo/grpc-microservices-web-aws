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
    comments = "Source: cidade.proto")
public final class CidadeServiceGrpc {

  private CidadeServiceGrpc() {}

  public static final String SERVICE_NAME = "CidadeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.emptyCidade,
      com.grpc.proto.CidadesResponse> getObterCidadesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterCidades",
      requestType = com.grpc.proto.emptyCidade.class,
      responseType = com.grpc.proto.CidadesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.emptyCidade,
      com.grpc.proto.CidadesResponse> getObterCidadesMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.emptyCidade, com.grpc.proto.CidadesResponse> getObterCidadesMethod;
    if ((getObterCidadesMethod = CidadeServiceGrpc.getObterCidadesMethod) == null) {
      synchronized (CidadeServiceGrpc.class) {
        if ((getObterCidadesMethod = CidadeServiceGrpc.getObterCidadesMethod) == null) {
          CidadeServiceGrpc.getObterCidadesMethod = getObterCidadesMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.emptyCidade, com.grpc.proto.CidadesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CidadeService", "obterCidades"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.emptyCidade.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.CidadesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CidadeServiceMethodDescriptorSupplier("obterCidades"))
                  .build();
          }
        }
     }
     return getObterCidadesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CidadeServiceStub newStub(io.grpc.Channel channel) {
    return new CidadeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CidadeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CidadeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CidadeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CidadeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CidadeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void obterCidades(com.grpc.proto.emptyCidade request,
        io.grpc.stub.StreamObserver<com.grpc.proto.CidadesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObterCidadesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getObterCidadesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.emptyCidade,
                com.grpc.proto.CidadesResponse>(
                  this, METHODID_OBTER_CIDADES)))
          .build();
    }
  }

  /**
   */
  public static final class CidadeServiceStub extends io.grpc.stub.AbstractStub<CidadeServiceStub> {
    private CidadeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CidadeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CidadeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CidadeServiceStub(channel, callOptions);
    }

    /**
     */
    public void obterCidades(com.grpc.proto.emptyCidade request,
        io.grpc.stub.StreamObserver<com.grpc.proto.CidadesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterCidadesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CidadeServiceBlockingStub extends io.grpc.stub.AbstractStub<CidadeServiceBlockingStub> {
    private CidadeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CidadeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CidadeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CidadeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.CidadesResponse obterCidades(com.grpc.proto.emptyCidade request) {
      return blockingUnaryCall(
          getChannel(), getObterCidadesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CidadeServiceFutureStub extends io.grpc.stub.AbstractStub<CidadeServiceFutureStub> {
    private CidadeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CidadeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CidadeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CidadeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.CidadesResponse> obterCidades(
        com.grpc.proto.emptyCidade request) {
      return futureUnaryCall(
          getChannel().newCall(getObterCidadesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OBTER_CIDADES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CidadeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CidadeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OBTER_CIDADES:
          serviceImpl.obterCidades((com.grpc.proto.emptyCidade) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.CidadesResponse>) responseObserver);
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

  private static abstract class CidadeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CidadeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.Cidade.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CidadeService");
    }
  }

  private static final class CidadeServiceFileDescriptorSupplier
      extends CidadeServiceBaseDescriptorSupplier {
    CidadeServiceFileDescriptorSupplier() {}
  }

  private static final class CidadeServiceMethodDescriptorSupplier
      extends CidadeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CidadeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CidadeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CidadeServiceFileDescriptorSupplier())
              .addMethod(getObterCidadesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
