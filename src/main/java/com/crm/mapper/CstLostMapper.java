package com.crm.mapper;

import com.crm.bean.CstLost;
import com.crm.bean.CstLostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstLostMapper extends IBaseMapper<CstLost>{
    int countByExample(CstLostExample example);

    int deleteByExample(CstLostExample example);

    int deleteByPrimaryKey(Long lstId);

    int insert(CstLost record);

    int insertSelective(CstLost record);

    List<CstLost> selectByExample(CstLostExample example);

    CstLost selectByPrimaryKey(Long lstId);

    int updateByExampleSelective(@Param("record") CstLost record, @Param("example") CstLostExample example);

    int updateByExample(@Param("record") CstLost record, @Param("example") CstLostExample example);

    int updateByPrimaryKeySelective(CstLost record);

    int updateByPrimaryKey(CstLost record);
}