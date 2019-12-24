package com.crm.mapper;

import com.crm.bean.CstActivity;
import com.crm.bean.CstActivityExample;
import com.crm.bean.CstLinkman;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstActivityMapper extends IBaseMapper<CstActivity>{
    int countByExample(CstActivityExample example);

    int deleteByExample(CstActivityExample example);

    int deleteByPrimaryKey(Long atvId);

    int insert(CstActivity record);

    int insertSelective(CstActivity record);

    List<CstActivity> selectByExample(CstActivityExample example);

    CstActivity selectByPrimaryKey(Long atvId);

    int updateByExampleSelective(@Param("record") CstActivity record, @Param("example") CstActivityExample example);

    int updateByExample(@Param("record") CstActivity record, @Param("example") CstActivityExample example);

    int updateByPrimaryKeySelective(CstActivity record);

    int updateByPrimaryKey(CstActivity record);
}