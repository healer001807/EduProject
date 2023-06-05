package com.edu.model.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author kw
 * @program EduProject
 * @description 课程计划
 * @create 2023 - 06 - 05 21:35
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("teach_plan")
public class TeachPlan implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 课程计划名称
     */
    @TableField("pname")
    private String teachPlanName;
    /**
     * 课程计划父级Id
     */
    @TableField("parentid")
    private Long parentId;
    /**
     * 层级，分为1、2、3级
     */
    private Integer grade;
    /**
     * 课程类型:1视频、2文档
     */
    private String mediaType;
    /**
     * 开始直播时间
     */
    private LocalDateTime startTime;
    /**
     * 直播结束时间
     */
    private LocalDateTime endTime;
    /**
     * 章节及课程时介绍
     */
    private String description;
    /**
     * 时长，单位时:分:秒
     */
    @TableField("timelength")
    private String timeLength;
    /**
     * 排序字段
     */
    @TableField("orderby")
    private Integer orderBy;

    /**
     * 课程标识
     */
    private Long courseId;
    /**
     * 课程发布标识
     */
    private Long coursePubId;
    /**
     * 状态（1正常  0删除）
     */
    private Integer status;
    /**
     * 是否支持试学或预览（试看）
     */
    private String isPreview;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createDate;

    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime changeDate;

}
