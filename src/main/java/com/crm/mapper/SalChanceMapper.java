package com.crm.mapper;

import com.crm.bean.SalChance;
import com.crm.bean.SalChanceExample;
import com.crm.support.PageInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalChanceMapper {
    int countByExample(SalChanceExample example);

    int deleteByExample(SalChanceExample example);

    int deleteByPrimaryKey(Long chcId);

    int insert(SalChance record);

    int insertSelective(SalChance record);

    List<SalChance> selectByExample(SalChanceExample example);

    SalChance selectByPrimaryKey(Long chcId);

    int updateByExampleSelective(@Param("record") SalChance record, @Param("example") SalChanceExample example);

    int updateByExample(@Param("record") SalChance record, @Param("example") SalChanceExample example);

    int updateByPrimaryKeySelective(SalChance record);

    int updateByPrimaryKey(SalChance record);
    
    //根据分页的工具类进行分页查询
    List<SalChance>  selectSalChanceByPageInfo(PageInfo<SalChance> pageInfo);
    
    //得到总条数,为什么有参数？因为要涉及到条件查询
    int selectCountByPageInfo(PageInfo<SalChance> pageInfo);
}