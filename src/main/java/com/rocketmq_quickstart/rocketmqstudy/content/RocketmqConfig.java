package com.rocketmq_quickstart.rocketmqstudy.content;

/**
 * @Author zhangyue
 * @Description: 安装实际开发这里的信息 都是应该写在配置里，来读取，这里为了方便所以写成常量
 * @CreatedTime 2020/5/15 15:42
 **/
public class RocketmqConfig {
    /**
     * Name Server 地址，要是集群部署 就用 分号 隔开，如127.0.0.1：9876; 127.0.0.1:9877
     */
    public static final String NAME_SERVER = "127.0.0.1:9876";
//    public static final String NAME_SERVER = "10.38.15.37:10911";
    /**
     * 主题名称 主题一般是服务器设置好 而不能在代码里去新建topic（ 如果没有创建好，生产者往该主题发送消息 会报找不到topic错误）
     */
    public static final String TOPIC = "topic_hero";
}
