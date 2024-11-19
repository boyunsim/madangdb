package com.green.madang.manager.customer;

import com.green.madang.common.model.MyResponse;
import com.green.madang.manager.customer.model.*;
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
@RequestMapping("manager/customer")
@Tag(name = "고객", description = "고객 API")
public class CustomerController {
    private final CustomerService service;

    @PostMapping
    @Operation(summary = "고객 등록", description = "고객 등록 API")
    public MyResponse<Integer> postCustomer(@RequestBody CustomerPostReq p) {
        int result = service.postCustomer(p);
        MyResponse<Integer> mr = new MyResponse<>("고객 등록 완료", result);
        return mr;
    }

    @GetMapping
    @Operation(summary = "고객 목록", description = "고객 목록 API")
    //@ParameterObject - swagger용 애노테이션, RequestParam으로 설정했을 때 나오는 (key + value)FORM처럼 되게 한다.
    public MyResponse<List<CustomerGetRes>> getCustomer(@ParameterObject @ModelAttribute CustomerGetReq p) {
        log.info("get-req: {}",p);
        List<CustomerGetRes> list = service.getCustomer(p);
        return new MyResponse<>(p.getPage() + "페이지 데이터", list);
    }
    //requiredMode = Schema.RequiredMode.REQUIRED 로 반드시 받아야하는 멤버필드지만 @ModelAttribute 에서는 막을 방법이 없고
    //@RequestParam 에서는 required = true가 기본값으로 값이 들어 오지 않으면 오류를 발생시킨다
    //필수가 아닌 멤버필드에 대해서는 required = false로 처리한다.
    @GetMapping("/param")
    @Operation(summary = "고객 목록2", description = "고객 목록2 API")
    public MyResponse<List<CustomerGetRes>> getCustomer2(@RequestParam int page
                                                        , @RequestParam int size
                                                        , @RequestParam(name = "search_type", required = false) String searchType
                                                        , @RequestParam(name = "search_text", required = false) String searchText) {
        CustomerGetReq p = new CustomerGetReq(page, size, searchType, searchText);
        p.setPage(page);
        p.setSize(size);
        p.setSearchType(searchType);
        p.setSearchText(searchText);
        List<CustomerGetRes> list = service.getCustomer(p);
        return new MyResponse<>(p.getPage() + "페이지 데이터", list);
    }

    @PutMapping
    @Operation(summary = "고객 수정", description = "고객 수정 API")
    public MyResponse<Integer> putCustomer(@RequestBody CustomerPutReq p) {
        int result = service.putCustomer(p);
        MyResponse<Integer> mr = new MyResponse<>(p.getCustId()+"번 고객 수정 완료", result);
        return mr;
        // return new MyResponse<Integer>(p.getCustId()+"번 고객 수정 완료", service.putCustomer(p));
    }

    @DeleteMapping
    @Operation(summary = "고객 삭제", description = "고객 삭제 API")
    public MyResponse<Integer> delCustomer(@ModelAttribute CustomerDelReq p) {
        int result = service.delCustomer(p);
        MyResponse<Integer> mr = new MyResponse<>(p.getCustId()+"번 고객 삭제 완료", result);
        return mr;
    }
}
