package com.green.madang.client;

import com.green.madang.client.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {
    private final ClientMapper mapper;

    public int postOrders (OrderPostReq p) {
        return mapper.postOrders(p);
    }

    public List<OrderGetRes> getOrdersList(OrderGetReq p) {
        return mapper.getOrdersList(p);
    }
}
