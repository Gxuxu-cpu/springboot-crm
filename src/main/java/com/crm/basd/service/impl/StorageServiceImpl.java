package com.crm.basd.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.crm.basd.service.IProductService;
import com.crm.basd.service.IStorageService;
import com.crm.base.service.impl.BaseServiceImpl;
import com.crm.bean.Product;
import com.crm.bean.Storage;
import com.crm.mapper.ProductMapper;
import com.crm.mapper.StorageMapper;


@Service//service����mapper��
public class StorageServiceImpl extends BaseServiceImpl<Storage> implements IStorageService {

	//����ͨ��ģ����ķ�����ע��ͨ��mapper
	@Resource
	public void SetSuperMapper(StorageMapper mapper) {
		super.setBaseMapper(mapper);
	
	}

	
}
