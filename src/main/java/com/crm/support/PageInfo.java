package com.crm.support;

import java.util.List;

/**
 * 处理分页问题使用到的类
 * @author Lenovo
 *自定义类完成分页功能

	做分页需要哪些条件？
	
	1 总条数
	2 每页的条数
	3 当前的页数
	4 总页数
	
	页面显示
	5 分页查询后传递到前端进行相关的展示 List<T>
	
	查询条件
	6 类的属性 private SalChance salChance;  private T entity;
 */
public class PageInfo<T> {

	//总条数
	private int totalCount;
	
	//页面条数初始值，不指定就是5
	private int pageSize = 5;
	
	//当前的页数，初始值是 1
	private int pageNum = 1;
	
	//总页数
	private int totalPage;
	
	//泛型的使用，在实例化的时候指定类型，
	private List<T> lists; 
	
	//类的属性，查询条件
	private T entity;

	private String ok;
	
	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}
	
	//开始条数
	private int start;

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getLists() {
		return lists;
	}

	public void setLists(List<T> lists) {
		this.lists = lists;
	}

	public T getEntity() {
		return entity;
	}

	public void setEntity(T entity) {
		this.entity = entity;
	}

	public int getStart() {
		//可以指定初始的条数
		this.start = (pageNum-1)*pageSize;
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}
	
	
	
}
