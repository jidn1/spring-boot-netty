package com.aqmd.netty.entity;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner;
import com.google.protobuf.GeneratedMessageV3.FieldAccessorTable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LoginMessage {
    private static final Descriptor internal_static_tutorial_LoginUser_descriptor;
    private static final FieldAccessorTable internal_static_tutorial_LoginUser_fieldAccessorTable;
    private static FileDescriptor descriptor;

    private LoginMessage() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }

    public static FileDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        String[] descriptorData = new String[]{"\n\u000bLogin.proto\u0012\btutorial\"A\n\tLoginUser\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006passwd\u0018\u0002 \u0001(\t\u0012\u0012\n\nverificode\u0018\u0003 \u0001(\tB%\n\u0015com.spark.hawk.entityB\fLoginMessageb\u0006proto3"};
        InternalDescriptorAssigner assigner = new InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(FileDescriptor root) {
                LoginMessage.descriptor = root;
                return null;
            }
        };
        FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new FileDescriptor[0], assigner);
        internal_static_tutorial_LoginUser_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
        internal_static_tutorial_LoginUser_fieldAccessorTable = new FieldAccessorTable(internal_static_tutorial_LoginUser_descriptor, new String[]{"Username", "Passwd", "Verificode"});
    }

    public static final class LoginUser extends GeneratedMessageV3 implements LoginMessage.LoginUserOrBuilder {
        public static final int USERNAME_FIELD_NUMBER = 1;
        private volatile Object username_;
        public static final int PASSWD_FIELD_NUMBER = 2;
        private volatile Object passwd_;
        public static final int VERIFICODE_FIELD_NUMBER = 3;
        private volatile Object verificode_;
        private byte memoizedIsInitialized;
        private static final long serialVersionUID = 0L;
        private static final LoginMessage.LoginUser DEFAULT_INSTANCE = new LoginMessage.LoginUser();
        private static final Parser<LoginMessage.LoginUser> PARSER = new AbstractParser<LoginMessage.LoginUser>() {
            public LoginMessage.LoginUser parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new LoginMessage.LoginUser(input, extensionRegistry);
            }
        };

        private LoginUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private LoginUser() {
            this.memoizedIsInitialized = -1;
            this.username_ = "";
            this.passwd_ = "";
            this.verificode_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private LoginUser(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            boolean var3 = false;

            try {
                boolean done = false;

                while(!done) {
                    int tag = input.readTag();
                    String s;
                    switch(tag) {
                    case 0:
                        done = true;
                        break;
                    case 10:
                        s = input.readStringRequireUtf8();
                        this.username_ = s;
                        break;
                    case 18:
                        s = input.readStringRequireUtf8();
                        this.passwd_ = s;
                        break;
                    case 26:
                        s = input.readStringRequireUtf8();
                        this.verificode_ = s;
                        break;
                    default:
                        if (!input.skipField(tag)) {
                            done = true;
                        }
                    }
                }
            } catch (InvalidProtocolBufferException var11) {
                throw var11.setUnfinishedMessage(this);
            } catch (IOException var12) {
                throw (new InvalidProtocolBufferException(var12)).setUnfinishedMessage(this);
            } finally {
                this.makeExtensionsImmutable();
            }

        }

        public static final Descriptor getDescriptor() {
            return LoginMessage.internal_static_tutorial_LoginUser_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return LoginMessage.internal_static_tutorial_LoginUser_fieldAccessorTable.ensureFieldAccessorsInitialized(LoginMessage.LoginUser.class, LoginMessage.LoginUser.Builder.class);
        }

        public String getUsername() {
            Object ref = this.username_;
            if (ref instanceof String) {
                return (String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                this.username_ = s;
                return s;
            }
        }

        public ByteString getUsernameBytes() {
            Object ref = this.username_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)ref);
                this.username_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public String getPasswd() {
            Object ref = this.passwd_;
            if (ref instanceof String) {
                return (String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                this.passwd_ = s;
                return s;
            }
        }

        public ByteString getPasswdBytes() {
            Object ref = this.passwd_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)ref);
                this.passwd_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public String getVerificode() {
            Object ref = this.verificode_;
            if (ref instanceof String) {
                return (String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                this.verificode_ = s;
                return s;
            }
        }

        public ByteString getVerificodeBytes() {
            Object ref = this.verificode_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)ref);
                this.verificode_ = b;
                return b;
            } else {
                return (ByteString)ref;
            }
        }

        public final boolean isInitialized() {
            byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            } else if (isInitialized == 0) {
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public void writeTo(CodedOutputStream output) throws IOException {
            if (!this.getUsernameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 1, this.username_);
            }

            if (!this.getPasswdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 2, this.passwd_);
            }

            if (!this.getVerificodeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 3, this.verificode_);
            }

        }

        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            } else {
                size = 0;
                if (!this.getUsernameBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(1, this.username_);
                }

                if (!this.getPasswdBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(2, this.passwd_);
                }

                if (!this.getVerificodeBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(3, this.verificode_);
                }

                this.memoizedSize = size;
                return size;
            }
        }

        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            } else if (!(obj instanceof LoginMessage.LoginUser)) {
                return super.equals(obj);
            } else {
                LoginMessage.LoginUser other = (LoginMessage.LoginUser)obj;
                boolean result = true;
                result = result && this.getUsername().equals(other.getUsername());
                result = result && this.getPasswd().equals(other.getPasswd());
                result = result && this.getVerificode().equals(other.getVerificode());
                return result;
            }
        }

        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            } else {
                int hash = 41;
                hash = 19 * hash + getDescriptor().hashCode();
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getUsername().hashCode();
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getPasswd().hashCode();
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getVerificode().hashCode();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static LoginMessage.LoginUser parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (LoginMessage.LoginUser)PARSER.parseFrom(data);
        }

        public static LoginMessage.LoginUser parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LoginMessage.LoginUser)PARSER.parseFrom(data, extensionRegistry);
        }

        public static LoginMessage.LoginUser parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (LoginMessage.LoginUser)PARSER.parseFrom(data);
        }

        public static LoginMessage.LoginUser parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LoginMessage.LoginUser)PARSER.parseFrom(data, extensionRegistry);
        }

        public static LoginMessage.LoginUser parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (LoginMessage.LoginUser)PARSER.parseFrom(data);
        }

        public static LoginMessage.LoginUser parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (LoginMessage.LoginUser)PARSER.parseFrom(data, extensionRegistry);
        }

        public static LoginMessage.LoginUser parseFrom(InputStream input) throws IOException {
            return (LoginMessage.LoginUser)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static LoginMessage.LoginUser parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LoginMessage.LoginUser)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static LoginMessage.LoginUser parseDelimitedFrom(InputStream input) throws IOException {
            return (LoginMessage.LoginUser)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static LoginMessage.LoginUser parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LoginMessage.LoginUser)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static LoginMessage.LoginUser parseFrom(CodedInputStream input) throws IOException {
            return (LoginMessage.LoginUser)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static LoginMessage.LoginUser parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (LoginMessage.LoginUser)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public LoginMessage.LoginUser.Builder newBuilderForType() {
            return newBuilder();
        }

        public static LoginMessage.LoginUser.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoginMessage.LoginUser.Builder newBuilder(LoginMessage.LoginUser prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public LoginMessage.LoginUser.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new LoginMessage.LoginUser.Builder() : (new LoginMessage.LoginUser.Builder()).mergeFrom(this);
        }

        protected LoginMessage.LoginUser.Builder newBuilderForType(BuilderParent parent) {
            LoginMessage.LoginUser.Builder builder = new LoginMessage.LoginUser.Builder(parent);
            return builder;
        }

        public static LoginMessage.LoginUser getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<LoginMessage.LoginUser> parser() {
            return PARSER;
        }

        public Parser<LoginMessage.LoginUser> getParserForType() {
            return PARSER;
        }

        public LoginMessage.LoginUser getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<LoginMessage.LoginUser.Builder> implements LoginMessage.LoginUserOrBuilder {
            private Object username_;
            private Object passwd_;
            private Object verificode_;

            public static final Descriptor getDescriptor() {
                return LoginMessage.internal_static_tutorial_LoginUser_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return LoginMessage.internal_static_tutorial_LoginUser_fieldAccessorTable.ensureFieldAccessorsInitialized(LoginMessage.LoginUser.class, LoginMessage.LoginUser.Builder.class);
            }

            private Builder() {
                this.username_ = "";
                this.passwd_ = "";
                this.verificode_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.username_ = "";
                this.passwd_ = "";
                this.verificode_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (LoginMessage.LoginUser.alwaysUseFieldBuilders) {
                }

            }

            public LoginMessage.LoginUser.Builder clear() {
                super.clear();
                this.username_ = "";
                this.passwd_ = "";
                this.verificode_ = "";
                return this;
            }

            public Descriptor getDescriptorForType() {
                return LoginMessage.internal_static_tutorial_LoginUser_descriptor;
            }

            public LoginMessage.LoginUser getDefaultInstanceForType() {
                return LoginMessage.LoginUser.getDefaultInstance();
            }

            public LoginMessage.LoginUser build() {
                LoginMessage.LoginUser result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public LoginMessage.LoginUser buildPartial() {
                LoginMessage.LoginUser result = new LoginMessage.LoginUser(this);
                result.username_ = this.username_;
                result.passwd_ = this.passwd_;
                result.verificode_ = this.verificode_;
                this.onBuilt();
                return result;
            }

            public LoginMessage.LoginUser.Builder clone() {
                return (LoginMessage.LoginUser.Builder)super.clone();
            }

            public LoginMessage.LoginUser.Builder setField(FieldDescriptor field, Object value) {
                return (LoginMessage.LoginUser.Builder)super.setField(field, value);
            }

            public LoginMessage.LoginUser.Builder clearField(FieldDescriptor field) {
                return (LoginMessage.LoginUser.Builder)super.clearField(field);
            }

            public LoginMessage.LoginUser.Builder clearOneof(OneofDescriptor oneof) {
                return (LoginMessage.LoginUser.Builder)super.clearOneof(oneof);
            }

            public LoginMessage.LoginUser.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
                return (LoginMessage.LoginUser.Builder)super.setRepeatedField(field, index, value);
            }

            public LoginMessage.LoginUser.Builder addRepeatedField(FieldDescriptor field, Object value) {
                return (LoginMessage.LoginUser.Builder)super.addRepeatedField(field, value);
            }

            public LoginMessage.LoginUser.Builder mergeFrom(Message other) {
                if (other instanceof LoginMessage.LoginUser) {
                    return this.mergeFrom((LoginMessage.LoginUser)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public LoginMessage.LoginUser.Builder mergeFrom(LoginMessage.LoginUser other) {
                if (other == LoginMessage.LoginUser.getDefaultInstance()) {
                    return this;
                } else {
                    if (!other.getUsername().isEmpty()) {
                        this.username_ = other.username_;
                        this.onChanged();
                    }

                    if (!other.getPasswd().isEmpty()) {
                        this.passwd_ = other.passwd_;
                        this.onChanged();
                    }

                    if (!other.getVerificode().isEmpty()) {
                        this.verificode_ = other.verificode_;
                        this.onChanged();
                    }

                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public LoginMessage.LoginUser.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                LoginMessage.LoginUser parsedMessage = null;

                try {
                    parsedMessage = (LoginMessage.LoginUser)LoginMessage.LoginUser.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (LoginMessage.LoginUser)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public String getUsername() {
                Object ref = this.username_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString)ref;
                    String s = bs.toStringUtf8();
                    this.username_ = s;
                    return s;
                } else {
                    return (String)ref;
                }
            }

            public ByteString getUsernameBytes() {
                Object ref = this.username_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String)ref);
                    this.username_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public LoginMessage.LoginUser.Builder setUsername(String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.username_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public LoginMessage.LoginUser.Builder clearUsername() {
                this.username_ = LoginMessage.LoginUser.getDefaultInstance().getUsername();
                this.onChanged();
                return this;
            }

            public LoginMessage.LoginUser.Builder setUsernameBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    LoginMessage.LoginUser.checkByteStringIsUtf8(value);
                    this.username_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public String getPasswd() {
                Object ref = this.passwd_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString)ref;
                    String s = bs.toStringUtf8();
                    this.passwd_ = s;
                    return s;
                } else {
                    return (String)ref;
                }
            }

            public ByteString getPasswdBytes() {
                Object ref = this.passwd_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String)ref);
                    this.passwd_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public LoginMessage.LoginUser.Builder setPasswd(String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.passwd_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public LoginMessage.LoginUser.Builder clearPasswd() {
                this.passwd_ = LoginMessage.LoginUser.getDefaultInstance().getPasswd();
                this.onChanged();
                return this;
            }

            public LoginMessage.LoginUser.Builder setPasswdBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    LoginMessage.LoginUser.checkByteStringIsUtf8(value);
                    this.passwd_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public String getVerificode() {
                Object ref = this.verificode_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString)ref;
                    String s = bs.toStringUtf8();
                    this.verificode_ = s;
                    return s;
                } else {
                    return (String)ref;
                }
            }

            public ByteString getVerificodeBytes() {
                Object ref = this.verificode_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String)ref);
                    this.verificode_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public LoginMessage.LoginUser.Builder setVerificode(String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.verificode_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public LoginMessage.LoginUser.Builder clearVerificode() {
                this.verificode_ = LoginMessage.LoginUser.getDefaultInstance().getVerificode();
                this.onChanged();
                return this;
            }

            public LoginMessage.LoginUser.Builder setVerificodeBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    LoginMessage.LoginUser.checkByteStringIsUtf8(value);
                    this.verificode_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public final LoginMessage.LoginUser.Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return this;
            }

            public final LoginMessage.LoginUser.Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return this;
            }
        }
    }

    public interface LoginUserOrBuilder extends MessageOrBuilder {
        String getUsername();

        ByteString getUsernameBytes();

        String getPasswd();

        ByteString getPasswdBytes();

        String getVerificode();

        ByteString getVerificodeBytes();
    }
}