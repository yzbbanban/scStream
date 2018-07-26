package com.yzbbanban.receiver;

import org.apache.log4j.Logger;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author wangban
 * @date 11:48 2018/7/26
 */
@EnableBinding(Sink.class)
public class SinkReceiver {
    private static Logger logger = Logger.getLogger(SinkReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receiver(Object payload) {
        logger.info("Receiver: " + payload);
    }

}
