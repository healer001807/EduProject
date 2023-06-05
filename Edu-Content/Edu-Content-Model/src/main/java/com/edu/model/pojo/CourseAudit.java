package com.edu.model.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kw
 * @program EduProject
 * @description 审核课程实体
 * @create 2023 - 06 - 05 21:23
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("course_audit")
public class CourseAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 流水号
     */
    private Long id;
    /**
     * 课程id
     */
    private Long courseId;
    /**
     * 审核意见
     */
    private String auditMind;
    /**
     * 审核状态
     */
    private String auditStatus;
    /**
     * 审核人
     */
    private String auditPeople;
    /**
     * 审核时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date auditDate;
}
