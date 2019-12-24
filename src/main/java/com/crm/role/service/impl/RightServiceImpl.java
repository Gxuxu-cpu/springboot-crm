package com.crm.role.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.base.service.impl.BaseServiceImpl;
import com.crm.bean.SysRight;
import com.crm.bean.SysRightExample;
import com.crm.mapper.SysRightMapper;
import com.crm.role.service.IRightService;
import com.crm.support.StrUtil;


@Service
public class RightServiceImpl extends BaseServiceImpl<SysRight> implements IRightService {

	private SysRightMapper rightMapper;
	
	@Resource
	public void setSuperMapper(SysRightMapper mapper) {
		super.setBaseMapper(mapper);
		this.rightMapper = mapper;
	}

	/**
	 * 可以用逆向工程自带的查询来查询列表 roleMapper.selectByExample(null)
	 */
	public List<SysRight> findAllRights() {
		// TODO Auto-generated method stub
		return rightMapper.selectByExample(null);
	}

	/**
	 * 可以逆向工程自带的方法查询个数。
	 * 通过L01  得到 L0103
	 * 查父模块是L01的个数
	 * 个数+1和10比较  小于10就补0，大于是就直接拼接。=>抽成工具方法
	 */
	public String createCode(String rightParentCode) {
		SysRightExample example = new SysRightExample();
		example.createCriteria().andRightParentCodeEqualTo(rightParentCode);
		//根据L01 查询出L0105
		List<SysRight> rightList = rightMapper.selectByExample(example);
		String lastCode ="";
		if(rightList.size()>0) {
			lastCode = rightList.get(rightList.size()-1).getRightCode();
		}else {
			lastCode = rightParentCode+"00";
		}
		
		return StrUtil.createCode(lastCode, rightParentCode);
		
//		int num = rightMapper.selectByExample(example).size()+1;
//		return StrUtil.createId(rightParentCode, num);
	}

	
	

}
