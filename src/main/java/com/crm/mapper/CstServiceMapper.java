package com.crm.mapper;

import com.crm.bean.CstService;
import com.crm.bean.CstServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstServiceMapper extends IBaseMapper<CstService>{
    int countByExample(CstServiceExample example);

    int deleteByExample(CstServiceExample example);

    int deleteByPrimaryKey(Long svrId);

    int insert(CstService record);

    int insertSelective(CstService record);

    List<CstService> selectByExample(CstServiceExample example);

    CstService selectByPrimaryKey(Long svrId);

    int updateByExampleSelective(@Param("record") CstService record, @Param("example") CstServiceExample example);

    int updateByExample(@Param("record") CstService record, @Param("example") CstServiceExample example);

    int updateByPrimaryKeySelective(CstService record);

    int updateByPrimaryKey(CstService record);
}