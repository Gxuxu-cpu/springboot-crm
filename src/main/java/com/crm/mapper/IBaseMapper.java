package com.crm.mapper;

import java.util.List;

import com.crm.support.PageInfo;

//����CstCustomerMapper��ʵ����CstCustomerMapperImpl
//IBaseMapper mapper = new CstCustomerMapperImpl();=��mybatis����CstCustomerMapper.xml���ɵ�
public interface IBaseMapper<T> {

	int deleteByPrimaryKey(Object chcId);
	
	int insertSelective(T record);
	 
	T selectByPrimaryKey(Object chcId);
	
	int updateByPrimaryKeySelective(T record);
	
	 //���ݷ�ҳ�Ĺ�������з�ҳ��ѯ
    List<T>  selectListsByPageInfo(PageInfo<T> pageInfo);
    
    //�õ�������,Ϊʲô�в�������ΪҪ�漰��������ѯ
    int selectCountByPageInfo(PageInfo<T> pageInfo);
}
