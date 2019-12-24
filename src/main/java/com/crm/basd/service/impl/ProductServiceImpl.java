package com.crm.basd.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.crm.basd.service.IProductService;
import com.crm.base.service.impl.BaseServiceImpl;
import com.crm.bean.Product;
import com.crm.mapper.ProductMapper;


@Service//service����mapper��
public class ProductServiceImpl extends BaseServiceImpl<Product> implements IProductService {

	//����ͨ��ģ����ķ�����ע��ͨ��mapper
	@Resource
	public void SetSuperMapper(ProductMapper mapper) {
		super.setBaseMapper(mapper);
	
	}

	
}
