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

public final class HawkResponseMessage {
    private static final Descriptor internal_static_tutorial_CommonResult_descriptor;
    private static final FieldAccessorTable internal_static_tutorial_CommonResult_fieldAccessorTable;
    private static FileDescriptor descriptor;

    private HawkResponseMessage() {
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
        String[] descriptorData = new String[]{"\n\u0012HawkResponse.proto\u0012\btutorial\"5\n\fCommonResult\u0012\u0012\n\nresultCode\u0018\u0001 \u0001(\u0005\u0012\u0011\n\tresultMsg\u0018\u0002 \u0001(\tB,\n\u0015com.spark.hawk.entityB\u0013HawkResponseMessageb\u0006proto3"};
        InternalDescriptorAssigner assigner = new InternalDescriptorAssigner() {
            public ExtensionRegistry assignDescriptors(FileDescriptor root) {
                HawkResponseMessage.descriptor = root;
                return null;
            }
        };
        FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new FileDescriptor[0], assigner);
        internal_static_tutorial_CommonResult_descriptor = (Descriptor)getDescriptor().getMessageTypes().get(0);
        internal_static_tutorial_CommonResult_fieldAccessorTable = new FieldAccessorTable(internal_static_tutorial_CommonResult_descriptor, new String[]{"ResultCode", "ResultMsg"});
    }

    public static final class CommonResult extends GeneratedMessageV3 implements HawkResponseMessage.CommonResultOrBuilder {
        public static final int RESULTCODE_FIELD_NUMBER = 1;
        private int resultCode_;
        public static final int RESULTMSG_FIELD_NUMBER = 2;
        private volatile Object resultMsg_;
        private byte memoizedIsInitialized;
        private static final long serialVersionUID = 0L;
        private static final HawkResponseMessage.CommonResult DEFAULT_INSTANCE = new HawkResponseMessage.CommonResult();
        private static final Parser<HawkResponseMessage.CommonResult> PARSER = new AbstractParser<HawkResponseMessage.CommonResult>() {
            public HawkResponseMessage.CommonResult parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return new HawkResponseMessage.CommonResult(input, extensionRegistry);
            }
        };

        private CommonResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }

        private CommonResult() {
            this.memoizedIsInitialized = -1;
            this.resultCode_ = 0;
            this.resultMsg_ = "";
        }

        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        private CommonResult(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            boolean var3 = false;

            try {
                boolean done = false;

                while(!done) {
                    int tag = input.readTag();
                    switch(tag) {
                    case 0:
                        done = true;
                        break;
                    case 8:
                        this.resultCode_ = input.readInt32();
                        break;
                    case 18:
                        String s = input.readStringRequireUtf8();
                        this.resultMsg_ = s;
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
            return HawkResponseMessage.internal_static_tutorial_CommonResult_descriptor;
        }

        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return HawkResponseMessage.internal_static_tutorial_CommonResult_fieldAccessorTable.ensureFieldAccessorsInitialized(HawkResponseMessage.CommonResult.class, HawkResponseMessage.CommonResult.Builder.class);
        }

        public int getResultCode() {
            return this.resultCode_;
        }

        public String getResultMsg() {
            Object ref = this.resultMsg_;
            if (ref instanceof String) {
                return (String)ref;
            } else {
                ByteString bs = (ByteString)ref;
                String s = bs.toStringUtf8();
                this.resultMsg_ = s;
                return s;
            }
        }

        public ByteString getResultMsgBytes() {
            Object ref = this.resultMsg_;
            if (ref instanceof String) {
                ByteString b = ByteString.copyFromUtf8((String)ref);
                this.resultMsg_ = b;
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
            if (this.resultCode_ != 0) {
                output.writeInt32(1, this.resultCode_);
            }

            if (!this.getResultMsgBytes().isEmpty()) {
                GeneratedMessageV3.writeString(output, 2, this.resultMsg_);
            }

        }

        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            } else {
                size = 0;
                if (this.resultCode_ != 0) {
                    size += CodedOutputStream.computeInt32Size(1, this.resultCode_);
                }

                if (!this.getResultMsgBytes().isEmpty()) {
                    size += GeneratedMessageV3.computeStringSize(2, this.resultMsg_);
                }

                this.memoizedSize = size;
                return size;
            }
        }

        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            } else if (!(obj instanceof HawkResponseMessage.CommonResult)) {
                return super.equals(obj);
            } else {
                HawkResponseMessage.CommonResult other = (HawkResponseMessage.CommonResult)obj;
                boolean result = true;
                result = result && this.getResultCode() == other.getResultCode();
                result = result && this.getResultMsg().equals(other.getResultMsg());
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
                hash = 53 * hash + this.getResultCode();
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getResultMsg().hashCode();
                hash = 29 * hash + this.unknownFields.hashCode();
                this.memoizedHashCode = hash;
                return hash;
            }
        }

        public static HawkResponseMessage.CommonResult parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (HawkResponseMessage.CommonResult)PARSER.parseFrom(data);
        }

        public static HawkResponseMessage.CommonResult parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HawkResponseMessage.CommonResult)PARSER.parseFrom(data, extensionRegistry);
        }

        public static HawkResponseMessage.CommonResult parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (HawkResponseMessage.CommonResult)PARSER.parseFrom(data);
        }

        public static HawkResponseMessage.CommonResult parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HawkResponseMessage.CommonResult)PARSER.parseFrom(data, extensionRegistry);
        }

        public static HawkResponseMessage.CommonResult parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (HawkResponseMessage.CommonResult)PARSER.parseFrom(data);
        }

        public static HawkResponseMessage.CommonResult parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (HawkResponseMessage.CommonResult)PARSER.parseFrom(data, extensionRegistry);
        }

        public static HawkResponseMessage.CommonResult parseFrom(InputStream input) throws IOException {
            return (HawkResponseMessage.CommonResult)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static HawkResponseMessage.CommonResult parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HawkResponseMessage.CommonResult)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static HawkResponseMessage.CommonResult parseDelimitedFrom(InputStream input) throws IOException {
            return (HawkResponseMessage.CommonResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static HawkResponseMessage.CommonResult parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HawkResponseMessage.CommonResult)GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static HawkResponseMessage.CommonResult parseFrom(CodedInputStream input) throws IOException {
            return (HawkResponseMessage.CommonResult)GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static HawkResponseMessage.CommonResult parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (HawkResponseMessage.CommonResult)GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
        }

        public HawkResponseMessage.CommonResult.Builder newBuilderForType() {
            return newBuilder();
        }

        public static HawkResponseMessage.CommonResult.Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HawkResponseMessage.CommonResult.Builder newBuilder(HawkResponseMessage.CommonResult prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public HawkResponseMessage.CommonResult.Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new HawkResponseMessage.CommonResult.Builder() : (new HawkResponseMessage.CommonResult.Builder()).mergeFrom(this);
        }

        protected HawkResponseMessage.CommonResult.Builder newBuilderForType(BuilderParent parent) {
            HawkResponseMessage.CommonResult.Builder builder = new HawkResponseMessage.CommonResult.Builder(parent);
            return builder;
        }

        public static HawkResponseMessage.CommonResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<HawkResponseMessage.CommonResult> parser() {
            return PARSER;
        }

        public Parser<HawkResponseMessage.CommonResult> getParserForType() {
            return PARSER;
        }

        public HawkResponseMessage.CommonResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<HawkResponseMessage.CommonResult.Builder> implements HawkResponseMessage.CommonResultOrBuilder {
            private int resultCode_;
            private Object resultMsg_;

            public static final Descriptor getDescriptor() {
                return HawkResponseMessage.internal_static_tutorial_CommonResult_descriptor;
            }

            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return HawkResponseMessage.internal_static_tutorial_CommonResult_fieldAccessorTable.ensureFieldAccessorsInitialized(HawkResponseMessage.CommonResult.class, HawkResponseMessage.CommonResult.Builder.class);
            }

            private Builder() {
                this.resultMsg_ = "";
                this.maybeForceBuilderInitialization();
            }

            private Builder(BuilderParent parent) {
                super(parent);
                this.resultMsg_ = "";
                this.maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (HawkResponseMessage.CommonResult.alwaysUseFieldBuilders) {
                }

            }

            public HawkResponseMessage.CommonResult.Builder clear() {
                super.clear();
                this.resultCode_ = 0;
                this.resultMsg_ = "";
                return this;
            }

            public Descriptor getDescriptorForType() {
                return HawkResponseMessage.internal_static_tutorial_CommonResult_descriptor;
            }

            public HawkResponseMessage.CommonResult getDefaultInstanceForType() {
                return HawkResponseMessage.CommonResult.getDefaultInstance();
            }

            public HawkResponseMessage.CommonResult build() {
                HawkResponseMessage.CommonResult result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                } else {
                    return result;
                }
            }

            public HawkResponseMessage.CommonResult buildPartial() {
                HawkResponseMessage.CommonResult result = new HawkResponseMessage.CommonResult(this);
                result.resultCode_ = this.resultCode_;
                result.resultMsg_ = this.resultMsg_;
                this.onBuilt();
                return result;
            }

            public HawkResponseMessage.CommonResult.Builder clone() {
                return (HawkResponseMessage.CommonResult.Builder)super.clone();
            }

            public HawkResponseMessage.CommonResult.Builder setField(FieldDescriptor field, Object value) {
                return (HawkResponseMessage.CommonResult.Builder)super.setField(field, value);
            }

            public HawkResponseMessage.CommonResult.Builder clearField(FieldDescriptor field) {
                return (HawkResponseMessage.CommonResult.Builder)super.clearField(field);
            }

            public HawkResponseMessage.CommonResult.Builder clearOneof(OneofDescriptor oneof) {
                return (HawkResponseMessage.CommonResult.Builder)super.clearOneof(oneof);
            }

            public HawkResponseMessage.CommonResult.Builder setRepeatedField(FieldDescriptor field, int index, Object value) {
                return (HawkResponseMessage.CommonResult.Builder)super.setRepeatedField(field, index, value);
            }

            public HawkResponseMessage.CommonResult.Builder addRepeatedField(FieldDescriptor field, Object value) {
                return (HawkResponseMessage.CommonResult.Builder)super.addRepeatedField(field, value);
            }

            public HawkResponseMessage.CommonResult.Builder mergeFrom(Message other) {
                if (other instanceof HawkResponseMessage.CommonResult) {
                    return this.mergeFrom((HawkResponseMessage.CommonResult)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public HawkResponseMessage.CommonResult.Builder mergeFrom(HawkResponseMessage.CommonResult other) {
                if (other == HawkResponseMessage.CommonResult.getDefaultInstance()) {
                    return this;
                } else {
                    if (other.getResultCode() != 0) {
                        this.setResultCode(other.getResultCode());
                    }

                    if (!other.getResultMsg().isEmpty()) {
                        this.resultMsg_ = other.resultMsg_;
                        this.onChanged();
                    }

                    this.onChanged();
                    return this;
                }
            }

            public final boolean isInitialized() {
                return true;
            }

            public HawkResponseMessage.CommonResult.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                HawkResponseMessage.CommonResult parsedMessage = null;

                try {
                    parsedMessage = (HawkResponseMessage.CommonResult)HawkResponseMessage.CommonResult.PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (InvalidProtocolBufferException var8) {
                    parsedMessage = (HawkResponseMessage.CommonResult)var8.getUnfinishedMessage();
                    throw var8.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }

                }

                return this;
            }

            public int getResultCode() {
                return this.resultCode_;
            }

            public HawkResponseMessage.CommonResult.Builder setResultCode(int value) {
                this.resultCode_ = value;
                this.onChanged();
                return this;
            }

            public HawkResponseMessage.CommonResult.Builder clearResultCode() {
                this.resultCode_ = 0;
                this.onChanged();
                return this;
            }

            public String getResultMsg() {
                Object ref = this.resultMsg_;
                if (!(ref instanceof String)) {
                    ByteString bs = (ByteString)ref;
                    String s = bs.toStringUtf8();
                    this.resultMsg_ = s;
                    return s;
                } else {
                    return (String)ref;
                }
            }

            public ByteString getResultMsgBytes() {
                Object ref = this.resultMsg_;
                if (ref instanceof String) {
                    ByteString b = ByteString.copyFromUtf8((String)ref);
                    this.resultMsg_ = b;
                    return b;
                } else {
                    return (ByteString)ref;
                }
            }

            public HawkResponseMessage.CommonResult.Builder setResultMsg(String value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    this.resultMsg_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public HawkResponseMessage.CommonResult.Builder clearResultMsg() {
                this.resultMsg_ = HawkResponseMessage.CommonResult.getDefaultInstance().getResultMsg();
                this.onChanged();
                return this;
            }

            public HawkResponseMessage.CommonResult.Builder setResultMsgBytes(ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                } else {
                    HawkResponseMessage.CommonResult.checkByteStringIsUtf8(value);
                    this.resultMsg_ = value;
                    this.onChanged();
                    return this;
                }
            }

            public final HawkResponseMessage.CommonResult.Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return this;
            }

            public final HawkResponseMessage.CommonResult.Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return this;
            }
        }
    }

    public interface CommonResultOrBuilder extends MessageOrBuilder {
        int getResultCode();

        String getResultMsg();

        ByteString getResultMsgBytes();
    }
}