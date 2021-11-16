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
    comments = "Source: categoria.proto")
public final class CategoriaServiceGrpc {

  private CategoriaServiceGrpc() {}

  public static final String SERVICE_NAME = "CategoriaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.CategoriaDTO,
      com.grpc.proto.CategoriaDTO> getSalvarCategoriaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "salvarCategoria",
      requestType = com.grpc.proto.CategoriaDTO.class,
      responseType = com.grpc.proto.CategoriaDTO.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.CategoriaDTO,
      com.grpc.proto.CategoriaDTO> getSalvarCategoriaMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.CategoriaDTO, com.grpc.proto.CategoriaDTO> getSalvarCategoriaMethod;
    if ((getSalvarCategoriaMethod = CategoriaServiceGrpc.getSalvarCategoriaMethod) == null) {
      synchronized (CategoriaServiceGrpc.class) {
        if ((getSalvarCategoriaMethod = CategoriaServiceGrpc.getSalvarCategoriaMethod) == null) {
          CategoriaServiceGrpc.getSalvarCategoriaMethod = getSalvarCategoriaMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.CategoriaDTO, com.grpc.proto.CategoriaDTO>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CategoriaService", "salvarCategoria"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.CategoriaDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.CategoriaDTO.getDefaultInstance()))
                  .setSchemaDescriptor(new CategoriaServiceMethodDescriptorSupplier("salvarCategoria"))
                  .build();
          }
        }
     }
     return getSalvarCategoriaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.grpc.proto.emptyCategoria,
      com.grpc.proto.categoriasResponse> getObterCategoriasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "obterCategorias",
      requestType = com.grpc.proto.emptyCategoria.class,
      responseType = com.grpc.proto.categoriasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.grpc.proto.emptyCategoria,
      com.grpc.proto.categoriasResponse> getObterCategoriasMethod() {
    io.grpc.MethodDescriptor<com.grpc.proto.emptyCategoria, com.grpc.proto.categoriasResponse> getObterCategoriasMethod;
    if ((getObterCategoriasMethod = CategoriaServiceGrpc.getObterCategoriasMethod) == null) {
      synchronized (CategoriaServiceGrpc.class) {
        if ((getObterCategoriasMethod = CategoriaServiceGrpc.getObterCategoriasMethod) == null) {
          CategoriaServiceGrpc.getObterCategoriasMethod = getObterCategoriasMethod = 
              io.grpc.MethodDescriptor.<com.grpc.proto.emptyCategoria, com.grpc.proto.categoriasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CategoriaService", "obterCategorias"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.emptyCategoria.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.grpc.proto.categoriasResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CategoriaServiceMethodDescriptorSupplier("obterCategorias"))
                  .build();
          }
        }
     }
     return getObterCategoriasMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CategoriaServiceStub newStub(io.grpc.Channel channel) {
    return new CategoriaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CategoriaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CategoriaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CategoriaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CategoriaServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CategoriaServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void salvarCategoria(com.grpc.proto.CategoriaDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.CategoriaDTO> responseObserver) {
      asyncUnimplementedUnaryCall(getSalvarCategoriaMethod(), responseObserver);
    }

    /**
     */
    public void obterCategorias(com.grpc.proto.emptyCategoria request,
        io.grpc.stub.StreamObserver<com.grpc.proto.categoriasResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObterCategoriasMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSalvarCategoriaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.CategoriaDTO,
                com.grpc.proto.CategoriaDTO>(
                  this, METHODID_SALVAR_CATEGORIA)))
          .addMethod(
            getObterCategoriasMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.grpc.proto.emptyCategoria,
                com.grpc.proto.categoriasResponse>(
                  this, METHODID_OBTER_CATEGORIAS)))
          .build();
    }
  }

  /**
   */
  public static final class CategoriaServiceStub extends io.grpc.stub.AbstractStub<CategoriaServiceStub> {
    private CategoriaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CategoriaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoriaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CategoriaServiceStub(channel, callOptions);
    }

    /**
     */
    public void salvarCategoria(com.grpc.proto.CategoriaDTO request,
        io.grpc.stub.StreamObserver<com.grpc.proto.CategoriaDTO> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSalvarCategoriaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void obterCategorias(com.grpc.proto.emptyCategoria request,
        io.grpc.stub.StreamObserver<com.grpc.proto.categoriasResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObterCategoriasMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CategoriaServiceBlockingStub extends io.grpc.stub.AbstractStub<CategoriaServiceBlockingStub> {
    private CategoriaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CategoriaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoriaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CategoriaServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.grpc.proto.CategoriaDTO salvarCategoria(com.grpc.proto.CategoriaDTO request) {
      return blockingUnaryCall(
          getChannel(), getSalvarCategoriaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.grpc.proto.categoriasResponse obterCategorias(com.grpc.proto.emptyCategoria request) {
      return blockingUnaryCall(
          getChannel(), getObterCategoriasMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CategoriaServiceFutureStub extends io.grpc.stub.AbstractStub<CategoriaServiceFutureStub> {
    private CategoriaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CategoriaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CategoriaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CategoriaServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.CategoriaDTO> salvarCategoria(
        com.grpc.proto.CategoriaDTO request) {
      return futureUnaryCall(
          getChannel().newCall(getSalvarCategoriaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.grpc.proto.categoriasResponse> obterCategorias(
        com.grpc.proto.emptyCategoria request) {
      return futureUnaryCall(
          getChannel().newCall(getObterCategoriasMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SALVAR_CATEGORIA = 0;
  private static final int METHODID_OBTER_CATEGORIAS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CategoriaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CategoriaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SALVAR_CATEGORIA:
          serviceImpl.salvarCategoria((com.grpc.proto.CategoriaDTO) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.CategoriaDTO>) responseObserver);
          break;
        case METHODID_OBTER_CATEGORIAS:
          serviceImpl.obterCategorias((com.grpc.proto.emptyCategoria) request,
              (io.grpc.stub.StreamObserver<com.grpc.proto.categoriasResponse>) responseObserver);
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

  private static abstract class CategoriaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CategoriaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.grpc.proto.Categoria.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CategoriaService");
    }
  }

  private static final class CategoriaServiceFileDescriptorSupplier
      extends CategoriaServiceBaseDescriptorSupplier {
    CategoriaServiceFileDescriptorSupplier() {}
  }

  private static final class CategoriaServiceMethodDescriptorSupplier
      extends CategoriaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CategoriaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CategoriaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CategoriaServiceFileDescriptorSupplier())
              .addMethod(getSalvarCategoriaMethod())
              .addMethod(getObterCategoriasMethod())
              .build();
        }
      }
    }
    return result;
  }
}
