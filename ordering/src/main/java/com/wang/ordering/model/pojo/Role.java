package com.wang.ordering.model.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Role {
    @ApiModelProperty("id")
    private Integer id;

    private String account;

    private String username;

    private String password;

    private Integer role;

    public Role() {
    }

    public Role(Integer id, String account, String username, String password, Integer role) {
        this.id = id;
        this.account = account;
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
