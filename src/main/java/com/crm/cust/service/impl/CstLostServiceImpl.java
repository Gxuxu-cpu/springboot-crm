package com.crm.cust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.base.service.impl.BaseServiceImpl;
import com.crm.bean.BasDict;
import com.crm.bean.BasDictExample;
import com.crm.bean.BasDictExample.Criteria;
import com.crm.bean.CstCustomer;
import com.crm.bean.CstCustomerExample;
import com.crm.bean.CstLinkmanExample;
import com.crm.bean.CstLost;
import com.crm.bean.Orders;
import com.crm.bean.OrdersExample;
import com.crm.bean.OrdersLineExample;
import com.crm.cust.service.ICstCustomerService;
import com.crm.cust.service.ICstLostService;
import com.crm.mapper.BasDictMapper;
import com.crm.mapper.CstCustomerMapper;
import com.crm.mapper.CstLinkmanMapper;
import com.crm.mapper.CstLostMapper;
import com.crm.mapper.OrdersLineMapper;
import com.crm.mapper.OrdersMapper;


/**
 * 如何不写代码还不报错。
 * @author Lenovo
 *
 */
@Service
public class CstLostServiceImpl extends BaseServiceImpl<CstLost> implements ICstLostService {

	
	@Resource
	public void SetMapper(CstLostMapper mapper) {
		super.setBaseMapper(mapper);
		
	}


}
