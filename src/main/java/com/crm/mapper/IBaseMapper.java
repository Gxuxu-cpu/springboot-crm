package com.crm.mapper;

import java.util.List;

import com.crm.support.PageInfo;

//假设CstCustomerMapper有实现类CstCustomerMapperImpl
//IBaseMapper mapper = new CstCustomerMapperImpl();=》mybatis根据CstCustomerMapper.xml生成的
public interface IBaseMapper<T> {

	int deleteByPrimaryKey(Object chcId);
	
	int insertSelective(T record);
	 
	T selectByPrimaryKey(Object chcId);
	
	int updateByPrimaryKeySelective(T record);
	
	 //根据分页的工具类进行分页查询
    List<T>  selectListsByPageInfo(PageInfo<T> pageInfo);
    
    //得到总条数,为什么有参数？因为要涉及到条件查询
    int selectCountByPageInfo(PageInfo<T> pageInfo);
}
