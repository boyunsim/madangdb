package com.green.madang.manager.customer;

import com.green.madang.manager.customer.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    int postCustomer(CustomerPostReq p);
    List<CustomerGetRes> getCustomer(CustomerGetReq p);
    int putCustomer(CustomerPutReq p);
    int delCustomer(CustomerDelReq p);
}
