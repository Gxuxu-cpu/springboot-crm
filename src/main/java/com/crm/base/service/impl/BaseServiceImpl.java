package com.crm.base.service.impl;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.mapper.IBaseMapper;
import com.crm.support.PageInfo;

/**
 * 创建BaseServiceImpl<T> implements IBaseService<T>
 * service需要调用dao层，也就是mapper
 * @author Lenovo
 *
 * @param <T>
 */
public class BaseServiceImpl<T> implements IBaseService<T> {

	//private IBaseMapper<T> baseMapper = new CstCustomerMapperImpl()//是mybatis生成的代理对象
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
		//查询条目的时候，start 和 pageSize都是有默认值的
		List<T> lists = baseMapper.selectListsByPageInfo(pageInfo);
		//查总条数
		int count = baseMapper.selectCountByPageInfo(pageInfo);
		//算总页数 = > 总条数/每页的条数
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
