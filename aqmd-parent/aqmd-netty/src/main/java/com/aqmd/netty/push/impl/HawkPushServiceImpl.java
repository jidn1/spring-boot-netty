package com.aqmd.netty.push.impl;

import com.aqmd.netty.common.constant.NettyResponseCode;
import com.aqmd.netty.entity.ResponsePacket;
import com.aqmd.netty.push.HawkPushServiceApi;
import com.google.protobuf.MessageLite;
import io.netty.channel.Channel;
import io.netty.channel.ChannelPromise;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HawkPushServiceImpl implements HawkPushServiceApi {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final int MIN_SEQ_ID = 536870911;
    private static AtomicInteger idWoker = new AtomicInteger(536870911);

    public HawkPushServiceImpl() {
    }

    public void pushMsg(Set<Channel> channels, short cmd, String msg) {
        if (!CollectionUtils.isEmpty(channels)) {
            Iterator iterable = channels.iterator();

            while(iterable.hasNext()) {
                Channel channel = (Channel)iterable.next();

                try {
                    if (channel != null && channel.isActive()) {
                        channel.writeAndFlush(this.buildResponsePacket(cmd, msg.getBytes()));
                    } else {
                        this.logger.debug("推送通道被关闭，移除该推送通道");
                        iterable.remove();
                        this.logger.debug("通道移除结果:true");
                    }
                } catch (Exception e) {
                    this.logger.error(e.getMessage(), e);
                }
            }

        }
    }

    public void pushMsg(Set<Channel> channels, short cmd, byte[] msg) {
        if (channels != null && !CollectionUtils.isEmpty(channels)) {
            try {
                Iterator iterable = channels.iterator();

                while(true) {
                    while(iterable.hasNext()) {
                        Channel channel = (Channel)iterable.next();
                        if (channel != null && channel.isActive()) {
                            channel.writeAndFlush(this.buildResponsePacket(cmd, msg));
                        } else {
                            this.logger.debug("推送通道被关闭，移除该推送通道");
                            iterable.remove();
                            this.logger.debug("通道移除结果:true");
                        }
                    }

                    return;
                }
            } catch (Exception e) {
                this.logger.error(e.getMessage(), e);
            }
        }
    }

    public void pushMsg(Set<Channel> channels, short cmd, MessageLite msg) {
        if (channels != null && !CollectionUtils.isEmpty(channels)) {
            try {
                Iterator iterable = channels.iterator();

                while(true) {
                    while(iterable.hasNext()) {
                        Channel channel = (Channel)iterable.next();
                        if (channel != null && channel.isActive()) {
                            channel.writeAndFlush(this.buildResponsePacket(cmd, msg.toByteArray()));
                        } else {
                            this.logger.debug("推送通道被关闭，移除该推送通道");
                            iterable.remove();
                            this.logger.debug("通道移除结果:true");
                        }
                    }

                    return;
                }
            } catch (Exception e) {
                this.logger.error(e.getMessage(), e);
            }
        }
    }

    public Map<String, ChannelPromise> syncPushMsg(Set<Channel> channels, short cmd, String msg) {
        if (CollectionUtils.isEmpty(channels)) {
            return null;
        } else {
            Map<String, ChannelPromise> channelPromiseMap = new HashMap();
            Iterator iterable = channels.iterator();

            while(iterable.hasNext()) {
                Channel channel = (Channel)iterable.next();

                try {
                    if (channel != null && channel.isActive()) {
                        channelPromiseMap.put(channel.id().asLongText(), channel.writeAndFlush(this.buildResponsePacket(cmd, msg.getBytes())).channel().newPromise());
                    } else {
                        this.logger.debug("推送通道被关闭，移除该推送通道");
                        iterable.remove();
                        this.logger.debug("通道移除结果:true");
                    }
                } catch (Exception e) {
                    this.logger.error(e.getMessage(), e);
                }
            }

            return channelPromiseMap;
        }
    }

    public Map<String, ChannelPromise> syncPushMsg(Set<Channel> channels, short cmd, byte[] msg) {
        if (CollectionUtils.isEmpty(channels)) {
            return null;
        } else {
            Map<String, ChannelPromise> channelPromiseMap = new HashMap();
            Iterator iterable = channels.iterator();

            while(iterable.hasNext()) {
                Channel channel = (Channel)iterable.next();

                try {
                    if (channel != null && channel.isActive()) {
                        channelPromiseMap.put(channel.id().asLongText(), channel.writeAndFlush(this.buildResponsePacket(cmd, msg)).channel().newPromise());
                    } else {
                        this.logger.debug("推送通道被关闭，移除该推送通道");
                        iterable.remove();
                        this.logger.debug("通道移除结果:true");
                    }
                } catch (Exception e) {
                    this.logger.error(e.getMessage(), e);
                }
            }

            return channelPromiseMap;
        }
    }

    public Map<String, ChannelPromise> syncPushMsg(Set<Channel> channels, short cmd, MessageLite msg) {
        if (CollectionUtils.isEmpty(channels)) {
            return null;
        } else {
            Map<String, ChannelPromise> channelPromiseMap = new HashMap();
            Iterator iterable = channels.iterator();

            while(iterable.hasNext()) {
                Channel channel = (Channel)iterable.next();

                try {
                    if (channel != null && channel.isActive()) {
                        channelPromiseMap.put(channel.id().asLongText(), channel.writeAndFlush(this.buildResponsePacket(cmd, msg.toByteArray())).channel().newPromise());
                    } else {
                        this.logger.debug("推送通道被关闭，移除该推送通道");
                        iterable.remove();
                        this.logger.debug("通道移除结果:true");
                    }
                } catch (Exception e) {
                    this.logger.error(e.getMessage(), e);
                }
            }

            return channelPromiseMap;
        }
    }

    private ResponsePacket buildResponsePacket(short cmd, byte[] body) {
        ResponsePacket packet = new ResponsePacket();
        packet.setCmd(cmd);
        packet.setSequenceId((long)nextSeqId());
        packet.setCode(NettyResponseCode.SUCCESS.getResponseCode());
        packet.setBody(body);
        return packet;
    }

    private static int nextSeqId() {
        int seqId;
        for(seqId = idWoker.getAndIncrement(); seqId < 536870911; seqId = idWoker.addAndGet(536870911)) {
        }
        return seqId;
    }
}