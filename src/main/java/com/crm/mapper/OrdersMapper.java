package com.crm.mapper;

import com.crm.bean.Orders;
import com.crm.bean.OrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 通用模块儿需要注入OrdersMapper，所以需要继承IBaseMapper<Orders>
 * @author Lenovo
 *
 */
public interface OrdersMapper extends IBaseMapper<Orders>{
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Long odrId);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Long odrId);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    //在OrdersMapper中添加查询订单的方法，
	Orders findOrdersByOrdId(Long odrId);
}