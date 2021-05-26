package com.wang.ordering.model.bo;

import com.wang.ordering.util.BaseQuery;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RoleBo extends BaseQuery {

    private Integer id;

    private String account;

    private String username;

    private String password;

    private Integer role;

    public RoleBo() {
    }

    public RoleBo(Integer id, String account, String username, String password, Integer role) {
        this.id = id;
        this.account = account;
        this.username = username;
        this.password = password;
        this.role = role;
    }
}

