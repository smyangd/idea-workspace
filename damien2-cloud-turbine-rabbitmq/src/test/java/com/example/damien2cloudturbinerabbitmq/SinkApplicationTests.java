package com.example.damien2cloudturbinerabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@EnableBinding(value = {SinkApplicationTests.SinkSender.class})
public class SinkApplicationTests {

    @Autowired
    private SinkSender sinkSender;

    @Test
    public void sinkSenderTester() {
        sinkSender.output().send(MessageBuilder.withPayload("produce a message ：http://baidu.com").build());
    }

    public interface SinkSender {

        String OUTPUT = "input";

        @Output(SinkSender.OUTPUT)
        MessageChannel output();

    }


    @Bean
    @InboundChannelAdapter(value = Source.OUTPUT, poller = @Poller(fixedDelay = "2000"))
    public static MessageSource<String> timerMessageSource() {
        return () -> new GenericMessage<>("{\"name\":\"didi\", \"age\":30}");
    }

    @Test
    public void timerMessageSourceTest(){
        timerMessageSource();
    }

}