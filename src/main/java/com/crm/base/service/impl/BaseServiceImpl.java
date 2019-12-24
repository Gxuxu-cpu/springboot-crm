package com.crm.base.service.impl;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.mapper.IBaseMapper;
import com.crm.support.PageInfo;

/**
 * ����BaseServiceImpl<T> implements IBaseService<T>
 * service��Ҫ����dao�㣬Ҳ����mapper
 * @author Lenovo
 *
 * @param <T>
 */
public class BaseServiceImpl<T> implements IBaseService<T> {

	//private IBaseMapper<T> baseMapper = new CstCustomerMapperImpl()//��mybatis���ɵĴ������
	//private IBaseMapper<T> baseMapper = new BaseMapperImpl()
	private IBaseMapper<T> baseMapper;
	
	public void saveEntity(T entity) {
		// TODO Auto-generated method stub
		baseMapper.insertSelective(entity);
	}

	public void updateEntity(T entity) {
		// TODO Auto-generated method stub
		baseMapper.updateByPrimaryKeySelective(entity);
	}

	public void deleteByPrimaryKey(Object id) {
		// TODO Auto-generated method stub
		baseMapper.deleteByPrimaryKey(id);
	}

	public T findEntityById(Object id) {
		// TODO Auto-generated method stub
		return baseMapper.selectByPrimaryKey(id);
	}

	public PageInfo<T> findListByPageInfo(PageInfo<T> pageInfo) {
		//��ѯ��Ŀ��ʱ��start �� pageSize������Ĭ��ֵ��
		List<T> lists = baseMapper.selectListsByPageInfo(pageInfo);
		//��������
		int count = baseMapper.selectCountByPageInfo(pageInfo);
		//����ҳ�� = > ������/ÿҳ������
		int totalPage = count%pageInfo.getPageSize()>0?count/pageInfo.getPageSize()+1:count/pageInfo.getPageSize();
		pageInfo.setLists(lists);
		pageInfo.setTotalCount(count);
		pageInfo.setTotalPage(totalPage);
		return pageInfo;
	}

	public IBaseMapper<T> getBaseMapper() {
		return baseMapper;
	}

	public void setBaseMapper(IBaseMapper<T> baseMapper) {
		this.baseMapper = baseMapper;
	}
	
}
