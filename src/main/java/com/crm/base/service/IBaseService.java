package com.crm.base.service;

import com.crm.support.PageInfo;

public interface IBaseService<T> {
	
	//添加的方法 void add(Object o);
	void saveEntity(T entity);
	
	//更新传入对应
	void updateEntity(T entity);
	
	//主键可能是Integer(int),String,Long
	void deleteByPrimaryKey(Object id);
	
	//查询
	T findEntityById(Object id);
	
	//分页
	PageInfo<T> findListByPageInfo(PageInfo<T> pageInfo);
}
