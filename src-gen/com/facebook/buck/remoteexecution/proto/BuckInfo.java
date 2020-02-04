// @generated
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/com/facebook/buck/remoteexecution/proto/metadata.proto

package com.facebook.buck.remoteexecution.proto;

/**
 * <pre>
 * Present if the execution was started by buck.
 * </pre>
 *
 * Protobuf type {@code facebook.remote_execution.BuckInfo}
 */
@javax.annotation.Generated(value="protoc", comments="annotations:BuckInfo.java.pb.meta")
public  final class BuckInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:facebook.remote_execution.BuckInfo)
    BuckInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuckInfo.newBuilder() to construct.
  private BuckInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuckInfo() {
    buildId_ = "";
    ruleName_ = "";
    auxiliaryBuildTag_ = "";
    projectPrefix_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BuckInfo(
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
            java.lang.String s = input.readStringRequireUtf8();

            buildId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            ruleName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            auxiliaryBuildTag_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            projectPrefix_ = s;
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
    return com.facebook.buck.remoteexecution.proto.RemoteExecutionMetadataProto.internal_static_facebook_remote_execution_BuckInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.facebook.buck.remoteexecution.proto.RemoteExecutionMetadataProto.internal_static_facebook_remote_execution_BuckInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.facebook.buck.remoteexecution.proto.BuckInfo.class, com.facebook.buck.remoteexecution.proto.BuckInfo.Builder.class);
  }

  public static final int BUILD_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object buildId_;
  /**
   * <pre>
   * The buck build id of the command starting the remote execution session.
   * </pre>
   *
   * <code>string build_id = 1;</code>
   */
  public java.lang.String getBuildId() {
    java.lang.Object ref = buildId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      buildId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The buck build id of the command starting the remote execution session.
   * </pre>
   *
   * <code>string build_id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBuildIdBytes() {
    java.lang.Object ref = buildId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      buildId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RULE_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object ruleName_;
  /**
   * <pre>
   * Name of the Build Rule that's being executed
   * </pre>
   *
   * <code>string rule_name = 2;</code>
   */
  public java.lang.String getRuleName() {
    java.lang.Object ref = ruleName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ruleName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the Build Rule that's being executed
   * </pre>
   *
   * <code>string rule_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRuleNameBytes() {
    java.lang.Object ref = ruleName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ruleName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUXILIARY_BUILD_TAG_FIELD_NUMBER = 3;
  private volatile java.lang.Object auxiliaryBuildTag_;
  /**
   * <pre>
   * Auxiliary tag set for builds with non-standard configurations.
   * </pre>
   *
   * <code>string auxiliary_build_tag = 3;</code>
   */
  public java.lang.String getAuxiliaryBuildTag() {
    java.lang.Object ref = auxiliaryBuildTag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      auxiliaryBuildTag_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Auxiliary tag set for builds with non-standard configurations.
   * </pre>
   *
   * <code>string auxiliary_build_tag = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAuxiliaryBuildTagBytes() {
    java.lang.Object ref = auxiliaryBuildTag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      auxiliaryBuildTag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECT_PREFIX_FIELD_NUMBER = 4;
  private volatile java.lang.Object projectPrefix_;
  /**
   * <pre>
   * Prefix for the top level target that was passed to 'buck build'
   * If multiple targets were passed, this is the common prefix (if there is one)
   * Note: project_prefix is not necessarily the same as the prefix for the specific action
   * that is being executed right now
   * </pre>
   *
   * <code>string project_prefix = 4;</code>
   */
  public java.lang.String getProjectPrefix() {
    java.lang.Object ref = projectPrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectPrefix_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Prefix for the top level target that was passed to 'buck build'
   * If multiple targets were passed, this is the common prefix (if there is one)
   * Note: project_prefix is not necessarily the same as the prefix for the specific action
   * that is being executed right now
   * </pre>
   *
   * <code>string project_prefix = 4;</code>
   */
  public com.google.protobuf.ByteString
      getProjectPrefixBytes() {
    java.lang.Object ref = projectPrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectPrefix_ = b;
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
    if (!getBuildIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, buildId_);
    }
    if (!getRuleNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ruleName_);
    }
    if (!getAuxiliaryBuildTagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, auxiliaryBuildTag_);
    }
    if (!getProjectPrefixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, projectPrefix_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBuildIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, buildId_);
    }
    if (!getRuleNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ruleName_);
    }
    if (!getAuxiliaryBuildTagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, auxiliaryBuildTag_);
    }
    if (!getProjectPrefixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, projectPrefix_);
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
    if (!(obj instanceof com.facebook.buck.remoteexecution.proto.BuckInfo)) {
      return super.equals(obj);
    }
    com.facebook.buck.remoteexecution.proto.BuckInfo other = (com.facebook.buck.remoteexecution.proto.BuckInfo) obj;

    if (!getBuildId()
        .equals(other.getBuildId())) return false;
    if (!getRuleName()
        .equals(other.getRuleName())) return false;
    if (!getAuxiliaryBuildTag()
        .equals(other.getAuxiliaryBuildTag())) return false;
    if (!getProjectPrefix()
        .equals(other.getProjectPrefix())) return false;
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
    hash = (37 * hash) + BUILD_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBuildId().hashCode();
    hash = (37 * hash) + RULE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getRuleName().hashCode();
    hash = (37 * hash) + AUXILIARY_BUILD_TAG_FIELD_NUMBER;
    hash = (53 * hash) + getAuxiliaryBuildTag().hashCode();
    hash = (37 * hash) + PROJECT_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getProjectPrefix().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.facebook.buck.remoteexecution.proto.BuckInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.remoteexecution.proto.BuckInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.remoteexecution.proto.BuckInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.remoteexecution.proto.BuckInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.remoteexecution.proto.BuckInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.facebook.buck.remoteexecution.proto.BuckInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.facebook.buck.remoteexecution.proto.BuckInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.remoteexecution.proto.BuckInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.remoteexecution.proto.BuckInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.facebook.buck.remoteexecution.proto.BuckInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.facebook.buck.remoteexecution.proto.BuckInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.facebook.buck.remoteexecution.proto.BuckInfo parseFrom(
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
  public static Builder newBuilder(com.facebook.buck.remoteexecution.proto.BuckInfo prototype) {
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
   * Present if the execution was started by buck.
   * </pre>
   *
   * Protobuf type {@code facebook.remote_execution.BuckInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:facebook.remote_execution.BuckInfo)
      com.facebook.buck.remoteexecution.proto.BuckInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.facebook.buck.remoteexecution.proto.RemoteExecutionMetadataProto.internal_static_facebook_remote_execution_BuckInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.facebook.buck.remoteexecution.proto.RemoteExecutionMetadataProto.internal_static_facebook_remote_execution_BuckInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.facebook.buck.remoteexecution.proto.BuckInfo.class, com.facebook.buck.remoteexecution.proto.BuckInfo.Builder.class);
    }

    // Construct using com.facebook.buck.remoteexecution.proto.BuckInfo.newBuilder()
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
      buildId_ = "";

      ruleName_ = "";

      auxiliaryBuildTag_ = "";

      projectPrefix_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.facebook.buck.remoteexecution.proto.RemoteExecutionMetadataProto.internal_static_facebook_remote_execution_BuckInfo_descriptor;
    }

    @java.lang.Override
    public com.facebook.buck.remoteexecution.proto.BuckInfo getDefaultInstanceForType() {
      return com.facebook.buck.remoteexecution.proto.BuckInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.facebook.buck.remoteexecution.proto.BuckInfo build() {
      com.facebook.buck.remoteexecution.proto.BuckInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.facebook.buck.remoteexecution.proto.BuckInfo buildPartial() {
      com.facebook.buck.remoteexecution.proto.BuckInfo result = new com.facebook.buck.remoteexecution.proto.BuckInfo(this);
      result.buildId_ = buildId_;
      result.ruleName_ = ruleName_;
      result.auxiliaryBuildTag_ = auxiliaryBuildTag_;
      result.projectPrefix_ = projectPrefix_;
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
      if (other instanceof com.facebook.buck.remoteexecution.proto.BuckInfo) {
        return mergeFrom((com.facebook.buck.remoteexecution.proto.BuckInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.facebook.buck.remoteexecution.proto.BuckInfo other) {
      if (other == com.facebook.buck.remoteexecution.proto.BuckInfo.getDefaultInstance()) return this;
      if (!other.getBuildId().isEmpty()) {
        buildId_ = other.buildId_;
        onChanged();
      }
      if (!other.getRuleName().isEmpty()) {
        ruleName_ = other.ruleName_;
        onChanged();
      }
      if (!other.getAuxiliaryBuildTag().isEmpty()) {
        auxiliaryBuildTag_ = other.auxiliaryBuildTag_;
        onChanged();
      }
      if (!other.getProjectPrefix().isEmpty()) {
        projectPrefix_ = other.projectPrefix_;
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
      com.facebook.buck.remoteexecution.proto.BuckInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.facebook.buck.remoteexecution.proto.BuckInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object buildId_ = "";
    /**
     * <pre>
     * The buck build id of the command starting the remote execution session.
     * </pre>
     *
     * <code>string build_id = 1;</code>
     */
    public java.lang.String getBuildId() {
      java.lang.Object ref = buildId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        buildId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The buck build id of the command starting the remote execution session.
     * </pre>
     *
     * <code>string build_id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBuildIdBytes() {
      java.lang.Object ref = buildId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        buildId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The buck build id of the command starting the remote execution session.
     * </pre>
     *
     * <code>string build_id = 1;</code>
     */
    public Builder setBuildId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      buildId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The buck build id of the command starting the remote execution session.
     * </pre>
     *
     * <code>string build_id = 1;</code>
     */
    public Builder clearBuildId() {
      
      buildId_ = getDefaultInstance().getBuildId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The buck build id of the command starting the remote execution session.
     * </pre>
     *
     * <code>string build_id = 1;</code>
     */
    public Builder setBuildIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      buildId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ruleName_ = "";
    /**
     * <pre>
     * Name of the Build Rule that's being executed
     * </pre>
     *
     * <code>string rule_name = 2;</code>
     */
    public java.lang.String getRuleName() {
      java.lang.Object ref = ruleName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ruleName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the Build Rule that's being executed
     * </pre>
     *
     * <code>string rule_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRuleNameBytes() {
      java.lang.Object ref = ruleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ruleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the Build Rule that's being executed
     * </pre>
     *
     * <code>string rule_name = 2;</code>
     */
    public Builder setRuleName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ruleName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the Build Rule that's being executed
     * </pre>
     *
     * <code>string rule_name = 2;</code>
     */
    public Builder clearRuleName() {
      
      ruleName_ = getDefaultInstance().getRuleName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the Build Rule that's being executed
     * </pre>
     *
     * <code>string rule_name = 2;</code>
     */
    public Builder setRuleNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ruleName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object auxiliaryBuildTag_ = "";
    /**
     * <pre>
     * Auxiliary tag set for builds with non-standard configurations.
     * </pre>
     *
     * <code>string auxiliary_build_tag = 3;</code>
     */
    public java.lang.String getAuxiliaryBuildTag() {
      java.lang.Object ref = auxiliaryBuildTag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        auxiliaryBuildTag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Auxiliary tag set for builds with non-standard configurations.
     * </pre>
     *
     * <code>string auxiliary_build_tag = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAuxiliaryBuildTagBytes() {
      java.lang.Object ref = auxiliaryBuildTag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        auxiliaryBuildTag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Auxiliary tag set for builds with non-standard configurations.
     * </pre>
     *
     * <code>string auxiliary_build_tag = 3;</code>
     */
    public Builder setAuxiliaryBuildTag(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      auxiliaryBuildTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Auxiliary tag set for builds with non-standard configurations.
     * </pre>
     *
     * <code>string auxiliary_build_tag = 3;</code>
     */
    public Builder clearAuxiliaryBuildTag() {
      
      auxiliaryBuildTag_ = getDefaultInstance().getAuxiliaryBuildTag();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Auxiliary tag set for builds with non-standard configurations.
     * </pre>
     *
     * <code>string auxiliary_build_tag = 3;</code>
     */
    public Builder setAuxiliaryBuildTagBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      auxiliaryBuildTag_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object projectPrefix_ = "";
    /**
     * <pre>
     * Prefix for the top level target that was passed to 'buck build'
     * If multiple targets were passed, this is the common prefix (if there is one)
     * Note: project_prefix is not necessarily the same as the prefix for the specific action
     * that is being executed right now
     * </pre>
     *
     * <code>string project_prefix = 4;</code>
     */
    public java.lang.String getProjectPrefix() {
      java.lang.Object ref = projectPrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectPrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Prefix for the top level target that was passed to 'buck build'
     * If multiple targets were passed, this is the common prefix (if there is one)
     * Note: project_prefix is not necessarily the same as the prefix for the specific action
     * that is being executed right now
     * </pre>
     *
     * <code>string project_prefix = 4;</code>
     */
    public com.google.protobuf.ByteString
        getProjectPrefixBytes() {
      java.lang.Object ref = projectPrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectPrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Prefix for the top level target that was passed to 'buck build'
     * If multiple targets were passed, this is the common prefix (if there is one)
     * Note: project_prefix is not necessarily the same as the prefix for the specific action
     * that is being executed right now
     * </pre>
     *
     * <code>string project_prefix = 4;</code>
     */
    public Builder setProjectPrefix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectPrefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Prefix for the top level target that was passed to 'buck build'
     * If multiple targets were passed, this is the common prefix (if there is one)
     * Note: project_prefix is not necessarily the same as the prefix for the specific action
     * that is being executed right now
     * </pre>
     *
     * <code>string project_prefix = 4;</code>
     */
    public Builder clearProjectPrefix() {
      
      projectPrefix_ = getDefaultInstance().getProjectPrefix();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Prefix for the top level target that was passed to 'buck build'
     * If multiple targets were passed, this is the common prefix (if there is one)
     * Note: project_prefix is not necessarily the same as the prefix for the specific action
     * that is being executed right now
     * </pre>
     *
     * <code>string project_prefix = 4;</code>
     */
    public Builder setProjectPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectPrefix_ = value;
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


    // @@protoc_insertion_point(builder_scope:facebook.remote_execution.BuckInfo)
  }

  // @@protoc_insertion_point(class_scope:facebook.remote_execution.BuckInfo)
  private static final com.facebook.buck.remoteexecution.proto.BuckInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.facebook.buck.remoteexecution.proto.BuckInfo();
  }

  public static com.facebook.buck.remoteexecution.proto.BuckInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuckInfo>
      PARSER = new com.google.protobuf.AbstractParser<BuckInfo>() {
    @java.lang.Override
    public BuckInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BuckInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BuckInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuckInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.facebook.buck.remoteexecution.proto.BuckInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

