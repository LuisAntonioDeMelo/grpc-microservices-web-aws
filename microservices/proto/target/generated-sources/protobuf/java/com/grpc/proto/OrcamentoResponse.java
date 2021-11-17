// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: orcamento.proto

package com.grpc.proto;

/**
 * Protobuf type {@code OrcamentoResponse}
 */
public  final class OrcamentoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OrcamentoResponse)
    OrcamentoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrcamentoResponse.newBuilder() to construct.
  private OrcamentoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrcamentoResponse() {
    orcamentos_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrcamentoResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              orcamentos_ = new java.util.ArrayList<com.grpc.proto.OrcamentoDTO>();
              mutable_bitField0_ |= 0x00000001;
            }
            orcamentos_.add(
                input.readMessage(com.grpc.proto.OrcamentoDTO.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        orcamentos_ = java.util.Collections.unmodifiableList(orcamentos_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.proto.Orcamento.internal_static_OrcamentoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.proto.Orcamento.internal_static_OrcamentoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.proto.OrcamentoResponse.class, com.grpc.proto.OrcamentoResponse.Builder.class);
  }

  public static final int ORCAMENTOS_FIELD_NUMBER = 1;
  private java.util.List<com.grpc.proto.OrcamentoDTO> orcamentos_;
  /**
   * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
   */
  public java.util.List<com.grpc.proto.OrcamentoDTO> getOrcamentosList() {
    return orcamentos_;
  }
  /**
   * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
   */
  public java.util.List<? extends com.grpc.proto.OrcamentoDTOOrBuilder> 
      getOrcamentosOrBuilderList() {
    return orcamentos_;
  }
  /**
   * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
   */
  public int getOrcamentosCount() {
    return orcamentos_.size();
  }
  /**
   * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
   */
  public com.grpc.proto.OrcamentoDTO getOrcamentos(int index) {
    return orcamentos_.get(index);
  }
  /**
   * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
   */
  public com.grpc.proto.OrcamentoDTOOrBuilder getOrcamentosOrBuilder(
      int index) {
    return orcamentos_.get(index);
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
    for (int i = 0; i < orcamentos_.size(); i++) {
      output.writeMessage(1, orcamentos_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < orcamentos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, orcamentos_.get(i));
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
    if (!(obj instanceof com.grpc.proto.OrcamentoResponse)) {
      return super.equals(obj);
    }
    com.grpc.proto.OrcamentoResponse other = (com.grpc.proto.OrcamentoResponse) obj;

    boolean result = true;
    result = result && getOrcamentosList()
        .equals(other.getOrcamentosList());
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
    if (getOrcamentosCount() > 0) {
      hash = (37 * hash) + ORCAMENTOS_FIELD_NUMBER;
      hash = (53 * hash) + getOrcamentosList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.proto.OrcamentoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.OrcamentoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.OrcamentoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.OrcamentoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.OrcamentoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.OrcamentoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.OrcamentoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.proto.OrcamentoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.proto.OrcamentoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.proto.OrcamentoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.proto.OrcamentoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.proto.OrcamentoResponse parseFrom(
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
  public static Builder newBuilder(com.grpc.proto.OrcamentoResponse prototype) {
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
   * Protobuf type {@code OrcamentoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OrcamentoResponse)
      com.grpc.proto.OrcamentoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.proto.Orcamento.internal_static_OrcamentoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.proto.Orcamento.internal_static_OrcamentoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.proto.OrcamentoResponse.class, com.grpc.proto.OrcamentoResponse.Builder.class);
    }

    // Construct using com.grpc.proto.OrcamentoResponse.newBuilder()
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
        getOrcamentosFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (orcamentosBuilder_ == null) {
        orcamentos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        orcamentosBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.proto.Orcamento.internal_static_OrcamentoResponse_descriptor;
    }

    @java.lang.Override
    public com.grpc.proto.OrcamentoResponse getDefaultInstanceForType() {
      return com.grpc.proto.OrcamentoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.proto.OrcamentoResponse build() {
      com.grpc.proto.OrcamentoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.proto.OrcamentoResponse buildPartial() {
      com.grpc.proto.OrcamentoResponse result = new com.grpc.proto.OrcamentoResponse(this);
      int from_bitField0_ = bitField0_;
      if (orcamentosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          orcamentos_ = java.util.Collections.unmodifiableList(orcamentos_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.orcamentos_ = orcamentos_;
      } else {
        result.orcamentos_ = orcamentosBuilder_.build();
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
      if (other instanceof com.grpc.proto.OrcamentoResponse) {
        return mergeFrom((com.grpc.proto.OrcamentoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.proto.OrcamentoResponse other) {
      if (other == com.grpc.proto.OrcamentoResponse.getDefaultInstance()) return this;
      if (orcamentosBuilder_ == null) {
        if (!other.orcamentos_.isEmpty()) {
          if (orcamentos_.isEmpty()) {
            orcamentos_ = other.orcamentos_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrcamentosIsMutable();
            orcamentos_.addAll(other.orcamentos_);
          }
          onChanged();
        }
      } else {
        if (!other.orcamentos_.isEmpty()) {
          if (orcamentosBuilder_.isEmpty()) {
            orcamentosBuilder_.dispose();
            orcamentosBuilder_ = null;
            orcamentos_ = other.orcamentos_;
            bitField0_ = (bitField0_ & ~0x00000001);
            orcamentosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrcamentosFieldBuilder() : null;
          } else {
            orcamentosBuilder_.addAllMessages(other.orcamentos_);
          }
        }
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
      com.grpc.proto.OrcamentoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.proto.OrcamentoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.grpc.proto.OrcamentoDTO> orcamentos_ =
      java.util.Collections.emptyList();
    private void ensureOrcamentosIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        orcamentos_ = new java.util.ArrayList<com.grpc.proto.OrcamentoDTO>(orcamentos_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.proto.OrcamentoDTO, com.grpc.proto.OrcamentoDTO.Builder, com.grpc.proto.OrcamentoDTOOrBuilder> orcamentosBuilder_;

    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public java.util.List<com.grpc.proto.OrcamentoDTO> getOrcamentosList() {
      if (orcamentosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(orcamentos_);
      } else {
        return orcamentosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public int getOrcamentosCount() {
      if (orcamentosBuilder_ == null) {
        return orcamentos_.size();
      } else {
        return orcamentosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public com.grpc.proto.OrcamentoDTO getOrcamentos(int index) {
      if (orcamentosBuilder_ == null) {
        return orcamentos_.get(index);
      } else {
        return orcamentosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public Builder setOrcamentos(
        int index, com.grpc.proto.OrcamentoDTO value) {
      if (orcamentosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrcamentosIsMutable();
        orcamentos_.set(index, value);
        onChanged();
      } else {
        orcamentosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public Builder setOrcamentos(
        int index, com.grpc.proto.OrcamentoDTO.Builder builderForValue) {
      if (orcamentosBuilder_ == null) {
        ensureOrcamentosIsMutable();
        orcamentos_.set(index, builderForValue.build());
        onChanged();
      } else {
        orcamentosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public Builder addOrcamentos(com.grpc.proto.OrcamentoDTO value) {
      if (orcamentosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrcamentosIsMutable();
        orcamentos_.add(value);
        onChanged();
      } else {
        orcamentosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public Builder addOrcamentos(
        int index, com.grpc.proto.OrcamentoDTO value) {
      if (orcamentosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrcamentosIsMutable();
        orcamentos_.add(index, value);
        onChanged();
      } else {
        orcamentosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public Builder addOrcamentos(
        com.grpc.proto.OrcamentoDTO.Builder builderForValue) {
      if (orcamentosBuilder_ == null) {
        ensureOrcamentosIsMutable();
        orcamentos_.add(builderForValue.build());
        onChanged();
      } else {
        orcamentosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public Builder addOrcamentos(
        int index, com.grpc.proto.OrcamentoDTO.Builder builderForValue) {
      if (orcamentosBuilder_ == null) {
        ensureOrcamentosIsMutable();
        orcamentos_.add(index, builderForValue.build());
        onChanged();
      } else {
        orcamentosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public Builder addAllOrcamentos(
        java.lang.Iterable<? extends com.grpc.proto.OrcamentoDTO> values) {
      if (orcamentosBuilder_ == null) {
        ensureOrcamentosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, orcamentos_);
        onChanged();
      } else {
        orcamentosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public Builder clearOrcamentos() {
      if (orcamentosBuilder_ == null) {
        orcamentos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        orcamentosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public Builder removeOrcamentos(int index) {
      if (orcamentosBuilder_ == null) {
        ensureOrcamentosIsMutable();
        orcamentos_.remove(index);
        onChanged();
      } else {
        orcamentosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public com.grpc.proto.OrcamentoDTO.Builder getOrcamentosBuilder(
        int index) {
      return getOrcamentosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public com.grpc.proto.OrcamentoDTOOrBuilder getOrcamentosOrBuilder(
        int index) {
      if (orcamentosBuilder_ == null) {
        return orcamentos_.get(index);  } else {
        return orcamentosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public java.util.List<? extends com.grpc.proto.OrcamentoDTOOrBuilder> 
         getOrcamentosOrBuilderList() {
      if (orcamentosBuilder_ != null) {
        return orcamentosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(orcamentos_);
      }
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public com.grpc.proto.OrcamentoDTO.Builder addOrcamentosBuilder() {
      return getOrcamentosFieldBuilder().addBuilder(
          com.grpc.proto.OrcamentoDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public com.grpc.proto.OrcamentoDTO.Builder addOrcamentosBuilder(
        int index) {
      return getOrcamentosFieldBuilder().addBuilder(
          index, com.grpc.proto.OrcamentoDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .OrcamentoDTO orcamentos = 1;</code>
     */
    public java.util.List<com.grpc.proto.OrcamentoDTO.Builder> 
         getOrcamentosBuilderList() {
      return getOrcamentosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.proto.OrcamentoDTO, com.grpc.proto.OrcamentoDTO.Builder, com.grpc.proto.OrcamentoDTOOrBuilder> 
        getOrcamentosFieldBuilder() {
      if (orcamentosBuilder_ == null) {
        orcamentosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.grpc.proto.OrcamentoDTO, com.grpc.proto.OrcamentoDTO.Builder, com.grpc.proto.OrcamentoDTOOrBuilder>(
                orcamentos_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        orcamentos_ = null;
      }
      return orcamentosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:OrcamentoResponse)
  }

  // @@protoc_insertion_point(class_scope:OrcamentoResponse)
  private static final com.grpc.proto.OrcamentoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.proto.OrcamentoResponse();
  }

  public static com.grpc.proto.OrcamentoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrcamentoResponse>
      PARSER = new com.google.protobuf.AbstractParser<OrcamentoResponse>() {
    @java.lang.Override
    public OrcamentoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrcamentoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrcamentoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrcamentoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.proto.OrcamentoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
