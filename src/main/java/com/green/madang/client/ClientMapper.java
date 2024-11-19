package com.green.madang.client;

import com.green.madang.client.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientMapper {
    int postOrders (OrderPostReq p);
    List<OrderGetRes> getOrdersList(OrderGetReq p);
}
