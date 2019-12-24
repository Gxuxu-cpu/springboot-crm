package com.crm.service.service;

import java.util.List;

import com.crm.base.service.IBaseService;
import com.crm.bean.BasDict;
import com.crm.bean.CstService;

public interface ISvrService<T> extends IBaseService<CstService> {

	// ��ɾ��ģ���ҳ
	// ��Ϊ������Ϳͻ��ȼ��ķ�����ͨ�ã�������Ҫ�Լ�������صķ���
	List<BasDict> selectByParam(String param);

	void insert(CstService cstService);

	void updateCstService(CstService cstService);

	void deleteCstService(Long id);

	CstService selectCstServiceById(Long id);

}
