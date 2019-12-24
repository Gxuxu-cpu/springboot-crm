package com.crm.sale.service;

import java.util.List;

import com.crm.bean.SalChance;
import com.crm.bean.SysUser;
import com.crm.support.PageInfo;

public interface ISaleService<T> {

	List<SalChance> selectSalChance(String status);
	
	//根据id查询销售机会
	SalChance selectSalChanceById(Long id);
	
	//传入SalChance对象更新
	void updateSalChance(SalChance salChance);
	
	//在接口中添加删除方法
	void deleteSalChance(Long id);
	
	
	//显示查询的数据，条数，当前页数，查询条件，是不是都可以放到pageInfo中
	//参数为什么是PageInfo<SalChance> pageInfo ,可以只有条件，list是没有值的
	//返回的时候一定是有数据的
	PageInfo<SalChance> selectPageInfo(PageInfo<SalChance> pageInfo);
	
	
	//selectSalChanceById = > selectObjectById
	//Long id ,Integer id,String id => Object id;
	//先把方法名通用了，参数通用了
	SalChance selectObjectById(Object id);
	
	//SalChance 不通用，怎么让返回值类型通过。
	//先打预防针，为下一步抽取公共接口做准备
	//不确定返回是什么类型的，但是又想在实现类确定返回的类型，而且不用强转
	T selectByPrimaryKey(Object id);

	void insert(SalChance salChance);
	
	//查询roleid是3的用户
	List<SysUser> findUsersByRoleId(Long roleId);
}
