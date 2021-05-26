package com.wang.ordering.dao;

import com.wang.ordering.model.bo.RoleBo;
import com.wang.ordering.model.pojo.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {

    List<Role> selectAll(RoleBo roleBo);

    int selectCount();

    int insertRole(Role role);

    int updateByPrimaryKey(Role role);

    int deleteByPrimaryKey(Integer id);

}
