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
    comments = "Source: cliente.proto")
public final class ClienteServiceGrpc {

  private ClienteServiceGrpc() {}

  public static final String SERVICE_NAME = "ClienteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.ClienteDTO,
      com.grpc.proto.ClienteResponse> getSalvarClienteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "salvarCliente",
      requestType = com.grpc.proto.ClienteDTO.class,
      responseType = com.grpc.proto.ClienteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.ClienteDTO,
      com.grpc.proto.ClienteResponse> getSalvarClienteMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.ClienteDTO, com.grpc.proto.ClienteResponse> getSalvarClienteMethod;
    if ((getSalvarClienteMethod = ClienteServiceGrpc.getSalvarClienteMethod) == null) {
      synchronized (ClienteServiceGrpc.class) {
        if ((getSalvarClienteMethod = ClienteServiceGrpc.getSalvarClienteMethod) == null) {
          ClienteServiceGrpc.getSalvarClienteMethod = getSalvarClienteMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.ClienteDTO, com.grpc.proto.ClienteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClienteService", "salvarCliente"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.ClienteDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.ClienteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClienteServiceMethodDescriptorSupplier("salvarCliente"))
                  .build();
          }
        }
     }
     return getSalvarClienteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.ClienteRequest,
      com.grpc.proto.ClienteResponse> getObterPorIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterPorId",
      requestType = com.grpc.proto.ClienteRequest.class,
      responseType = com.grpc.proto.ClienteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.ClienteRequest,
      com.grpc.proto.ClienteResponse> getObterPorIdMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.ClienteRequest, com.grpc.proto.ClienteResponse> getObterPorIdMethod;
    if ((getObterPorIdMethod = ClienteServiceGrpc.getObterPorIdMethod) == null) {
      synchronized (ClienteServiceGrpc.class) {
        if ((getObterPorIdMethod = ClienteServiceGrpc.getObterPorIdMethod) == null) {
          ClienteServiceGrpc.getObterPorIdMethod = getObterPorIdMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.ClienteRequest, com.grpc.proto.ClienteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClienteService", "obterPorId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.ClienteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.ClienteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClienteServiceMethodDescriptorSupplier("obterPorId"))
                  .build();
          }
        }
     }
     return getObterPorIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.emptyCliente,
      com.grpc.proto.ClientesResponse> getObterClientesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterClientes",
      requestType = com.grpc.proto.emptyCliente.class,
      responseType = com.grpc.proto.ClientesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.emptyCliente,
      com.grpc.proto.ClientesResponse> getObterClientesMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.emptyCliente, com.grpc.proto.ClientesResponse> getObterClientesMethod;
    if ((getObterClientesMethod = ClienteServiceGrpc.getObterClientesMethod) == null) {
      synchronized (ClienteServiceGrpc.class) {
        if ((getObterClientesMethod = ClienteServiceGrpc.getObterClientesMethod) == null) {
          ClienteServiceGrpc.getObterClientesMethod = getObterClientesMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.emptyCliente, com.grpc.proto.ClientesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClienteService", "obterClientes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.emptyCliente.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.ClientesResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClienteServiceMethodDescriptorSupplier("obterClientes"))
                  .build();
          }
        }
     }
     return getObterClientesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClienteServiceStub newStub(io.grpc.Channel channel) {
    return new ClienteServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClienteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClienteServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClienteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClienteServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ClienteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void salvarCliente(com.grpc.proto.ClienteDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.ClienteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSalvarClienteMethod(), responseObserver);
    }

    /**
     */
    public void obterPorId(com.grpc.proto.ClienteRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.ClienteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObterPorIdMethod(), responseObserver);
    }

    /**
     */
    public void obterClientes(com.grpc.proto.emptyCliente request,
        io.grpc.stub.StreamObserver<com.grpc.proto.ClientesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObterClientesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSalvarClienteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.ClienteDTO,
                com.grpc.proto.ClienteResponse>(
                  this, METHODID_SALVAR_CLIENTE)))
          .addMethod(
            getObterPorIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.ClienteRequest,
                com.grpc.proto.ClienteResponse>(
                  this, METHODID_OBTER_POR_ID)))
          .addMethod(
            getObterClientesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.emptyCliente,
                com.grpc.proto.ClientesResponse>(
                  this, METHODID_OBTER_CLIENTES)))
          .build();
    }
  }

  /**
   */
  public static final class ClienteServiceStub extends io.grpc.stub.AbstractStub<ClienteServiceStub> {
    private ClienteServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClienteServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClienteServiceStub(channel, callOptions);
    }

    /**
     */
    public void salvarCliente(com.grpc.proto.ClienteDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.ClienteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSalvarClienteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obterPorId(com.grpc.proto.ClienteRequest request,
        io.grpc.stub.StreamObserver<com.grpc.proto.ClienteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterPorIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obterClientes(com.grpc.proto.emptyCliente request,
        io.grpc.stub.StreamObserver<com.grpc.proto.ClientesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterClientesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClienteServiceBlockingStub extends io.grpc.stub.AbstractStub<ClienteServiceBlockingStub> {
    private ClienteServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClienteServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClienteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.ClienteResponse salvarCliente(com.grpc.proto.ClienteDTO request) {
      return blockingUnaryCall(
          getChannel(), getSalvarClienteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.ClienteResponse obterPorId(com.grpc.proto.ClienteRequest request) {
      return blockingUnaryCall(
          getChannel(), getObterPorIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.ClientesResponse obterClientes(com.grpc.proto.emptyCliente request) {
      return blockingUnaryCall(
          getChannel(), getObterClientesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClienteServiceFutureStub extends io.grpc.stub.AbstractStub<ClienteServiceFutureStub> {
    private ClienteServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClienteServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClienteServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClienteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.ClienteResponse> salvarCliente(
        com.grpc.proto.ClienteDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getSalvarClienteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.ClienteResponse> obterPorId(
        com.grpc.proto.ClienteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getObterPorIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.ClientesResponse> obterClientes(
        com.grpc.proto.emptyCliente request) {
      return futureUnaryCall(
          getChannel().newCall(getObterClientesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SALVAR_CLIENTE = 0;
  private static final int METHODID_OBTER_POR_ID = 1;
  private static final int METHODID_OBTER_CLIENTES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClienteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClienteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SALVAR_CLIENTE:
          serviceImpl.salvarCliente((com.grpc.proto.ClienteDTO) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.ClienteResponse>) responseObserver);
          break;
        case METHODID_OBTER_POR_ID:
          serviceImpl.obterPorId((com.grpc.proto.ClienteRequest) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.ClienteResponse>) responseObserver);
          break;
        case METHODID_OBTER_CLIENTES:
          serviceImpl.obterClientes((com.grpc.proto.emptyCliente) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.ClientesResponse>) responseObserver);
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

  private static abstract class ClienteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClienteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.Cliente.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClienteService");
    }
  }

  private static final class ClienteServiceFileDescriptorSupplier
      extends ClienteServiceBaseDescriptorSupplier {
    ClienteServiceFileDescriptorSupplier() {}
  }

  private static final class ClienteServiceMethodDescriptorSupplier
      extends ClienteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClienteServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClienteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClienteServiceFileDescriptorSupplier())
              .addMethod(getSalvarClienteMethod())
              .addMethod(getObterPorIdMethod())
              .addMethod(getObterClientesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
