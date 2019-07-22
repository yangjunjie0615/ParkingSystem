package com.project.dao;

import com.project.bean.Loginlog;
import com.project.bean.LoginlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginlogDao {
    long countByExample(LoginlogExample example);

    int deleteByExample(LoginlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Loginlog record);

    int insertSelective(Loginlog record);

    List<Loginlog> selectByExample(LoginlogExample example);

    Loginlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Loginlog record, @Param("example") LoginlogExample example);

    int updateByExample(@Param("record") Loginlog record, @Param("example") LoginlogExample example);

    int updateByPrimaryKeySelective(Loginlog record);

    int updateByPrimaryKey(Loginlog record);
}