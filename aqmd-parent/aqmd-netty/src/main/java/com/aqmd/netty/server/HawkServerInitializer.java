package com.aqmd.netty.server;

import com.aqmd.netty.codec.Codec;
import com.aqmd.netty.codec.HawkServerDecoder;
import com.aqmd.netty.codec.HawkServerEncoder;
import com.aqmd.netty.configuration.NettyProperties;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.IdleStateHandler;
import org.springframework.beans.factory.annotation.Autowired;

public class HawkServerInitializer extends ChannelInitializer<SocketChannel> {
    @Autowired
    private Codec codec;
    @Autowired
    private HawkServerHandler handler;
    @Autowired
    private NettyProperties nettyProperties;

    public HawkServerInitializer() {
    }

    protected void initChannel(SocketChannel socketChannel) {
        String var3 = this.nettyProperties.getServiceLoggerLevel();
        byte var4 = -1;
        switch(var3.hashCode()) {
        case 3237038:
            if (var3.equals("info")) {
                var4 = 1;
            }
            break;
        case 3641990:
            if (var3.equals("warn")) {
                var4 = 2;
            }
            break;
        case 95458899:
            if (var3.equals("debug")) {
                var4 = 0;
            }
            break;
        case 96784904:
            if (var3.equals("error")) {
                var4 = 3;
            }
        }

        LogLevel logLevel;
        switch(var4) {
        case 0:
            logLevel = LogLevel.DEBUG;
            break;
        case 1:
            logLevel = LogLevel.INFO;
            break;
        case 2:
            logLevel = LogLevel.WARN;
            break;
        case 3:
            logLevel = LogLevel.ERROR;
            break;
        default:
            logLevel = LogLevel.ERROR;
        }

        socketChannel.pipeline().addLast("logger", new LoggingHandler(logLevel)).addFirst(new ChannelHandler[]{new LengthFieldBasedFrameDecoder(this.nettyProperties.getMaxFrameLength(), 0, this.nettyProperties.getPacketHeaderLength(), -this.nettyProperties.getPacketHeaderLength(), 0)}).addLast("decoder", new HawkServerDecoder(this.codec)).addLast("encoder", new HawkServerEncoder(this.codec)).addLast("idle", new IdleStateHandler(this.nettyProperties.getReaderIdle(), this.nettyProperties.getWriterIdle(), this.nettyProperties.getBothIdle())).addLast("handler", this.handler);
    }
}