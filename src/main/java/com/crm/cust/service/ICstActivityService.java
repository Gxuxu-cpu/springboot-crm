package com.crm.cust.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.CstActivity;

public interface ICstActivityService extends IBaseService<CstActivity>{

	List<CstActivity> findActivitiesByCustNo(String custNo);

}
