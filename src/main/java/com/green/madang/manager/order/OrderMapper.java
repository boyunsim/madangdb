package com.green.madang.manager.order;

import com.green.madang.manager.order.model.OrderSelReq;
import com.green.madang.manager.order.model.OrderSelRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<OrderSelRes> selOrderList (OrderSelReq p);
}
