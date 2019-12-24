package com.crm.basd.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.BasDict;

public interface IBasdService extends IBaseService<BasDict> {

	String[] selectDistinctType(String type);

	List<BasDict> findBasDict();

	List<BasDict> selectByParam(String param);

}
