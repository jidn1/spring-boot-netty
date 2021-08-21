package com.aqmd.netty.codec;

import io.netty.channel.Channel;

public class DefaultCodec implements Codec {
    public DefaultCodec() {
    }

    public byte[] decrypt(Channel channel, byte[] body) {
        return body;
    }

    public byte[] encrypt(Channel channel, byte[] body) {
        return body;
    }
}
