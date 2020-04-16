// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Communication.proto

package com.mdevv.tpo3.common.protobuf;

/**
 * <pre>
 * From dict server to core server
 * </pre>
 *
 * Protobuf type {@code RegistrationRequest}
 */
public  final class RegistrationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RegistrationRequest)
    RegistrationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegistrationRequest.newBuilder() to construct.
  private RegistrationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegistrationRequest() {
    type_ = 0;
    language_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegistrationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RegistrationRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 24: {

            port_ = input.readUInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            language_ = s;
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
    return com.mdevv.tpo3.common.protobuf.Communication.internal_static_RegistrationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.mdevv.tpo3.common.protobuf.Communication.internal_static_RegistrationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.mdevv.tpo3.common.protobuf.RegistrationRequest.class, com.mdevv.tpo3.common.protobuf.RegistrationRequest.Builder.class);
  }

  /**
   * Protobuf enum {@code RegistrationRequest.RequestType}
   */
  public enum RequestType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>REGISTER = 0;</code>
     */
    REGISTER(0),
    /**
     * <code>UNREGISTER = 1;</code>
     */
    UNREGISTER(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>REGISTER = 0;</code>
     */
    public static final int REGISTER_VALUE = 0;
    /**
     * <code>UNREGISTER = 1;</code>
     */
    public static final int UNREGISTER_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RequestType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RequestType forNumber(int value) {
      switch (value) {
        case 0: return REGISTER;
        case 1: return UNREGISTER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RequestType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RequestType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RequestType>() {
            public RequestType findValueByNumber(int number) {
              return RequestType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.mdevv.tpo3.common.protobuf.RegistrationRequest.getDescriptor().getEnumTypes().get(0);
    }

    private static final RequestType[] VALUES = values();

    public static RequestType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RequestType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:RegistrationRequest.RequestType)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <code>.RegistrationRequest.RequestType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.RegistrationRequest.RequestType type = 1;</code>
   * @return The type.
   */
  public com.mdevv.tpo3.common.protobuf.RegistrationRequest.RequestType getType() {
    @SuppressWarnings("deprecation")
    com.mdevv.tpo3.common.protobuf.RegistrationRequest.RequestType result = com.mdevv.tpo3.common.protobuf.RegistrationRequest.RequestType.valueOf(type_);
    return result == null ? com.mdevv.tpo3.common.protobuf.RegistrationRequest.RequestType.UNRECOGNIZED : result;
  }

  public static final int PORT_FIELD_NUMBER = 3;
  private int port_;
  /**
   * <code>uint32 port = 3;</code>
   * @return The port.
   */
  public int getPort() {
    return port_;
  }

  public static final int LANGUAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object language_;
  /**
   * <code>string language = 4;</code>
   * @return The language.
   */
  public java.lang.String getLanguage() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      language_ = s;
      return s;
    }
  }
  /**
   * <code>string language = 4;</code>
   * @return The bytes for language.
   */
  public com.google.protobuf.ByteString
      getLanguageBytes() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      language_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (type_ != com.mdevv.tpo3.common.protobuf.RegistrationRequest.RequestType.REGISTER.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (port_ != 0) {
      output.writeUInt32(3, port_);
    }
    if (!getLanguageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, language_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.mdevv.tpo3.common.protobuf.RegistrationRequest.RequestType.REGISTER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (port_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, port_);
    }
    if (!getLanguageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, language_);
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
    if (!(obj instanceof com.mdevv.tpo3.common.protobuf.RegistrationRequest)) {
      return super.equals(obj);
    }
    com.mdevv.tpo3.common.protobuf.RegistrationRequest other = (com.mdevv.tpo3.common.protobuf.RegistrationRequest) obj;

    if (type_ != other.type_) return false;
    if (getPort()
        != other.getPort()) return false;
    if (!getLanguage()
        .equals(other.getLanguage())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + PORT_FIELD_NUMBER;
    hash = (53 * hash) + getPort();
    hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest parseFrom(
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
  public static Builder newBuilder(com.mdevv.tpo3.common.protobuf.RegistrationRequest prototype) {
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
   * From dict server to core server
   * </pre>
   *
   * Protobuf type {@code RegistrationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RegistrationRequest)
      com.mdevv.tpo3.common.protobuf.RegistrationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.mdevv.tpo3.common.protobuf.Communication.internal_static_RegistrationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.mdevv.tpo3.common.protobuf.Communication.internal_static_RegistrationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.mdevv.tpo3.common.protobuf.RegistrationRequest.class, com.mdevv.tpo3.common.protobuf.RegistrationRequest.Builder.class);
    }

    // Construct using com.mdevv.tpo3.common.protobuf.RegistrationRequest.newBuilder()
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
      type_ = 0;

      port_ = 0;

      language_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.mdevv.tpo3.common.protobuf.Communication.internal_static_RegistrationRequest_descriptor;
    }

    @java.lang.Override
    public com.mdevv.tpo3.common.protobuf.RegistrationRequest getDefaultInstanceForType() {
      return com.mdevv.tpo3.common.protobuf.RegistrationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.mdevv.tpo3.common.protobuf.RegistrationRequest build() {
      com.mdevv.tpo3.common.protobuf.RegistrationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.mdevv.tpo3.common.protobuf.RegistrationRequest buildPartial() {
      com.mdevv.tpo3.common.protobuf.RegistrationRequest result = new com.mdevv.tpo3.common.protobuf.RegistrationRequest(this);
      result.type_ = type_;
      result.port_ = port_;
      result.language_ = language_;
      onBuilt();
      return result;
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
      if (other instanceof com.mdevv.tpo3.common.protobuf.RegistrationRequest) {
        return mergeFrom((com.mdevv.tpo3.common.protobuf.RegistrationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.mdevv.tpo3.common.protobuf.RegistrationRequest other) {
      if (other == com.mdevv.tpo3.common.protobuf.RegistrationRequest.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getPort() != 0) {
        setPort(other.getPort());
      }
      if (!other.getLanguage().isEmpty()) {
        language_ = other.language_;
        onChanged();
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
      com.mdevv.tpo3.common.protobuf.RegistrationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.mdevv.tpo3.common.protobuf.RegistrationRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.RegistrationRequest.RequestType type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.RegistrationRequest.RequestType type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.RegistrationRequest.RequestType type = 1;</code>
     * @return The type.
     */
    public com.mdevv.tpo3.common.protobuf.RegistrationRequest.RequestType getType() {
      @SuppressWarnings("deprecation")
      com.mdevv.tpo3.common.protobuf.RegistrationRequest.RequestType result = com.mdevv.tpo3.common.protobuf.RegistrationRequest.RequestType.valueOf(type_);
      return result == null ? com.mdevv.tpo3.common.protobuf.RegistrationRequest.RequestType.UNRECOGNIZED : result;
    }
    /**
     * <code>.RegistrationRequest.RequestType type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.mdevv.tpo3.common.protobuf.RegistrationRequest.RequestType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.RegistrationRequest.RequestType type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int port_ ;
    /**
     * <code>uint32 port = 3;</code>
     * @return The port.
     */
    public int getPort() {
      return port_;
    }
    /**
     * <code>uint32 port = 3;</code>
     * @param value The port to set.
     * @return This builder for chaining.
     */
    public Builder setPort(int value) {
      
      port_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 port = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPort() {
      
      port_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object language_ = "";
    /**
     * <code>string language = 4;</code>
     * @return The language.
     */
    public java.lang.String getLanguage() {
      java.lang.Object ref = language_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        language_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string language = 4;</code>
     * @return The bytes for language.
     */
    public com.google.protobuf.ByteString
        getLanguageBytes() {
      java.lang.Object ref = language_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        language_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string language = 4;</code>
     * @param value The language to set.
     * @return This builder for chaining.
     */
    public Builder setLanguage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      language_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string language = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguage() {
      
      language_ = getDefaultInstance().getLanguage();
      onChanged();
      return this;
    }
    /**
     * <code>string language = 4;</code>
     * @param value The bytes for language to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      language_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:RegistrationRequest)
  }

  // @@protoc_insertion_point(class_scope:RegistrationRequest)
  private static final com.mdevv.tpo3.common.protobuf.RegistrationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.mdevv.tpo3.common.protobuf.RegistrationRequest();
  }

  public static com.mdevv.tpo3.common.protobuf.RegistrationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegistrationRequest>
      PARSER = new com.google.protobuf.AbstractParser<RegistrationRequest>() {
    @java.lang.Override
    public RegistrationRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RegistrationRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegistrationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegistrationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.mdevv.tpo3.common.protobuf.RegistrationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

