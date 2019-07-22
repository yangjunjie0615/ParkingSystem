package com.project.dao;

import com.project.bean.Actionlog;
import com.project.bean.ActionlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionlogDao {
    long countByExample(ActionlogExample example);

    int deleteByExample(ActionlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Actionlog record);

    int insertSelective(Actionlog record);

    List<Actionlog> selectByExample(ActionlogExample example);

    Actionlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Actionlog record, @Param("example") ActionlogExample example);

    int updateByExample(@Param("record") Actionlog record, @Param("example") ActionlogExample example);

    int updateByPrimaryKeySelective(Actionlog record);

    int updateByPrimaryKey(Actionlog record);
}