package com.crm.cust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.base.service.impl.BaseServiceImpl;
import com.crm.bean.CstActivity;
import com.crm.bean.CstActivityExample;
import com.crm.bean.CstActivityExample.Criteria;
import com.crm.cust.service.ICstActivityService;

import com.crm.mapper.CstActivityMapper;


@Service
public class CstActivityServiceImpl extends BaseServiceImpl<CstActivity> implements ICstActivityService {

	private CstActivityMapper cstActivityMapper;
	
	@Resource
	public void SetMapper(CstActivityMapper mapper) {
		super.setBaseMapper(mapper);
		this.cstActivityMapper = mapper;
	}

	@Override
	public List<CstActivity> findActivitiesByCustNo(String custNo) {
		// TODO Auto-generated method stub
		CstActivityExample example = new CstActivityExample();
		Criteria criteria = example.createCriteria();
		criteria.andAtvCustNoEqualTo(custNo);
		return cstActivityMapper.selectByExample(example);
	}
	
	
	
	//能否使用逆向工程自带的方法进行查询=》可以
//	@Override
//	public List<CstLinkman> findLinkmansByCustNo(String custNo) {
//		// TODO Auto-generated method stub
//		CstLinkmanExample example = new CstLinkmanExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andLkmCustNoEqualTo(custNo);
//		return linkmanMapper.selectByExample(example);
//	}


}
