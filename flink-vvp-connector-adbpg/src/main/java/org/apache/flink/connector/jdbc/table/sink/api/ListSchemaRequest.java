// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpss.proto

package org.apache.flink.connector.jdbc.table.sink.api;

/**
 * <pre>
 * ListSchema service request message
 * </pre>
 *
 * Protobuf type {@code api.ListSchemaRequest}
 */
public  final class ListSchemaRequest extends
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

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSchemaRequest();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListSchemaRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
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
            Session.Builder subBuilder = null;
            if (session_ != null) {
              subBuilder = session_.toBuilder();
            }
            session_ = input.readMessage(Session.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(session_);
              session_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
    return GpssOuterClass.internal_static_api_ListSchemaRequest_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return GpssOuterClass.internal_static_api_ListSchemaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ListSchemaRequest.class, Builder.class);
  }

  public static final int SESSION_FIELD_NUMBER = 1;
  private Session session_;
  /**
   * <code>.api.Session Session = 1;</code>
   * @return Whether the session field is set.
   */
  public boolean hasSession() {
    return session_ != null;
  }
  /**
   * <code>.api.Session Session = 1;</code>
   * @return The session.
   */
  public Session getSession() {
    return session_ == null ? Session.getDefaultInstance() : session_;
  }
  /**
   * <code>.api.Session Session = 1;</code>
   */
  public SessionOrBuilder getSessionOrBuilder() {
    return getSession();
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (session_ != null) {
      output.writeMessage(1, getSession());
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (session_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSession());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ListSchemaRequest)) {
      return super.equals(obj);
    }
    ListSchemaRequest other = (ListSchemaRequest) obj;

    if (hasSession() != other.hasSession()) return false;
    if (hasSession()) {
      if (!getSession()
          .equals(other.getSession())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ListSchemaRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListSchemaRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListSchemaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListSchemaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListSchemaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListSchemaRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListSchemaRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ListSchemaRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ListSchemaRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ListSchemaRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ListSchemaRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ListSchemaRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ListSchemaRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
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
      ListSchemaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GpssOuterClass.internal_static_api_ListSchemaRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GpssOuterClass.internal_static_api_ListSchemaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ListSchemaRequest.class, Builder.class);
    }

    // Construct using api.ListSchemaRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      if (sessionBuilder_ == null) {
        session_ = null;
      } else {
        session_ = null;
        sessionBuilder_ = null;
      }
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return GpssOuterClass.internal_static_api_ListSchemaRequest_descriptor;
    }

    @Override
    public ListSchemaRequest getDefaultInstanceForType() {
      return ListSchemaRequest.getDefaultInstance();
    }

    @Override
    public ListSchemaRequest build() {
      ListSchemaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ListSchemaRequest buildPartial() {
      ListSchemaRequest result = new ListSchemaRequest(this);
      if (sessionBuilder_ == null) {
        result.session_ = session_;
      } else {
        result.session_ = sessionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ListSchemaRequest) {
        return mergeFrom((ListSchemaRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ListSchemaRequest other) {
      if (other == ListSchemaRequest.getDefaultInstance()) return this;
      if (other.hasSession()) {
        mergeSession(other.getSession());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ListSchemaRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ListSchemaRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Session session_;
    private com.google.protobuf.SingleFieldBuilderV3<
        Session, Session.Builder, SessionOrBuilder> sessionBuilder_;
    /**
     * <code>.api.Session Session = 1;</code>
     * @return Whether the session field is set.
     */
    public boolean hasSession() {
      return sessionBuilder_ != null || session_ != null;
    }
    /**
     * <code>.api.Session Session = 1;</code>
     * @return The session.
     */
    public Session getSession() {
      if (sessionBuilder_ == null) {
        return session_ == null ? Session.getDefaultInstance() : session_;
      } else {
        return sessionBuilder_.getMessage();
      }
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    public Builder setSession(Session value) {
      if (sessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        session_ = value;
        onChanged();
      } else {
        sessionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    public Builder setSession(
        Session.Builder builderForValue) {
      if (sessionBuilder_ == null) {
        session_ = builderForValue.build();
        onChanged();
      } else {
        sessionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    public Builder mergeSession(Session value) {
      if (sessionBuilder_ == null) {
        if (session_ != null) {
          session_ =
            Session.newBuilder(session_).mergeFrom(value).buildPartial();
        } else {
          session_ = value;
        }
        onChanged();
      } else {
        sessionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    public Builder clearSession() {
      if (sessionBuilder_ == null) {
        session_ = null;
        onChanged();
      } else {
        session_ = null;
        sessionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    public Session.Builder getSessionBuilder() {
      
      onChanged();
      return getSessionFieldBuilder().getBuilder();
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    public SessionOrBuilder getSessionOrBuilder() {
      if (sessionBuilder_ != null) {
        return sessionBuilder_.getMessageOrBuilder();
      } else {
        return session_ == null ?
            Session.getDefaultInstance() : session_;
      }
    }
    /**
     * <code>.api.Session Session = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        Session, Session.Builder, SessionOrBuilder>
        getSessionFieldBuilder() {
      if (sessionBuilder_ == null) {
        sessionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            Session, Session.Builder, SessionOrBuilder>(
                getSession(),
                getParentForChildren(),
                isClean());
        session_ = null;
      }
      return sessionBuilder_;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.ListSchemaRequest)
  }

  // @@protoc_insertion_point(class_scope:api.ListSchemaRequest)
  private static final ListSchemaRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListSchemaRequest();
  }

  public static ListSchemaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSchemaRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListSchemaRequest>() {
    @Override
    public ListSchemaRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListSchemaRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListSchemaRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ListSchemaRequest> getParserForType() {
    return PARSER;
  }

  @Override
  public ListSchemaRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

