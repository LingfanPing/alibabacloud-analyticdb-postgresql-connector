// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: adbpgss.proto

package org.apache.flink.connector.jdbc.table.sink.api;

/**
 * <pre>
 * ListSchema service request message
 * </pre>
 *
 * Protobuf type {@code api.ListSchemaRequest}
 */
public final class ListSchemaRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.ListSchemaRequest)
    ListSchemaRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSchemaRequest.newBuilder() to construct.
  private ListSchemaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSchemaRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSchemaRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.flink.connector.jdbc.table.sink.api.Adbpgss.internal_static_api_ListSchemaRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.flink.connector.jdbc.table.sink.api.Adbpgss.internal_static_api_ListSchemaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest.class, org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest.Builder.class);
  }

  public static final int SESSION_FIELD_NUMBER = 1;
  private org.apache.flink.connector.jdbc.table.sink.api.Session session_;
  /**
   * <code>.api.Session Session = 1;</code>
   * @return Whether the session field is set.
   */
  @java.lang.Override
  public boolean hasSession() {
    return session_ != null;
  }
  /**
   * <code>.api.Session Session = 1;</code>
   * @return The session.
   */
  @java.lang.Override
  public org.apache.flink.connector.jdbc.table.sink.api.Session getSession() {
    return session_ == null ? org.apache.flink.connector.jdbc.table.sink.api.Session.getDefaultInstance() : session_;
  }
  /**
   * <code>.api.Session Session = 1;</code>
   */
  @java.lang.Override
  public org.apache.flink.connector.jdbc.table.sink.api.SessionOrBuilder getSessionOrBuilder() {
    return session_ == null ? org.apache.flink.connector.jdbc.table.sink.api.Session.getDefaultInstance() : session_;
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
    if (session_ != null) {
      output.writeMessage(1, getSession());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (session_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSession());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest)) {
      return super.equals(obj);
    }
    org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest other = (org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest) obj;

    if (hasSession() != other.hasSession()) return false;
    if (hasSession()) {
      if (!getSession()
          .equals(other.getSession())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasSession()) {
      hash = (37 * hash) + SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getSession().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest parseFrom(
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
  public static Builder newBuilder(org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest prototype) {
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
   * <pre>
   * ListSchema service request message
   * </pre>
   *
   * Protobuf type {@code api.ListSchemaRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.ListSchemaRequest)
      org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.flink.connector.jdbc.table.sink.api.Adbpgss.internal_static_api_ListSchemaRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.flink.connector.jdbc.table.sink.api.Adbpgss.internal_static_api_ListSchemaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest.class, org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest.Builder.class);
    }

    // Construct using org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      session_ = null;
      if (sessionBuilder_ != null) {
        sessionBuilder_.dispose();
        sessionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.flink.connector.jdbc.table.sink.api.Adbpgss.internal_static_api_ListSchemaRequest_descriptor;
    }

    @java.lang.Override
    public org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest getDefaultInstanceForType() {
      return org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest build() {
      org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest buildPartial() {
      org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest result = new org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.session_ = sessionBuilder_ == null
            ? session_
            : sessionBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest) {
        return mergeFrom((org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest other) {
      if (other == org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest.getDefaultInstance()) return this;
      if (other.hasSession()) {
        mergeSession(other.getSession());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getSessionFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private org.apache.flink.connector.jdbc.table.sink.api.Session session_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.flink.connector.jdbc.table.sink.api.Session, org.apache.flink.connector.jdbc.table.sink.api.Session.Builder, org.apache.flink.connector.jdbc.table.sink.api.SessionOrBuilder> sessionBuilder_;
    /**
     * <code>.api.Session Session = 1;</code>
     * @return Whether the session field is set.
     */
    public boolean hasSession() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.api.Session Session = 1;</code>
     * @return The session.
     */
    public org.apache.flink.connector.jdbc.table.sink.api.Session getSession() {
      if (sessionBuilder_ == null) {
        return session_ == null ? org.apache.flink.connector.jdbc.table.sink.api.Session.getDefaultInstance() : session_;
      } else {
        return sessionBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    public Builder setSession(org.apache.flink.connector.jdbc.table.sink.api.Session value) {
      if (sessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        session_ = value;
      } else {
        sessionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    public Builder setSession(
        org.apache.flink.connector.jdbc.table.sink.api.Session.Builder builderForValue) {
      if (sessionBuilder_ == null) {
        session_ = builderForValue.build();
      } else {
        sessionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    public Builder mergeSession(org.apache.flink.connector.jdbc.table.sink.api.Session value) {
      if (sessionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          session_ != null &&
          session_ != org.apache.flink.connector.jdbc.table.sink.api.Session.getDefaultInstance()) {
          getSessionBuilder().mergeFrom(value);
        } else {
          session_ = value;
        }
      } else {
        sessionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    public Builder clearSession() {
      bitField0_ = (bitField0_ & ~0x00000001);
      session_ = null;
      if (sessionBuilder_ != null) {
        sessionBuilder_.dispose();
        sessionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    public org.apache.flink.connector.jdbc.table.sink.api.Session.Builder getSessionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSessionFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    public org.apache.flink.connector.jdbc.table.sink.api.SessionOrBuilder getSessionOrBuilder() {
      if (sessionBuilder_ != null) {
        return sessionBuilder_.getMessageOrBuilder();
      } else {
        return session_ == null ?
            org.apache.flink.connector.jdbc.table.sink.api.Session.getDefaultInstance() : session_;
      }
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.flink.connector.jdbc.table.sink.api.Session, org.apache.flink.connector.jdbc.table.sink.api.Session.Builder, org.apache.flink.connector.jdbc.table.sink.api.SessionOrBuilder> 
        getSessionFieldBuilder() {
      if (sessionBuilder_ == null) {
        sessionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.flink.connector.jdbc.table.sink.api.Session, org.apache.flink.connector.jdbc.table.sink.api.Session.Builder, org.apache.flink.connector.jdbc.table.sink.api.SessionOrBuilder>(
                getSession(),
                getParentForChildren(),
                isClean());
        session_ = null;
      }
      return sessionBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.ListSchemaRequest)
  }

  // @@protoc_insertion_point(class_scope:api.ListSchemaRequest)
  private static final org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest();
  }

  public static org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSchemaRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListSchemaRequest>() {
    @java.lang.Override
    public ListSchemaRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ListSchemaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSchemaRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.flink.connector.jdbc.table.sink.api.ListSchemaRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

