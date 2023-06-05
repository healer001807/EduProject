package com.edu.model.pojo;

/**
 * @author kw
 * @program EduProject
 * @description 课程信息实体
 * @create 2023 - 06 - 05 21:27
 **/

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("course_base")
public class CourseBase implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 流水号
     */
    private Long id;
    /**
     * 机构ID
     */
    private Long courseId;
    /**
     * 机构名称
     */
    private String companyName;
    /**
     * 课程名称
     */
    @TableField("name")
    private String courseName;
    /**
     * 使用人群
     */
    @TableField("users")
    private String adaptUsers;
    /**
     * 课程标签
     */
    @TableField("tags")
    private String courseTags;
    /**
     * 大分类
     */
    private String mt;
    /**
     * 小分类
     */
    private String st;
    /**
     * 课程等级
     */
    private String grade;
    /**
     * 教育模式 common-普通 record-录播 live-直播
     */
    @TableField("teachermode")
    private String teacherMode;
    /**
     * 课程介绍
     */
    private String description;
    /**
     * 课程图片
     */
    @TableField("pic")
    private String coursePic;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date courseDate;
    /**
     * 修改时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date changeDate;
    /**
     * 创建人
     */
    private String createPeople;
    /**
     * 更新人
     */
    private String changePeople;
    /**
     * 审核状态
     */
    private String auditStatus;
    /**
     * 课程发布状态 未发布 已发布 已下线
     */
    @TableField("status")
    private String courseStatus;


}
