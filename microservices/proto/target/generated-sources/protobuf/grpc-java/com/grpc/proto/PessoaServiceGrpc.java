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
    comments = "Source: pessoa.proto")
public final class PessoaServiceGrpc {

  private PessoaServiceGrpc() {}

  public static final String SERVICE_NAME = "PessoaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.PessoaDTO,
      com.grpc.proto.PessoaResponse> getAtualizarPessoaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "atualizarPessoa",
      requestType = com.grpc.proto.PessoaDTO.class,
      responseType = com.grpc.proto.PessoaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.PessoaDTO,
      com.grpc.proto.PessoaResponse> getAtualizarPessoaMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.PessoaDTO, com.grpc.proto.PessoaResponse> getAtualizarPessoaMethod;
    if ((getAtualizarPessoaMethod = PessoaServiceGrpc.getAtualizarPessoaMethod) == null) {
      synchronized (PessoaServiceGrpc.class) {
        if ((getAtualizarPessoaMethod = PessoaServiceGrpc.getAtualizarPessoaMethod) == null) {
          PessoaServiceGrpc.getAtualizarPessoaMethod = getAtualizarPessoaMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.PessoaDTO, com.grpc.proto.PessoaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PessoaService", "atualizarPessoa"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.PessoaDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.PessoaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PessoaServiceMethodDescriptorSupplier("atualizarPessoa"))
                  .build();
          }
        }
     }
     return getAtualizarPessoaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.PessoaRequest,
      com.grpc.proto.PessoaResponse> getObterPorIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterPorId",
      requestType = com.grpc.proto.PessoaRequest.class,
      responseType = com.grpc.proto.PessoaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.PessoaRequest,
      com.grpc.proto.PessoaResponse> getObterPorIdMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.PessoaRequest, com.grpc.proto.PessoaResponse> getObterPorIdMethod;
    if ((getObterPorIdMethod = PessoaServiceGrpc.getObterPorIdMethod) == null) {
      synchronized (PessoaServiceGrpc.class) {
        if ((getObterPorIdMethod = PessoaServiceGrpc.getObterPorIdMethod) == null) {
          PessoaServiceGrpc.getObterPorIdMethod = getObterPorIdMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.PessoaRequest, com.grpc.proto.PessoaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PessoaService", "obterPorId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.PessoaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.PessoaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PessoaServiceMethodDescriptorSupplier("obterPorId"))
                  .build();
          }
        }
     }
     return getObterPorIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PessoaServiceStub newStub(io.grpc.Channel channel) {
    return new PessoaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PessoaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PessoaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PessoaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PessoaServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PessoaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void atualizarPessoa(com.grpc.proto.PessoaDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.PessoaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAtualizarPessoaMethod(), responseObserver);
    }

    /**
     */
    public void obterPorId(com.grpc.proto.PessoaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.PessoaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObterPorIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAtualizarPessoaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.PessoaDTO,
                com.grpc.proto.PessoaResponse>(
                  this, METHODID_ATUALIZAR_PESSOA)))
          .addMethod(
            getObterPorIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.PessoaRequest,
                com.grpc.proto.PessoaResponse>(
                  this, METHODID_OBTER_POR_ID)))
          .build();
    }
  }

  /**
   */
  public static final class PessoaServiceStub extends io.grpc.stub.AbstractStub<PessoaServiceStub> {
    private PessoaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PessoaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PessoaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PessoaServiceStub(channel, callOptions);
    }

    /**
     */
    public void atualizarPessoa(com.grpc.proto.PessoaDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.PessoaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAtualizarPessoaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obterPorId(com.grpc.proto.PessoaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.PessoaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterPorIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PessoaServiceBlockingStub extends io.grpc.stub.AbstractStub<PessoaServiceBlockingStub> {
    private PessoaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PessoaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PessoaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PessoaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.PessoaResponse atualizarPessoa(com.grpc.proto.PessoaDTO request) {
      return blockingUnaryCall(
          getChannel(), getAtualizarPessoaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.PessoaResponse obterPorId(com.grpc.proto.PessoaRequest request) {
      return blockingUnaryCall(
          getChannel(), getObterPorIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PessoaServiceFutureStub extends io.grpc.stub.AbstractStub<PessoaServiceFutureStub> {
    private PessoaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PessoaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PessoaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PessoaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.PessoaResponse> atualizarPessoa(
        com.grpc.proto.PessoaDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getAtualizarPessoaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.PessoaResponse> obterPorId(
        com.grpc.proto.PessoaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getObterPorIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ATUALIZAR_PESSOA = 0;
  private static final int METHODID_OBTER_POR_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PessoaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PessoaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ATUALIZAR_PESSOA:
          serviceImpl.atualizarPessoa((com.grpc.proto.PessoaDTO) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.PessoaResponse>) responseObserver);
          break;
        case METHODID_OBTER_POR_ID:
          serviceImpl.obterPorId((com.grpc.proto.PessoaRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.PessoaResponse>) responseObserver);
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

  private static abstract class PessoaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PessoaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.Pessoa.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PessoaService");
    }
  }

  private static final class PessoaServiceFileDescriptorSupplier
      extends PessoaServiceBaseDescriptorSupplier {
    PessoaServiceFileDescriptorSupplier() {}
  }

  private static final class PessoaServiceMethodDescriptorSupplier
      extends PessoaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PessoaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PessoaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PessoaServiceFileDescriptorSupplier())
              .addMethod(getAtualizarPessoaMethod())
              .addMethod(getObterPorIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
