package com.rocketmq_quickstart.rocketmqstudy.controller;

import com.rocketmq_quickstart.rocketmqstudy.content.RocketmqConfig;
import com.rocketmq_quickstart.rocketmqstudy.producer.Producer4QuickStart;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhangyue
 * @CreatedTime 2020/5/15 14:53
 **/
@Slf4j
@RestController
public class HelloController {

    private Producer4QuickStart producer4QuickStart;

    private List<String> msgList;

    /**
     * 无参构造函数初始化一下本类
     * @return
     * @param producer4QuickStart
     */
    public HelloController(Producer4QuickStart producer4QuickStart){
        this.producer4QuickStart = producer4QuickStart;
        msgList = new ArrayList<>();
        msgList.add("法外狂徒张三");
        msgList.add("疾风剑豪亚索");
        msgList.add("卡牌大师崔斯特");
        msgList.add("无双剑姬菲奥娜");
        msgList.add("荣耀行刑官德莱文");
        msgList.add("圣枪游侠卢锡安");
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello again!";
    }

    @RequestMapping("/rocketmq")
    public Object callBack() throws Exception {
        //总共发送6次消息
        for (String s : msgList) {
            //创建生产信息
            Message message = new Message(RocketmqConfig.TOPIC, "testTag", ("英雄联盟召唤师: " + s).getBytes());
            //发送
            SendResult sendResult = producer4QuickStart.getProducer().send(message);
            log.info("输出生产者信息={}",sendResult);
        }
        return "成功";
    }
}
