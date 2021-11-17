// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lancamento-service.proto

package com.grpc.proto;

/**
 * Protobuf type {@code PesquisaLancamentorResponse}
 */
public  final class PesquisaLancamentorResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PesquisaLancamentorResponse)
    PesquisaLancamentorResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PesquisaLancamentorResponse.newBuilder() to construct.
  private PesquisaLancamentorResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PesquisaLancamentorResponse() {
    lancamentos_ = java.util.Collections.emptyList();
    pageNumber_ = 0;
    resultPerPage_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PesquisaLancamentorResponse(
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
              lancamentos_ = new java.util.ArrayList<com.grpc.proto.LancamentoDTO>();
              mutable_bitField0_ |= 0x00000001;
            }
            lancamentos_.add(
                input.readMessage(com.grpc.proto.LancamentoDTO.parser(), extensionRegistry));
            break;
          }
          case 16: {

            pageNumber_ = input.readInt32();
            break;
          }
          case 24: {

            resultPerPage_ = input.readInt32();
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
        lancamentos_ = java.util.Collections.unmodifiableList(lancamentos_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.grpc.proto.LancamentoServiceOuterClass.internal_static_PesquisaLancamentorResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.grpc.proto.LancamentoServiceOuterClass.internal_static_PesquisaLancamentorResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.grpc.proto.PesquisaLancamentorResponse.class, com.grpc.proto.PesquisaLancamentorResponse.Builder.class);
  }

  private int bitField0_;
  public static final int LANCAMENTOS_FIELD_NUMBER = 1;
  private java.util.List<com.grpc.proto.LancamentoDTO> lancamentos_;
  /**
   * <code>repeated .LancamentoDTO lancamentos = 1;</code>
   */
  public java.util.List<com.grpc.proto.LancamentoDTO> getLancamentosList() {
    return lancamentos_;
  }
  /**
   * <code>repeated .LancamentoDTO lancamentos = 1;</code>
   */
  public java.util.List<? extends com.grpc.proto.LancamentoDTOOrBuilder> 
      getLancamentosOrBuilderList() {
    return lancamentos_;
  }
  /**
   * <code>repeated .LancamentoDTO lancamentos = 1;</code>
   */
  public int getLancamentosCount() {
    return lancamentos_.size();
  }
  /**
   * <code>repeated .LancamentoDTO lancamentos = 1;</code>
   */
  public com.grpc.proto.LancamentoDTO getLancamentos(int index) {
    return lancamentos_.get(index);
  }
  /**
   * <code>repeated .LancamentoDTO lancamentos = 1;</code>
   */
  public com.grpc.proto.LancamentoDTOOrBuilder getLancamentosOrBuilder(
      int index) {
    return lancamentos_.get(index);
  }

  public static final int PAGE_NUMBER_FIELD_NUMBER = 2;
  private int pageNumber_;
  /**
   * <code>int32 page_number = 2;</code>
   */
  public int getPageNumber() {
    return pageNumber_;
  }

  public static final int RESULT_PER_PAGE_FIELD_NUMBER = 3;
  private int resultPerPage_;
  /**
   * <code>int32 result_per_page = 3;</code>
   */
  public int getResultPerPage() {
    return resultPerPage_;
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
    for (int i = 0; i < lancamentos_.size(); i++) {
      output.writeMessage(1, lancamentos_.get(i));
    }
    if (pageNumber_ != 0) {
      output.writeInt32(2, pageNumber_);
    }
    if (resultPerPage_ != 0) {
      output.writeInt32(3, resultPerPage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < lancamentos_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, lancamentos_.get(i));
    }
    if (pageNumber_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, pageNumber_);
    }
    if (resultPerPage_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, resultPerPage_);
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
    if (!(obj instanceof com.grpc.proto.PesquisaLancamentorResponse)) {
      return super.equals(obj);
    }
    com.grpc.proto.PesquisaLancamentorResponse other = (com.grpc.proto.PesquisaLancamentorResponse) obj;

    boolean result = true;
    result = result && getLancamentosList()
        .equals(other.getLancamentosList());
    result = result && (getPageNumber()
        == other.getPageNumber());
    result = result && (getResultPerPage()
        == other.getResultPerPage());
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
    if (getLancamentosCount() > 0) {
      hash = (37 * hash) + LANCAMENTOS_FIELD_NUMBER;
      hash = (53 * hash) + getLancamentosList().hashCode();
    }
    hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPageNumber();
    hash = (37 * hash) + RESULT_PER_PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getResultPerPage();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.grpc.proto.PesquisaLancamentorResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.PesquisaLancamentorResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.PesquisaLancamentorResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.PesquisaLancamentorResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.PesquisaLancamentorResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.grpc.proto.PesquisaLancamentorResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.grpc.proto.PesquisaLancamentorResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.proto.PesquisaLancamentorResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.proto.PesquisaLancamentorResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.grpc.proto.PesquisaLancamentorResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.grpc.proto.PesquisaLancamentorResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.grpc.proto.PesquisaLancamentorResponse parseFrom(
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
  public static Builder newBuilder(com.grpc.proto.PesquisaLancamentorResponse prototype) {
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
   * Protobuf type {@code PesquisaLancamentorResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PesquisaLancamentorResponse)
      com.grpc.proto.PesquisaLancamentorResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.grpc.proto.LancamentoServiceOuterClass.internal_static_PesquisaLancamentorResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.grpc.proto.LancamentoServiceOuterClass.internal_static_PesquisaLancamentorResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.grpc.proto.PesquisaLancamentorResponse.class, com.grpc.proto.PesquisaLancamentorResponse.Builder.class);
    }

    // Construct using com.grpc.proto.PesquisaLancamentorResponse.newBuilder()
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
        getLancamentosFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (lancamentosBuilder_ == null) {
        lancamentos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        lancamentosBuilder_.clear();
      }
      pageNumber_ = 0;

      resultPerPage_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.grpc.proto.LancamentoServiceOuterClass.internal_static_PesquisaLancamentorResponse_descriptor;
    }

    @java.lang.Override
    public com.grpc.proto.PesquisaLancamentorResponse getDefaultInstanceForType() {
      return com.grpc.proto.PesquisaLancamentorResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.grpc.proto.PesquisaLancamentorResponse build() {
      com.grpc.proto.PesquisaLancamentorResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.grpc.proto.PesquisaLancamentorResponse buildPartial() {
      com.grpc.proto.PesquisaLancamentorResponse result = new com.grpc.proto.PesquisaLancamentorResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (lancamentosBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          lancamentos_ = java.util.Collections.unmodifiableList(lancamentos_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lancamentos_ = lancamentos_;
      } else {
        result.lancamentos_ = lancamentosBuilder_.build();
      }
      result.pageNumber_ = pageNumber_;
      result.resultPerPage_ = resultPerPage_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.grpc.proto.PesquisaLancamentorResponse) {
        return mergeFrom((com.grpc.proto.PesquisaLancamentorResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.grpc.proto.PesquisaLancamentorResponse other) {
      if (other == com.grpc.proto.PesquisaLancamentorResponse.getDefaultInstance()) return this;
      if (lancamentosBuilder_ == null) {
        if (!other.lancamentos_.isEmpty()) {
          if (lancamentos_.isEmpty()) {
            lancamentos_ = other.lancamentos_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLancamentosIsMutable();
            lancamentos_.addAll(other.lancamentos_);
          }
          onChanged();
        }
      } else {
        if (!other.lancamentos_.isEmpty()) {
          if (lancamentosBuilder_.isEmpty()) {
            lancamentosBuilder_.dispose();
            lancamentosBuilder_ = null;
            lancamentos_ = other.lancamentos_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lancamentosBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLancamentosFieldBuilder() : null;
          } else {
            lancamentosBuilder_.addAllMessages(other.lancamentos_);
          }
        }
      }
      if (other.getPageNumber() != 0) {
        setPageNumber(other.getPageNumber());
      }
      if (other.getResultPerPage() != 0) {
        setResultPerPage(other.getResultPerPage());
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
      com.grpc.proto.PesquisaLancamentorResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.grpc.proto.PesquisaLancamentorResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.grpc.proto.LancamentoDTO> lancamentos_ =
      java.util.Collections.emptyList();
    private void ensureLancamentosIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        lancamentos_ = new java.util.ArrayList<com.grpc.proto.LancamentoDTO>(lancamentos_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.proto.LancamentoDTO, com.grpc.proto.LancamentoDTO.Builder, com.grpc.proto.LancamentoDTOOrBuilder> lancamentosBuilder_;

    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public java.util.List<com.grpc.proto.LancamentoDTO> getLancamentosList() {
      if (lancamentosBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lancamentos_);
      } else {
        return lancamentosBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public int getLancamentosCount() {
      if (lancamentosBuilder_ == null) {
        return lancamentos_.size();
      } else {
        return lancamentosBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public com.grpc.proto.LancamentoDTO getLancamentos(int index) {
      if (lancamentosBuilder_ == null) {
        return lancamentos_.get(index);
      } else {
        return lancamentosBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public Builder setLancamentos(
        int index, com.grpc.proto.LancamentoDTO value) {
      if (lancamentosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLancamentosIsMutable();
        lancamentos_.set(index, value);
        onChanged();
      } else {
        lancamentosBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public Builder setLancamentos(
        int index, com.grpc.proto.LancamentoDTO.Builder builderForValue) {
      if (lancamentosBuilder_ == null) {
        ensureLancamentosIsMutable();
        lancamentos_.set(index, builderForValue.build());
        onChanged();
      } else {
        lancamentosBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public Builder addLancamentos(com.grpc.proto.LancamentoDTO value) {
      if (lancamentosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLancamentosIsMutable();
        lancamentos_.add(value);
        onChanged();
      } else {
        lancamentosBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public Builder addLancamentos(
        int index, com.grpc.proto.LancamentoDTO value) {
      if (lancamentosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLancamentosIsMutable();
        lancamentos_.add(index, value);
        onChanged();
      } else {
        lancamentosBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public Builder addLancamentos(
        com.grpc.proto.LancamentoDTO.Builder builderForValue) {
      if (lancamentosBuilder_ == null) {
        ensureLancamentosIsMutable();
        lancamentos_.add(builderForValue.build());
        onChanged();
      } else {
        lancamentosBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public Builder addLancamentos(
        int index, com.grpc.proto.LancamentoDTO.Builder builderForValue) {
      if (lancamentosBuilder_ == null) {
        ensureLancamentosIsMutable();
        lancamentos_.add(index, builderForValue.build());
        onChanged();
      } else {
        lancamentosBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public Builder addAllLancamentos(
        java.lang.Iterable<? extends com.grpc.proto.LancamentoDTO> values) {
      if (lancamentosBuilder_ == null) {
        ensureLancamentosIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lancamentos_);
        onChanged();
      } else {
        lancamentosBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public Builder clearLancamentos() {
      if (lancamentosBuilder_ == null) {
        lancamentos_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lancamentosBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public Builder removeLancamentos(int index) {
      if (lancamentosBuilder_ == null) {
        ensureLancamentosIsMutable();
        lancamentos_.remove(index);
        onChanged();
      } else {
        lancamentosBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public com.grpc.proto.LancamentoDTO.Builder getLancamentosBuilder(
        int index) {
      return getLancamentosFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public com.grpc.proto.LancamentoDTOOrBuilder getLancamentosOrBuilder(
        int index) {
      if (lancamentosBuilder_ == null) {
        return lancamentos_.get(index);  } else {
        return lancamentosBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public java.util.List<? extends com.grpc.proto.LancamentoDTOOrBuilder> 
         getLancamentosOrBuilderList() {
      if (lancamentosBuilder_ != null) {
        return lancamentosBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lancamentos_);
      }
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public com.grpc.proto.LancamentoDTO.Builder addLancamentosBuilder() {
      return getLancamentosFieldBuilder().addBuilder(
          com.grpc.proto.LancamentoDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public com.grpc.proto.LancamentoDTO.Builder addLancamentosBuilder(
        int index) {
      return getLancamentosFieldBuilder().addBuilder(
          index, com.grpc.proto.LancamentoDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .LancamentoDTO lancamentos = 1;</code>
     */
    public java.util.List<com.grpc.proto.LancamentoDTO.Builder> 
         getLancamentosBuilderList() {
      return getLancamentosFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.grpc.proto.LancamentoDTO, com.grpc.proto.LancamentoDTO.Builder, com.grpc.proto.LancamentoDTOOrBuilder> 
        getLancamentosFieldBuilder() {
      if (lancamentosBuilder_ == null) {
        lancamentosBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.grpc.proto.LancamentoDTO, com.grpc.proto.LancamentoDTO.Builder, com.grpc.proto.LancamentoDTOOrBuilder>(
                lancamentos_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        lancamentos_ = null;
      }
      return lancamentosBuilder_;
    }

    private int pageNumber_ ;
    /**
     * <code>int32 page_number = 2;</code>
     */
    public int getPageNumber() {
      return pageNumber_;
    }
    /**
     * <code>int32 page_number = 2;</code>
     */
    public Builder setPageNumber(int value) {
      
      pageNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page_number = 2;</code>
     */
    public Builder clearPageNumber() {
      
      pageNumber_ = 0;
      onChanged();
      return this;
    }

    private int resultPerPage_ ;
    /**
     * <code>int32 result_per_page = 3;</code>
     */
    public int getResultPerPage() {
      return resultPerPage_;
    }
    /**
     * <code>int32 result_per_page = 3;</code>
     */
    public Builder setResultPerPage(int value) {
      
      resultPerPage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 result_per_page = 3;</code>
     */
    public Builder clearResultPerPage() {
      
      resultPerPage_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:PesquisaLancamentorResponse)
  }

  // @@protoc_insertion_point(class_scope:PesquisaLancamentorResponse)
  private static final com.grpc.proto.PesquisaLancamentorResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.grpc.proto.PesquisaLancamentorResponse();
  }

  public static com.grpc.proto.PesquisaLancamentorResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PesquisaLancamentorResponse>
      PARSER = new com.google.protobuf.AbstractParser<PesquisaLancamentorResponse>() {
    @java.lang.Override
    public PesquisaLancamentorResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PesquisaLancamentorResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PesquisaLancamentorResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PesquisaLancamentorResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.grpc.proto.PesquisaLancamentorResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
