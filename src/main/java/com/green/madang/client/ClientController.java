package com.green.madang.client;

import com.green.madang.client.model.OrderGetReq;
import com.green.madang.client.model.OrderGetRes;
import com.green.madang.client.model.OrderPostReq;
import com.green.madang.common.model.MyResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("client")
@Tag(name="주문", description = "주문 API")
public class ClientController {
    private final ClientService service;

    @PostMapping("order")
    @Operation(summary = "판매 등록", description = "판매 등록 처리 API")
    public MyResponse<Integer> postOrders(@RequestBody OrderPostReq p) {
        int result = service.postOrders(p);
        MyResponse<Integer> mr = new MyResponse<>("판매 등록 완료", result);
        return mr;
    }

    @GetMapping("order")
    @Operation(summary = "주문 리스트", description = "주문 리스트 API")
    public MyResponse<List<OrderGetRes>> getOredersList(@ParameterObject @ModelAttribute OrderGetReq p) {
        return new MyResponse<>(p.getCustId()+"번 고객 주문 리스트", service.getOrdersList(p));
    }
}
