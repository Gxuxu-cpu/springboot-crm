package com.crm.service.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.base.service.impl.BaseServiceImpl;
import com.crm.bean.BasDict;
import com.crm.bean.BasDictExample;
import com.crm.bean.BasDictExample.Criteria;
import com.crm.bean.CstService;
import com.crm.mapper.BasDictMapper;
import com.crm.mapper.CstServiceMapper;
import com.crm.service.service.ISvrService;

@Service
public class SvrServiceimpl extends BaseServiceImpl<CstService> implements ISvrService<CstService> {

	@Resource
	private BasDictMapper basDictMapper;
	
	private CstServiceMapper cstServiceMapper;
	
	@Resource
	public void SetMapper(CstServiceMapper mapper) {
		super.setBaseMapper(mapper);
		this.cstServiceMapper = mapper;
	}

	@Override
	public List<BasDict> selectByParam(String param) {
		BasDictExample basDictExample = new BasDictExample();
		Criteria criteria = basDictExample.createCriteria();
		criteria.andDictTypeEqualTo(param);
		return basDictMapper.selectByExample(basDictExample);
	}

	@Override
	public void insert(CstService cstService) {
		// TODO Auto-generated method stub
		cstServiceMapper.insertSelective(cstService);
	}

	@Override
	public void updateCstService(CstService cstService) {
		// TODO Auto-generated method stub
		cstServiceMapper.updateByPrimaryKeySelective(cstService);
	}

	@Override
	public void deleteCstService(Long id) {
		// TODO Auto-generated method stub
		cstServiceMapper.deleteByPrimaryKey(id);
	}

	@Override
	public CstService selectCstServiceById(Long id) {
		// TODO Auto-generated method stub
		return cstServiceMapper.selectByPrimaryKey(id);
	}

	

}
