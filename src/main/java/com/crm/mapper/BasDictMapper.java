package com.crm.mapper;

import com.crm.bean.BasDict;
import com.crm.bean.BasDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BasDictMapper extends IBaseMapper<BasDict>{
    int countByExample(BasDictExample example);

    int deleteByExample(BasDictExample example);

    int deleteByPrimaryKey(Long dictId);

    int insert(BasDict record);

    int insertSelective(BasDict record);

    List<BasDict> selectByExample(BasDictExample example);

    BasDict selectByPrimaryKey(Long dictId);

    int updateByExampleSelective(@Param("record") BasDict record, @Param("example") BasDictExample example);

    int updateByExample(@Param("record") BasDict record, @Param("example") BasDictExample example);

    int updateByPrimaryKeySelective(BasDict record);

    int updateByPrimaryKey(BasDict record);

	String[] selectDistinctType(String type);
}