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
    comments = "Source: cargo.proto")
public final class CargoServiceGrpc {

  private CargoServiceGrpc() {}

  public static final String SERVICE_NAME = "CargoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.cargoDTO,
      com.grpc.proto.cargoDTO> getSalvarCargoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "salvarCargo",
      requestType = com.grpc.proto.cargoDTO.class,
      responseType = com.grpc.proto.cargoDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.cargoDTO,
      com.grpc.proto.cargoDTO> getSalvarCargoMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.cargoDTO, com.grpc.proto.cargoDTO> getSalvarCargoMethod;
    if ((getSalvarCargoMethod = CargoServiceGrpc.getSalvarCargoMethod) == null) {
      synchronized (CargoServiceGrpc.class) {
        if ((getSalvarCargoMethod = CargoServiceGrpc.getSalvarCargoMethod) == null) {
          CargoServiceGrpc.getSalvarCargoMethod = getSalvarCargoMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.cargoDTO, com.grpc.proto.cargoDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CargoService", "salvarCargo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.cargoDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.cargoDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new CargoServiceMethodDescriptorSupplier("salvarCargo"))
                  .build();
          }
        }
     }
     return getSalvarCargoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.emptyCargo,
      com.grpc.proto.cargoResponse> getObterCargossMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterCargoss",
      requestType = com.grpc.proto.emptyCargo.class,
      responseType = com.grpc.proto.cargoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.emptyCargo,
      com.grpc.proto.cargoResponse> getObterCargossMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.emptyCargo, com.grpc.proto.cargoResponse> getObterCargossMethod;
    if ((getObterCargossMethod = CargoServiceGrpc.getObterCargossMethod) == null) {
      synchronized (CargoServiceGrpc.class) {
        if ((getObterCargossMethod = CargoServiceGrpc.getObterCargossMethod) == null) {
          CargoServiceGrpc.getObterCargossMethod = getObterCargossMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.emptyCargo, com.grpc.proto.cargoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CargoService", "obterCargoss"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.emptyCargo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.cargoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CargoServiceMethodDescriptorSupplier("obterCargoss"))
                  .build();
          }
        }
     }
     return getObterCargossMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CargoServiceStub newStub(io.grpc.Channel channel) {
    return new CargoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CargoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CargoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CargoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CargoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CargoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void salvarCargo(com.grpc.proto.cargoDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.cargoDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getSalvarCargoMethod(), responseObserver);
    }

    /**
     */
    public void obterCargoss(com.grpc.proto.emptyCargo request,
        io.grpc.stub.StreamObserver<com.grpc.proto.cargoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObterCargossMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSalvarCargoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.cargoDTO,
                com.grpc.proto.cargoDTO>(
                  this, METHODID_SALVAR_CARGO)))
          .addMethod(
            getObterCargossMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.emptyCargo,
                com.grpc.proto.cargoResponse>(
                  this, METHODID_OBTER_CARGOSS)))
          .build();
    }
  }

  /**
   */
  public static final class CargoServiceStub extends io.grpc.stub.AbstractStub<CargoServiceStub> {
    private CargoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CargoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CargoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CargoServiceStub(channel, callOptions);
    }

    /**
     */
    public void salvarCargo(com.grpc.proto.cargoDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.cargoDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSalvarCargoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obterCargoss(com.grpc.proto.emptyCargo request,
        io.grpc.stub.StreamObserver<com.grpc.proto.cargoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterCargossMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CargoServiceBlockingStub extends io.grpc.stub.AbstractStub<CargoServiceBlockingStub> {
    private CargoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CargoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CargoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CargoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.cargoDTO salvarCargo(com.grpc.proto.cargoDTO request) {
      return blockingUnaryCall(
          getChannel(), getSalvarCargoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.cargoResponse obterCargoss(com.grpc.proto.emptyCargo request) {
      return blockingUnaryCall(
          getChannel(), getObterCargossMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CargoServiceFutureStub extends io.grpc.stub.AbstractStub<CargoServiceFutureStub> {
    private CargoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CargoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CargoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CargoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.cargoDTO> salvarCargo(
        com.grpc.proto.cargoDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getSalvarCargoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.cargoResponse> obterCargoss(
        com.grpc.proto.emptyCargo request) {
      return futureUnaryCall(
          getChannel().newCall(getObterCargossMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SALVAR_CARGO = 0;
  private static final int METHODID_OBTER_CARGOSS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CargoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CargoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SALVAR_CARGO:
          serviceImpl.salvarCargo((com.grpc.proto.cargoDTO) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.cargoDTO>) responseObserver);
          break;
        case METHODID_OBTER_CARGOSS:
          serviceImpl.obterCargoss((com.grpc.proto.emptyCargo) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.cargoResponse>) responseObserver);
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

  private static abstract class CargoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CargoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.Cargo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CargoService");
    }
  }

  private static final class CargoServiceFileDescriptorSupplier
      extends CargoServiceBaseDescriptorSupplier {
    CargoServiceFileDescriptorSupplier() {}
  }

  private static final class CargoServiceMethodDescriptorSupplier
      extends CargoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CargoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CargoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CargoServiceFileDescriptorSupplier())
              .addMethod(getSalvarCargoMethod())
              .addMethod(getObterCargossMethod())
              .build();
        }
      }
    }
    return result;
  }
}
