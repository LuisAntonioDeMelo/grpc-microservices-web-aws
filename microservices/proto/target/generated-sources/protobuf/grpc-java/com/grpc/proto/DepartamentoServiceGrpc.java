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
    comments = "Source: departamento.proto")
public final class DepartamentoServiceGrpc {

  private DepartamentoServiceGrpc() {}

  public static final String SERVICE_NAME = "DepartamentoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.DepartamentoDTO,
      com.grpc.proto.DepartamentoDTO> getSalvarDepartamentoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "salvarDepartamento",
      requestType = com.grpc.proto.DepartamentoDTO.class,
      responseType = com.grpc.proto.DepartamentoDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.DepartamentoDTO,
      com.grpc.proto.DepartamentoDTO> getSalvarDepartamentoMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.DepartamentoDTO, com.grpc.proto.DepartamentoDTO> getSalvarDepartamentoMethod;
    if ((getSalvarDepartamentoMethod = DepartamentoServiceGrpc.getSalvarDepartamentoMethod) == null) {
      synchronized (DepartamentoServiceGrpc.class) {
        if ((getSalvarDepartamentoMethod = DepartamentoServiceGrpc.getSalvarDepartamentoMethod) == null) {
          DepartamentoServiceGrpc.getSalvarDepartamentoMethod = getSalvarDepartamentoMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.DepartamentoDTO, com.grpc.proto.DepartamentoDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DepartamentoService", "salvarDepartamento"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.DepartamentoDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.DepartamentoDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartamentoServiceMethodDescriptorSupplier("salvarDepartamento"))
                  .build();
          }
        }
     }
     return getSalvarDepartamentoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.emptyDepartamento,
      com.grpc.proto.DepartamentoResponse> getObterDepartamentosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterDepartamentos",
      requestType = com.grpc.proto.emptyDepartamento.class,
      responseType = com.grpc.proto.DepartamentoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.emptyDepartamento,
      com.grpc.proto.DepartamentoResponse> getObterDepartamentosMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.emptyDepartamento, com.grpc.proto.DepartamentoResponse> getObterDepartamentosMethod;
    if ((getObterDepartamentosMethod = DepartamentoServiceGrpc.getObterDepartamentosMethod) == null) {
      synchronized (DepartamentoServiceGrpc.class) {
        if ((getObterDepartamentosMethod = DepartamentoServiceGrpc.getObterDepartamentosMethod) == null) {
          DepartamentoServiceGrpc.getObterDepartamentosMethod = getObterDepartamentosMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.emptyDepartamento, com.grpc.proto.DepartamentoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DepartamentoService", "obterDepartamentos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.emptyDepartamento.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.DepartamentoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DepartamentoServiceMethodDescriptorSupplier("obterDepartamentos"))
                  .build();
          }
        }
     }
     return getObterDepartamentosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DepartamentoServiceStub newStub(io.grpc.Channel channel) {
    return new DepartamentoServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DepartamentoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DepartamentoServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DepartamentoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DepartamentoServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DepartamentoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void salvarDepartamento(com.grpc.proto.DepartamentoDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.DepartamentoDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getSalvarDepartamentoMethod(), responseObserver);
    }

    /**
     */
    public void obterDepartamentos(com.grpc.proto.emptyDepartamento request,
        io.grpc.stub.StreamObserver<com.grpc.proto.DepartamentoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObterDepartamentosMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSalvarDepartamentoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.DepartamentoDTO,
                com.grpc.proto.DepartamentoDTO>(
                  this, METHODID_SALVAR_DEPARTAMENTO)))
          .addMethod(
            getObterDepartamentosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.emptyDepartamento,
                com.grpc.proto.DepartamentoResponse>(
                  this, METHODID_OBTER_DEPARTAMENTOS)))
          .build();
    }
  }

  /**
   */
  public static final class DepartamentoServiceStub extends io.grpc.stub.AbstractStub<DepartamentoServiceStub> {
    private DepartamentoServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartamentoServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartamentoServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartamentoServiceStub(channel, callOptions);
    }

    /**
     */
    public void salvarDepartamento(com.grpc.proto.DepartamentoDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.DepartamentoDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSalvarDepartamentoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obterDepartamentos(com.grpc.proto.emptyDepartamento request,
        io.grpc.stub.StreamObserver<com.grpc.proto.DepartamentoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterDepartamentosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DepartamentoServiceBlockingStub extends io.grpc.stub.AbstractStub<DepartamentoServiceBlockingStub> {
    private DepartamentoServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartamentoServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartamentoServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartamentoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.DepartamentoDTO salvarDepartamento(com.grpc.proto.DepartamentoDTO request) {
      return blockingUnaryCall(
          getChannel(), getSalvarDepartamentoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.DepartamentoResponse obterDepartamentos(com.grpc.proto.emptyDepartamento request) {
      return blockingUnaryCall(
          getChannel(), getObterDepartamentosMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DepartamentoServiceFutureStub extends io.grpc.stub.AbstractStub<DepartamentoServiceFutureStub> {
    private DepartamentoServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartamentoServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartamentoServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartamentoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.DepartamentoDTO> salvarDepartamento(
        com.grpc.proto.DepartamentoDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getSalvarDepartamentoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.DepartamentoResponse> obterDepartamentos(
        com.grpc.proto.emptyDepartamento request) {
      return futureUnaryCall(
          getChannel().newCall(getObterDepartamentosMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SALVAR_DEPARTAMENTO = 0;
  private static final int METHODID_OBTER_DEPARTAMENTOS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DepartamentoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DepartamentoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SALVAR_DEPARTAMENTO:
          serviceImpl.salvarDepartamento((com.grpc.proto.DepartamentoDTO) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.DepartamentoDTO>) responseObserver);
          break;
        case METHODID_OBTER_DEPARTAMENTOS:
          serviceImpl.obterDepartamentos((com.grpc.proto.emptyDepartamento) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.DepartamentoResponse>) responseObserver);
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

  private static abstract class DepartamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DepartamentoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.Departamento.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DepartamentoService");
    }
  }

  private static final class DepartamentoServiceFileDescriptorSupplier
      extends DepartamentoServiceBaseDescriptorSupplier {
    DepartamentoServiceFileDescriptorSupplier() {}
  }

  private static final class DepartamentoServiceMethodDescriptorSupplier
      extends DepartamentoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DepartamentoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DepartamentoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DepartamentoServiceFileDescriptorSupplier())
              .addMethod(getSalvarDepartamentoMethod())
              .addMethod(getObterDepartamentosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
