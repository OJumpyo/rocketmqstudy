package com.rocketmq_quickstart.rocketmqstudy.content;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @Author zhangyue
 * @CreatedTime 2020/5/15 15:29
 **/
@ToString
@AllArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
@Data
public class Content4QuickStart {
    private String userName;
    private String password;
}
