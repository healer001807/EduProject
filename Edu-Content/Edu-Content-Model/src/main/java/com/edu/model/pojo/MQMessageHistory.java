package com.edu.model.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kw
 * @program EduProject
 * @description MQ历史消息
 * @create 2023 - 06 - 05 22:17
 **/
@Data
@TableName("mq_message_history")
public class MQMessageHistory implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 流水号
     */
    private Long id;

    /**
     * 消息类型代码
     */

    private String messageType;
    /**
     * 关联业务信息
     */
    private String businessKey1;
    /**
     * 关联业务信息
     */
    private String businessKey2;
    /**
     * '关联业务信息'
     */
    private String businessKey3;
    /**
     * 通知次数
     */
    private String executeNum;
    /**
     * 处理状态，0:初始，1:成功，2:失败
     */
    private String state;
    /**
     * '回复失败时间'
     */
    private Date returnFailureDate;
    /**
     * 回复失败内容
     */
    private String returnFailureMsg;
    /**
     * '回复成功时间'
     */
    private Date returnSuccessDate;
    /**
     * '最近通知时间'
     */
    private Date executeDate;

    private String stageState1;
    private String stageState2;
    private String stageState3;
    private String stageState4;

}
