package com.green.madang.manager.order;

import com.green.madang.manager.order.model.OrderSelReq;
import com.green.madang.manager.order.model.OrderSelRes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderMapper mapper;

    public List<OrderSelRes> selOrderList (OrderSelReq p) {
        p.setStartIdx((p.getPage() - 1) * p.getSize());
        return mapper.selOrderList(p);
    }
}
