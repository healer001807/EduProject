package com.edu.model.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kw
 * @program EduProject
 * @description 课程作业信息
 * @create 2023 - 06 - 05 21:53
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("teach_plan_work")
public class TeachPlanWork implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 流水号
     */
    private Long id;
    /**
     * 作业信息标识
     */
    private Long workId;
    /**
     * 作业标题
     */
    private String workTitle;
    /**
     * 课程计划标识
     */
    @TableField("teachplanId")
    private Long teachPlanId;
    /**
     * 课程标识
     */
    private Long courseId;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createDate;

    /**
     * 课程发布ID
     */
    private Long coursePubId;
}
