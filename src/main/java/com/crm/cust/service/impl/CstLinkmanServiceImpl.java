package com.crm.cust.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.base.service.impl.BaseServiceImpl;
import com.crm.bean.CstLinkman;
import com.crm.bean.CstLinkmanExample;
import com.crm.bean.CstLinkmanExample.Criteria;
import com.crm.cust.service.ICstLinkmanService;
import com.crm.mapper.CstLinkmanMapper;

@Service
public class CstLinkmanServiceImpl extends BaseServiceImpl<CstLinkman> implements ICstLinkmanService {

	private CstLinkmanMapper linkmanMapper;
	
	@Resource
	public void SetMapper(CstLinkmanMapper mapper) {
		super.setBaseMapper(mapper);
		this.linkmanMapper = mapper;
	}
	
	//能否使用逆向工程自带的方法进行查询=》可以
	@Override
	public List<CstLinkman> findLinkmansByCustNo(String custNo) {
		// TODO Auto-generated method stub
		CstLinkmanExample example = new CstLinkmanExample();
		Criteria criteria = example.createCriteria();
		criteria.andLkmCustNoEqualTo(custNo);
		return linkmanMapper.selectByExample(example);
	}


}
