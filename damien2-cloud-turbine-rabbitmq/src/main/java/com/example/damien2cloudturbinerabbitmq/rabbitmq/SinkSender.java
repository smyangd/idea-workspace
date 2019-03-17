package com.example.damien2cloudturbinerabbitmq.rabbitmq;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;

@EnableBinding(value = {Source.class})
public class SinkSender {
    private static Logger logger = LoggerFactory.getLogger(SinkSender.class);

    //private String format="yyyy-mm-dd  HH:mm:ss";
    private Integer i = 0;

    @Bean
    @InboundChannelAdapter(value = Source.OUTPUT, poller = @Poller(fixedDelay = "2000", maxMessagesPerPoll = "1"))
    public MessageSource<Integer> timerMessageSource() {

        System.out.println("MessageSource");
        //return () -> new GenericMessage<>(new SimpleDateFormat(format).format(new Date()));
        //return () -> new GenericMessage<>("wo ai ni wo de jia");
        //return () -> new GenericMessage<>("{\"name\":\"didi\",\"age\":30}");

        return () -> new GenericMessage<>(i++);

    }

}