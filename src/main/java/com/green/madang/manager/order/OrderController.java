package com.green.madang.manager.order;

import com.green.madang.common.model.MyResponse;
import com.green.madang.manager.order.model.OrderSelReq;
import com.green.madang.manager.order.model.OrderSelRes;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("manager/order")
@Tag(name = "고객별", description = "고객별 API")
public class OrderController {
    private final OrderService service;

    @GetMapping
    @Operation(summary = "고객별 주문",description = "고객별 주문 API")
    public MyResponse<List<OrderSelRes>> selOrderList (@ParameterObject @ModelAttribute OrderSelReq p) {
        List<OrderSelRes> list = service.selOrderList(p);
        return new MyResponse<>(list.size() + " rows", list);
    }
}
