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
    comments = "Source: conta-cliente.proto")
public final class ContaClienteServiceGrpc {

  private ContaClienteServiceGrpc() {}

  public static final String SERVICE_NAME = "ContaClienteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.ContaClienteDTO,
      com.grpc.proto.ContaClienteDTO> getCadastrarContaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cadastrarConta",
      requestType = com.grpc.proto.ContaClienteDTO.class,
      responseType = com.grpc.proto.ContaClienteDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.ContaClienteDTO,
      com.grpc.proto.ContaClienteDTO> getCadastrarContaMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.ContaClienteDTO, com.grpc.proto.ContaClienteDTO> getCadastrarContaMethod;
    if ((getCadastrarContaMethod = ContaClienteServiceGrpc.getCadastrarContaMethod) == null) {
      synchronized (ContaClienteServiceGrpc.class) {
        if ((getCadastrarContaMethod = ContaClienteServiceGrpc.getCadastrarContaMethod) == null) {
          ContaClienteServiceGrpc.getCadastrarContaMethod = getCadastrarContaMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.ContaClienteDTO, com.grpc.proto.ContaClienteDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContaClienteService", "cadastrarConta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.ContaClienteDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.ContaClienteDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new ContaClienteServiceMethodDescriptorSupplier("cadastrarConta"))
                  .build();
          }
        }
     }
     return getCadastrarContaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.ContaRequest,
      com.grpc.proto.ContaClienteDTO> getObterContaClienteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterContaCliente",
      requestType = com.grpc.proto.ContaRequest.class,
      responseType = com.grpc.proto.ContaClienteDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.ContaRequest,
      com.grpc.proto.ContaClienteDTO> getObterContaClienteMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.ContaRequest, com.grpc.proto.ContaClienteDTO> getObterContaClienteMethod;
    if ((getObterContaClienteMethod = ContaClienteServiceGrpc.getObterContaClienteMethod) == null) {
      synchronized (ContaClienteServiceGrpc.class) {
        if ((getObterContaClienteMethod = ContaClienteServiceGrpc.getObterContaClienteMethod) == null) {
          ContaClienteServiceGrpc.getObterContaClienteMethod = getObterContaClienteMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.ContaRequest, com.grpc.proto.ContaClienteDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ContaClienteService", "obterContaCliente"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.ContaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.ContaClienteDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new ContaClienteServiceMethodDescriptorSupplier("obterContaCliente"))
                  .build();
          }
        }
     }
     return getObterContaClienteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContaClienteServiceStub newStub(io.grpc.Channel channel) {
    return new ContaClienteServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContaClienteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ContaClienteServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContaClienteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ContaClienteServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ContaClienteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void cadastrarConta(com.grpc.proto.ContaClienteDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.ContaClienteDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getCadastrarContaMethod(), responseObserver);
    }

    /**
     */
    public void obterContaCliente(com.grpc.proto.ContaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.ContaClienteDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getObterContaClienteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCadastrarContaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.ContaClienteDTO,
                com.grpc.proto.ContaClienteDTO>(
                  this, METHODID_CADASTRAR_CONTA)))
          .addMethod(
            getObterContaClienteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.ContaRequest,
                com.grpc.proto.ContaClienteDTO>(
                  this, METHODID_OBTER_CONTA_CLIENTE)))
          .build();
    }
  }

  /**
   */
  public static final class ContaClienteServiceStub extends io.grpc.stub.AbstractStub<ContaClienteServiceStub> {
    private ContaClienteServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContaClienteServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContaClienteServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContaClienteServiceStub(channel, callOptions);
    }

    /**
     */
    public void cadastrarConta(com.grpc.proto.ContaClienteDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.ContaClienteDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCadastrarContaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obterContaCliente(com.grpc.proto.ContaRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.ContaClienteDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterContaClienteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ContaClienteServiceBlockingStub extends io.grpc.stub.AbstractStub<ContaClienteServiceBlockingStub> {
    private ContaClienteServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContaClienteServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContaClienteServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContaClienteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.ContaClienteDTO cadastrarConta(com.grpc.proto.ContaClienteDTO request) {
      return blockingUnaryCall(
          getChannel(), getCadastrarContaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.ContaClienteDTO obterContaCliente(com.grpc.proto.ContaRequest request) {
      return blockingUnaryCall(
          getChannel(), getObterContaClienteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ContaClienteServiceFutureStub extends io.grpc.stub.AbstractStub<ContaClienteServiceFutureStub> {
    private ContaClienteServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContaClienteServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContaClienteServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContaClienteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.ContaClienteDTO> cadastrarConta(
        com.grpc.proto.ContaClienteDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getCadastrarContaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.ContaClienteDTO> obterContaCliente(
        com.grpc.proto.ContaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getObterContaClienteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CADASTRAR_CONTA = 0;
  private static final int METHODID_OBTER_CONTA_CLIENTE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContaClienteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContaClienteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CADASTRAR_CONTA:
          serviceImpl.cadastrarConta((com.grpc.proto.ContaClienteDTO) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.ContaClienteDTO>) responseObserver);
          break;
        case METHODID_OBTER_CONTA_CLIENTE:
          serviceImpl.obterContaCliente((com.grpc.proto.ContaRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.ContaClienteDTO>) responseObserver);
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

  private static abstract class ContaClienteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContaClienteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.ContaCliente.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContaClienteService");
    }
  }

  private static final class ContaClienteServiceFileDescriptorSupplier
      extends ContaClienteServiceBaseDescriptorSupplier {
    ContaClienteServiceFileDescriptorSupplier() {}
  }

  private static final class ContaClienteServiceMethodDescriptorSupplier
      extends ContaClienteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ContaClienteServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ContaClienteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContaClienteServiceFileDescriptorSupplier())
              .addMethod(getCadastrarContaMethod())
              .addMethod(getObterContaClienteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
