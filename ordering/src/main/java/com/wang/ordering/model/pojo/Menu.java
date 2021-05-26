package com.wang.ordering.model.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Menu {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("名称")
    private String name;

    private Double price;

    private String description;

    private String picture;

    private Integer sort;

    public Menu() {
    }

    public Menu(Integer id, String name, Double price, String description, String picture, Integer sort) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.picture = picture;
        this.sort = sort;
    }
}
