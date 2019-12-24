package com.crm.base.service;

import com.crm.support.PageInfo;

public interface IBaseService<T> {
	
	//��ӵķ��� void add(Object o);
	void saveEntity(T entity);
	
	//���´����Ӧ
	void updateEntity(T entity);
	
	//����������Integer(int),String,Long
	void deleteByPrimaryKey(Object id);
	
	//��ѯ
	T findEntityById(Object id);
	
	//��ҳ
	PageInfo<T> findListByPageInfo(PageInfo<T> pageInfo);
}
