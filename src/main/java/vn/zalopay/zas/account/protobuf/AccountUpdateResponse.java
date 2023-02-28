// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account.proto

package vn.zalopay.zas.account.protobuf;

/**
 * Protobuf type {@code zas.protobuf.AccountUpdateResponse}
 */
public  final class AccountUpdateResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zas.protobuf.AccountUpdateResponse)
    AccountUpdateResponseOrBuilder {
  // Use AccountUpdateResponse.newBuilder() to construct.
  private AccountUpdateResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountUpdateResponse() {
    errorCode_ = 0L;
    msg_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AccountUpdateResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            errorCode_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            msg_ = s;
            break;
          }
          case 26: {
            vn.zalopay.zas.account.protobuf.Account.Builder subBuilder = null;
            if (account_ != null) {
              subBuilder = account_.toBuilder();
            }
            account_ = input.readMessage(vn.zalopay.zas.account.protobuf.Account.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(account_);
              account_ = subBuilder.buildPartial();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return vn.zalopay.zas.account.protobuf.AccountManagement.internal_static_zas_protobuf_AccountUpdateResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return vn.zalopay.zas.account.protobuf.AccountManagement.internal_static_zas_protobuf_AccountUpdateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            vn.zalopay.zas.account.protobuf.AccountUpdateResponse.class, vn.zalopay.zas.account.protobuf.AccountUpdateResponse.Builder.class);
  }

  public static final int ERRORCODE_FIELD_NUMBER = 1;
  private long errorCode_;
  /**
   * <code>int64 errorCode = 1;</code>
   */
  public long getErrorCode() {
    return errorCode_;
  }

  public static final int MSG_FIELD_NUMBER = 2;
  private volatile java.lang.Object msg_;
  /**
   * <code>string msg = 2;</code>
   */
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <code>string msg = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_FIELD_NUMBER = 3;
  private vn.zalopay.zas.account.protobuf.Account account_;
  /**
   * <code>.zas.protobuf.Account account = 3;</code>
   */
  public boolean hasAccount() {
    return account_ != null;
  }
  /**
   * <code>.zas.protobuf.Account account = 3;</code>
   */
  public vn.zalopay.zas.account.protobuf.Account getAccount() {
    return account_ == null ? vn.zalopay.zas.account.protobuf.Account.getDefaultInstance() : account_;
  }
  /**
   * <code>.zas.protobuf.Account account = 3;</code>
   */
  public vn.zalopay.zas.account.protobuf.AccountOrBuilder getAccountOrBuilder() {
    return getAccount();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (errorCode_ != 0L) {
      output.writeInt64(1, errorCode_);
    }
    if (!getMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, msg_);
    }
    if (account_ != null) {
      output.writeMessage(3, getAccount());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errorCode_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, errorCode_);
    }
    if (!getMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, msg_);
    }
    if (account_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAccount());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof vn.zalopay.zas.account.protobuf.AccountUpdateResponse)) {
      return super.equals(obj);
    }
    vn.zalopay.zas.account.protobuf.AccountUpdateResponse other = (vn.zalopay.zas.account.protobuf.AccountUpdateResponse) obj;

    boolean result = true;
    result = result && (getErrorCode()
        == other.getErrorCode());
    result = result && getMsg()
        .equals(other.getMsg());
    result = result && (hasAccount() == other.hasAccount());
    if (hasAccount()) {
      result = result && getAccount()
          .equals(other.getAccount());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ERRORCODE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getErrorCode());
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    if (hasAccount()) {
      hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAccount().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static vn.zalopay.zas.account.protobuf.AccountUpdateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vn.zalopay.zas.account.protobuf.AccountUpdateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vn.zalopay.zas.account.protobuf.AccountUpdateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static vn.zalopay.zas.account.protobuf.AccountUpdateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static vn.zalopay.zas.account.protobuf.AccountUpdateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static vn.zalopay.zas.account.protobuf.AccountUpdateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static vn.zalopay.zas.account.protobuf.AccountUpdateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static vn.zalopay.zas.account.protobuf.AccountUpdateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static vn.zalopay.zas.account.protobuf.AccountUpdateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static vn.zalopay.zas.account.protobuf.AccountUpdateResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(vn.zalopay.zas.account.protobuf.AccountUpdateResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code zas.protobuf.AccountUpdateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zas.protobuf.AccountUpdateResponse)
      vn.zalopay.zas.account.protobuf.AccountUpdateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return vn.zalopay.zas.account.protobuf.AccountManagement.internal_static_zas_protobuf_AccountUpdateResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return vn.zalopay.zas.account.protobuf.AccountManagement.internal_static_zas_protobuf_AccountUpdateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              vn.zalopay.zas.account.protobuf.AccountUpdateResponse.class, vn.zalopay.zas.account.protobuf.AccountUpdateResponse.Builder.class);
    }

    // Construct using vn.zalopay.zas.account.grpc.AccountUpdateResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      errorCode_ = 0L;

      msg_ = "";

      if (accountBuilder_ == null) {
        account_ = null;
      } else {
        account_ = null;
        accountBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return vn.zalopay.zas.account.protobuf.AccountManagement.internal_static_zas_protobuf_AccountUpdateResponse_descriptor;
    }

    public vn.zalopay.zas.account.protobuf.AccountUpdateResponse getDefaultInstanceForType() {
      return vn.zalopay.zas.account.protobuf.AccountUpdateResponse.getDefaultInstance();
    }

    public vn.zalopay.zas.account.protobuf.AccountUpdateResponse build() {
      vn.zalopay.zas.account.protobuf.AccountUpdateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public vn.zalopay.zas.account.protobuf.AccountUpdateResponse buildPartial() {
      vn.zalopay.zas.account.protobuf.AccountUpdateResponse result = new vn.zalopay.zas.account.protobuf.AccountUpdateResponse(this);
      result.errorCode_ = errorCode_;
      result.msg_ = msg_;
      if (accountBuilder_ == null) {
        result.account_ = account_;
      } else {
        result.account_ = accountBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof vn.zalopay.zas.account.protobuf.AccountUpdateResponse) {
        return mergeFrom((vn.zalopay.zas.account.protobuf.AccountUpdateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(vn.zalopay.zas.account.protobuf.AccountUpdateResponse other) {
      if (other == vn.zalopay.zas.account.protobuf.AccountUpdateResponse.getDefaultInstance()) return this;
      if (other.getErrorCode() != 0L) {
        setErrorCode(other.getErrorCode());
      }
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        onChanged();
      }
      if (other.hasAccount()) {
        mergeAccount(other.getAccount());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      vn.zalopay.zas.account.protobuf.AccountUpdateResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (vn.zalopay.zas.account.protobuf.AccountUpdateResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long errorCode_ ;
    /**
     * <code>int64 errorCode = 1;</code>
     */
    public long getErrorCode() {
      return errorCode_;
    }
    /**
     * <code>int64 errorCode = 1;</code>
     */
    public Builder setErrorCode(long value) {

      errorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 errorCode = 1;</code>
     */
    public Builder clearErrorCode() {

      errorCode_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object msg_ = "";
    /**
     * <code>string msg = 2;</code>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg = 2;</code>
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      msg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 2;</code>
     */
    public Builder clearMsg() {

      msg_ = getDefaultInstance().getMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 2;</code>
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);

      msg_ = value;
      onChanged();
      return this;
    }

    private vn.zalopay.zas.account.protobuf.Account account_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        vn.zalopay.zas.account.protobuf.Account, vn.zalopay.zas.account.protobuf.Account.Builder, vn.zalopay.zas.account.protobuf.AccountOrBuilder> accountBuilder_;
    /**
     * <code>.zas.protobuf.Account account = 3;</code>
     */
    public boolean hasAccount() {
      return accountBuilder_ != null || account_ != null;
    }
    /**
     * <code>.zas.protobuf.Account account = 3;</code>
     */
    public vn.zalopay.zas.account.protobuf.Account getAccount() {
      if (accountBuilder_ == null) {
        return account_ == null ? vn.zalopay.zas.account.protobuf.Account.getDefaultInstance() : account_;
      } else {
        return accountBuilder_.getMessage();
      }
    }
    /**
     * <code>.zas.protobuf.Account account = 3;</code>
     */
    public Builder setAccount(vn.zalopay.zas.account.protobuf.Account value) {
      if (accountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        account_ = value;
        onChanged();
      } else {
        accountBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.zas.protobuf.Account account = 3;</code>
     */
    public Builder setAccount(
        vn.zalopay.zas.account.protobuf.Account.Builder builderForValue) {
      if (accountBuilder_ == null) {
        account_ = builderForValue.build();
        onChanged();
      } else {
        accountBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.zas.protobuf.Account account = 3;</code>
     */
    public Builder mergeAccount(vn.zalopay.zas.account.protobuf.Account value) {
      if (accountBuilder_ == null) {
        if (account_ != null) {
          account_ =
            vn.zalopay.zas.account.protobuf.Account.newBuilder(account_).mergeFrom(value).buildPartial();
        } else {
          account_ = value;
        }
        onChanged();
      } else {
        accountBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.zas.protobuf.Account account = 3;</code>
     */
    public Builder clearAccount() {
      if (accountBuilder_ == null) {
        account_ = null;
        onChanged();
      } else {
        account_ = null;
        accountBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.zas.protobuf.Account account = 3;</code>
     */
    public vn.zalopay.zas.account.protobuf.Account.Builder getAccountBuilder() {

      onChanged();
      return getAccountFieldBuilder().getBuilder();
    }
    /**
     * <code>.zas.protobuf.Account account = 3;</code>
     */
    public vn.zalopay.zas.account.protobuf.AccountOrBuilder getAccountOrBuilder() {
      if (accountBuilder_ != null) {
        return accountBuilder_.getMessageOrBuilder();
      } else {
        return account_ == null ?
            vn.zalopay.zas.account.protobuf.Account.getDefaultInstance() : account_;
      }
    }
    /**
     * <code>.zas.protobuf.Account account = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        vn.zalopay.zas.account.protobuf.Account, vn.zalopay.zas.account.protobuf.Account.Builder, vn.zalopay.zas.account.protobuf.AccountOrBuilder>
        getAccountFieldBuilder() {
      if (accountBuilder_ == null) {
        accountBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            vn.zalopay.zas.account.protobuf.Account, vn.zalopay.zas.account.protobuf.Account.Builder, vn.zalopay.zas.account.protobuf.AccountOrBuilder>(
                getAccount(),
                getParentForChildren(),
                isClean());
        account_ = null;
      }
      return accountBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:zas.protobuf.AccountUpdateResponse)
  }

  // @@protoc_insertion_point(class_scope:zas.protobuf.AccountUpdateResponse)
  private static final vn.zalopay.zas.account.protobuf.AccountUpdateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new vn.zalopay.zas.account.protobuf.AccountUpdateResponse();
  }

  public static vn.zalopay.zas.account.protobuf.AccountUpdateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountUpdateResponse>
      PARSER = new com.google.protobuf.AbstractParser<AccountUpdateResponse>() {
    public AccountUpdateResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AccountUpdateResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AccountUpdateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountUpdateResponse> getParserForType() {
    return PARSER;
  }

  public vn.zalopay.zas.account.protobuf.AccountUpdateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

