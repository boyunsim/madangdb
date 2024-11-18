package com.green.madang.manager.customer;

import com.green.madang.manager.customer.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerMapper mapper;

    public int postCustomer (CustomerPostReq p) {
        return mapper.postCustomer(p);
    }

    public List<CustomerGetRes> getCustomer(CustomerGetReq p) {
        p.setStartIdx((p.getPage() - 1)*p.getSize());
        return mapper.getCustomer(p);
    }

    public int putCustomer(CustomerPutReq p) {
        return mapper.putCustomer(p);
    }

    public int delCustomer(CustomerDelReq p) {
        return mapper.delCustomer(p);
    }

}
