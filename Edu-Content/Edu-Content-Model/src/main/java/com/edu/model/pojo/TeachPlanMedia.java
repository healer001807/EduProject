package com.edu.model.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("teach_plan_media")
public class TeachPlanMedia implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 媒资文件id
     */
    private String mediaId;
    /**
     * 课程计划标识
     */
    @TableField("teachplan_id")
    private Long teachPlanId;
    /**
     * 课程标识
     */
    private Long courseId;
    /**
     * 媒资文件原始名称
     */
    @TableField("media_fileName")
    private String mediaFilename;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createDate;
    /**
     * 创建人
     */
    private String createPeople;
    /**
     * 修改人
     */
    private String changePeople;

}
