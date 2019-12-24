package com.crm.basd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.basd.service.IBasdService;
import com.crm.base.service.impl.BaseServiceImpl;
import com.crm.bean.BasDict;
import com.crm.bean.BasDictExample;
import com.crm.bean.BasDictExample.Criteria;
import com.crm.mapper.BasDictMapper;


@Service//service调用mapper层
public class BasdServiceImpl extends BaseServiceImpl<BasDict> implements IBasdService {

	private BasDictMapper dictMapper;
	
	//调用通用模块儿的方法，注入通用mapper
	@Resource
	public void SetSuperMapper(BasDictMapper mapper) {
		super.setBaseMapper(mapper);
		this.dictMapper = mapper;
	}

	@Override
	public String[] selectDistinctType(String type) {
		// TODO Auto-generated method stub
		return dictMapper.selectDistinctType(type);
	}

	@Override
	public List<BasDict> findBasDict() {
		// TODO Auto-generated method stub
		BasDictExample example = new BasDictExample();
		return dictMapper.selectByExample(example);	
	}

	@Override
	public List<BasDict> selectByParam(String param) {
		// TODO Auto-generated method stub
		BasDictExample basDictExample = new BasDictExample();
		Criteria criteria = basDictExample.createCriteria();
		criteria.andDictTypeEqualTo(param);
		return dictMapper.selectByExample(basDictExample);
	}

}
