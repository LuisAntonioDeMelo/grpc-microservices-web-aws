// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pessoa.proto

package com.grpc.proto;

/**
 * Protobuf type {@code PessoaResponse}
 */
public  final class PessoaResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PessoaResponse)
    PessoaResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PessoaResponse.newBuilder() to construct.
  private PessoaResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PessoaResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PessoaResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.grpc.proto.PessoaDTO.Builder subBuilder = null;
            if (pessoa_ != null) {
              subBuilder = pessoa_.toBuilder();
            }
            pessoa_ = input.readMessage(com.grpc.proto.PessoaDTO.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pessoa_);
              pessoa_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.proto.Pessoa.internal_static_PessoaResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.proto.Pessoa.internal_static_PessoaResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.proto.PessoaResponse.class, com.grpc.proto.PessoaResponse.Builder.class);
  }

  public static final int PESSOA_FIELD_NUMBER = 1;
  private com.grpc.proto.PessoaDTO pessoa_;
  /**
   * <code>.PessoaDTO pessoa = 1;</code>
   */
  public boolean hasPessoa() {
    return pessoa_ != null;
  }
  /**
   * <code>.PessoaDTO pessoa = 1;</code>
   */
  public com.grpc.proto.PessoaDTO getPessoa() {
    return pessoa_ == null ? com.grpc.proto.PessoaDTO.getDefaultInstance() : pessoa_;
  }
  /**
   * <code>.PessoaDTO pessoa = 1;</code>
   */
  public com.grpc.proto.PessoaDTOOrBuilder getPessoaOrBuilder() {
    return getPessoa();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (pessoa_ != null) {
      output.writeMessage(1, getPessoa());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pessoa_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPessoa());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.grpc.proto.PessoaResponse)) {
      return super.equals(obj);
    }
    com.grpc.proto.PessoaResponse other = (com.grpc.proto.PessoaResponse) obj;

    boolean result = true;
    result = result && (hasPessoa() == other.hasPessoa());
    if (hasPessoa()) {
      result = result && getPessoa()
          .equals(other.getPessoa());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPessoa()) {
      hash = (37 * hash) + PESSOA_FIELD_NUMBER;
      hash = (53 * hash) + getPessoa().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.proto.PessoaResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.PessoaResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.PessoaResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.PessoaResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.PessoaResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.PessoaResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.PessoaResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.proto.PessoaResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.proto.PessoaResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.proto.PessoaResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.proto.PessoaResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.proto.PessoaResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.grpc.proto.PessoaResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code PessoaResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PessoaResponse)
      com.grpc.proto.PessoaResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.proto.Pessoa.internal_static_PessoaResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.proto.Pessoa.internal_static_PessoaResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.proto.PessoaResponse.class, com.grpc.proto.PessoaResponse.Builder.class);
    }

    // Construct using com.grpc.proto.PessoaResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (pessoaBuilder_ == null) {
        pessoa_ = null;
      } else {
        pessoa_ = null;
        pessoaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.proto.Pessoa.internal_static_PessoaResponse_descriptor;
    }

    @java.lang.Override
    public com.grpc.proto.PessoaResponse getDefaultInstanceForType() {
      return com.grpc.proto.PessoaResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.proto.PessoaResponse build() {
      com.grpc.proto.PessoaResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.proto.PessoaResponse buildPartial() {
      com.grpc.proto.PessoaResponse result = new com.grpc.proto.PessoaResponse(this);
      if (pessoaBuilder_ == null) {
        result.pessoa_ = pessoa_;
      } else {
        result.pessoa_ = pessoaBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.grpc.proto.PessoaResponse) {
        return mergeFrom((com.grpc.proto.PessoaResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.proto.PessoaResponse other) {
      if (other == com.grpc.proto.PessoaResponse.getDefaultInstance()) return this;
      if (other.hasPessoa()) {
        mergePessoa(other.getPessoa());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.grpc.proto.PessoaResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.proto.PessoaResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.grpc.proto.PessoaDTO pessoa_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.proto.PessoaDTO, com.grpc.proto.PessoaDTO.Builder, com.grpc.proto.PessoaDTOOrBuilder> pessoaBuilder_;
    /**
     * <code>.PessoaDTO pessoa = 1;</code>
     */
    public boolean hasPessoa() {
      return pessoaBuilder_ != null || pessoa_ != null;
    }
    /**
     * <code>.PessoaDTO pessoa = 1;</code>
     */
    public com.grpc.proto.PessoaDTO getPessoa() {
      if (pessoaBuilder_ == null) {
        return pessoa_ == null ? com.grpc.proto.PessoaDTO.getDefaultInstance() : pessoa_;
      } else {
        return pessoaBuilder_.getMessage();
      }
    }
    /**
     * <code>.PessoaDTO pessoa = 1;</code>
     */
    public Builder setPessoa(com.grpc.proto.PessoaDTO value) {
      if (pessoaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pessoa_ = value;
        onChanged();
      } else {
        pessoaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.PessoaDTO pessoa = 1;</code>
     */
    public Builder setPessoa(
        com.grpc.proto.PessoaDTO.Builder builderForValue) {
      if (pessoaBuilder_ == null) {
        pessoa_ = builderForValue.build();
        onChanged();
      } else {
        pessoaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.PessoaDTO pessoa = 1;</code>
     */
    public Builder mergePessoa(com.grpc.proto.PessoaDTO value) {
      if (pessoaBuilder_ == null) {
        if (pessoa_ != null) {
          pessoa_ =
            com.grpc.proto.PessoaDTO.newBuilder(pessoa_).mergeFrom(value).buildPartial();
        } else {
          pessoa_ = value;
        }
        onChanged();
      } else {
        pessoaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.PessoaDTO pessoa = 1;</code>
     */
    public Builder clearPessoa() {
      if (pessoaBuilder_ == null) {
        pessoa_ = null;
        onChanged();
      } else {
        pessoa_ = null;
        pessoaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.PessoaDTO pessoa = 1;</code>
     */
    public com.grpc.proto.PessoaDTO.Builder getPessoaBuilder() {
      
      onChanged();
      return getPessoaFieldBuilder().getBuilder();
    }
    /**
     * <code>.PessoaDTO pessoa = 1;</code>
     */
    public com.grpc.proto.PessoaDTOOrBuilder getPessoaOrBuilder() {
      if (pessoaBuilder_ != null) {
        return pessoaBuilder_.getMessageOrBuilder();
      } else {
        return pessoa_ == null ?
            com.grpc.proto.PessoaDTO.getDefaultInstance() : pessoa_;
      }
    }
    /**
     * <code>.PessoaDTO pessoa = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.grpc.proto.PessoaDTO, com.grpc.proto.PessoaDTO.Builder, com.grpc.proto.PessoaDTOOrBuilder> 
        getPessoaFieldBuilder() {
      if (pessoaBuilder_ == null) {
        pessoaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.grpc.proto.PessoaDTO, com.grpc.proto.PessoaDTO.Builder, com.grpc.proto.PessoaDTOOrBuilder>(
                getPessoa(),
                getParentForChildren(),
                isClean());
        pessoa_ = null;
      }
      return pessoaBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:PessoaResponse)
  }

  // @@protoc_insertion_point(class_scope:PessoaResponse)
  private static final com.grpc.proto.PessoaResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.proto.PessoaResponse();
  }

  public static com.grpc.proto.PessoaResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PessoaResponse>
      PARSER = new com.google.protobuf.AbstractParser<PessoaResponse>() {
    @java.lang.Override
    public PessoaResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PessoaResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PessoaResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PessoaResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.proto.PessoaResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

