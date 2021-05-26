package com.wang.ordering.model.bo;

import com.wang.ordering.util.BaseQuery;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MenuBo extends BaseQuery {

    private Integer id;

    private String name;

    private Double price;

    private String description;

    private String picture;

    private Integer sort;

    public MenuBo() {
    }

    public MenuBo(Integer id, String name, Double price, String description, String picture, Integer sort) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.picture = picture;
        this.sort = sort;
    }
}
