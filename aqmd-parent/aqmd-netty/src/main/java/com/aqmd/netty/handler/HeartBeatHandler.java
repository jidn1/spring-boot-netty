package com.aqmd.netty.handler;

import com.aqmd.netty.annotation.HawkBean;
import com.aqmd.netty.annotation.HawkMethod;
import com.aqmd.netty.common.constant.NettyResponseCode;
import com.aqmd.netty.entity.HawkResponseMessage.CommonResult;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@HawkBean
public class HeartBeatHandler {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public HeartBeatHandler() {
    }

    @HawkMethod(
        cmd = 11004,
        version = 1
    )
    public CommonResult heartBeat(long seqId, byte[] body, ChannelHandlerContext ctx) {
        return CommonResult.newBuilder().setResultCode(NettyResponseCode.SUCCESS.getResponseCode()).setResultMsg("").build();
    }
}