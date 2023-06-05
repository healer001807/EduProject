package com.edu.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kw
 * @program EduProject
 * @description 分页参数
 * @create 2023 - 06 - 05 21:18
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {

    // 当前页码
    private Long pageNum = 1L;
    // 每页显示数，默认一页显示30条数据
    private Long pageSize = 30L;
}
