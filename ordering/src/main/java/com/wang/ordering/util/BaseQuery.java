package com.wang.ordering.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 查询对象基类
 */
@ApiModel()
@Setter
@Getter
public class BaseQuery {
    private Integer id;

    @ApiModelProperty(value = "每页条数 默认10")
    private Integer pageSize = 10;

    @ApiModelProperty(value = "当前页数 默认1")
    private Integer pageNum = 1;

    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

}
