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
	 * ���������򹤳��Դ��Ĳ�ѯ����ѯ�б� roleMapper.selectByExample(null)
	 */
	public List<SysRight> findAllRights() {
		// TODO Auto-generated method stub
		return rightMapper.selectByExample(null);
	}

	/**
	 * �������򹤳��Դ��ķ�����ѯ������
	 * ͨ��L01  �õ� L0103
	 * �鸸ģ����L01�ĸ���
	 * ����+1��10�Ƚ�  С��10�Ͳ�0�������Ǿ�ֱ��ƴ�ӡ�=>��ɹ��߷���
	 */
	public String createCode(String rightParentCode) {
		SysRightExample example = new SysRightExample();
		example.createCriteria().andRightParentCodeEqualTo(rightParentCode);
		//����L01 ��ѯ��L0105
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
