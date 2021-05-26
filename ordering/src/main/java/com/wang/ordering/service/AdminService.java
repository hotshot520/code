package com.wang.ordering.service;

import com.wang.ordering.dao.MenuMapper;
import com.wang.ordering.dao.RoleMapper;
import com.wang.ordering.model.bo.MenuBo;
import com.wang.ordering.model.bo.RoleBo;
import com.wang.ordering.model.pojo.Menu;
import com.wang.ordering.model.pojo.Role;
import com.wang.ordering.util.ApiResult;
import com.wang.ordering.util.AppException;
import com.wang.ordering.util.BaseApi;
import com.wang.ordering.util.EmptyUtils;
import com.wang.ordering.util.pageBean.PageBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminService extends BaseApi {

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private MenuMapper menuMapper;

    /*public ApiResult login(){
    }*/

    public PageBean<Role> selectAll(Integer pageNum, Integer pageSize) {
        RoleBo roleBo = new RoleBo();
        roleBo.setPageNum(pageNum);
        roleBo.setPageSize(pageSize);
        List<Role> roles = roleMapper.selectAll(roleBo);
        if (EmptyUtils.isEmpty(roles)) {
            return new PageBean<>(pageNum, pageSize, 0, null);
        }
        int count = roleMapper.selectCount();
        return new PageBean<>(roleBo.getPageNum(), pageSize, count, roles);
    }

    public ApiResult addRole(Role role) {
        int i = roleMapper.insertRole(role);
        if (i != 1) {
            throw new AppException("操作失败", 403);
        }
        return success("新增成功");
    }

    public ApiResult updateRole(Role role) {
        int i = roleMapper.updateByPrimaryKey(role);
        if (i != 1) {
            throw new AppException("操作失败", 403);
        }
        return success("修改成功");
    }

    public ApiResult deleteRole(Integer id) {
        int i = roleMapper.deleteByPrimaryKey(id);
        if (i != 1) {
            throw new AppException("操作失败", 403);
        }
        return success("删除成功");
    }

    public PageBean<Menu> selectAllMenu(Integer pageNum, Integer pageSize) {
        MenuBo menuBo=new MenuBo();
        menuBo.setPageNum(pageNum);
        menuBo.setPageSize(pageSize);
        List<Menu> menus = menuMapper.selectAll(menuBo);
        if (EmptyUtils.isEmpty(menus)) {
            return new PageBean<>(pageNum, pageSize, 0, null);
        }
        int count = roleMapper.selectCount();
        return new PageBean<>(menuBo.getPageNum(), pageSize, count, menus);
    }

    public ApiResult addMenu(Menu menu) {
        int i = menuMapper.insertMenu(menu);
        if (i != 1) {
            throw new AppException("操作失败", 403);
        }
        return success("新增成功");
    }

    public ApiResult updateMenu(Menu menu) {
        int i = menuMapper.updateByPrimaryKey(menu);
        if (i != 1) {
            throw new AppException("操作失败", 403);
        }
        return success("修改成功");
    }

    public ApiResult deleteMenu(Integer id) {
        int i = menuMapper.deleteByPrimaryKey(id);
        if (i != 1) {
            throw new AppException("操作失败", 403);
        }
        return success("删除成功");
    }

}
