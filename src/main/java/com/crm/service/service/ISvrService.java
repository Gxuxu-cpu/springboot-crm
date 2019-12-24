package com.crm.service.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.BasDict;
import com.crm.bean.CstService;

public interface ISvrService<T> extends IBaseService<CstService> {

	// 增删查改，分页
	// 因为查地区和客户等级的方法不通用，所以需要自己新增相关的方法
	List<BasDict> selectByParam(String param);

	void insert(CstService cstService);

	void updateCstService(CstService cstService);

	void deleteCstService(Long id);

	CstService selectCstServiceById(Long id);

}
