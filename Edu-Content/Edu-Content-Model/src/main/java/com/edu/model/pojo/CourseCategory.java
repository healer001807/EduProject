package com.edu.model.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author kw
 * @program EduProject
 * @description 课程分类
 * @create 2023 - 06 - 05 21:35
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("course_category")
public class CourseCategory implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 流水号
     */
    private Long id;
    /**
     * 分类名
     */
    @TableField("name")
    private String categoryName;
    /**
     * 分类标签
     */
    @TableField("label")
    private String categoryLabel;
    /**
     * 父级ID
     */
    @TableField("parentid")
    private String parentId;
    /**
     * 是否显示
     */
    private Integer isShow;
    /**
     * 是否排序
     */
    @TableField("orderby")
    private Integer orderBy;
    /**
     * 是否叶子节点
     */
    private Integer isLeaf;
}
