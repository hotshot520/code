package com.wang.ordering.dao;

import com.wang.ordering.model.bo.MenuBo;
import com.wang.ordering.model.pojo.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapper {

    List<Menu> selectAll(MenuBo moleBo);

    int selectCount();

    int insertMenu(Menu menu);

    int updateByPrimaryKey(Menu menu);

    int deleteByPrimaryKey(Integer id);

}
