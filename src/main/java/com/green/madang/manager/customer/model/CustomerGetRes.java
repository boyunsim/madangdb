package com.green.madang.manager.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@ToString
public class CustomerGetRes {
    //@JsonIgnore //JSON에서 이 애노테이션이 붙은 멤버필드는 보이지 않는다.
    private int custId;
    @Schema(title = "고객 이름", example = "홍길동", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;
    @Schema(title = "고객 주소", example = "대한민국 경기도", requiredMode = Schema.RequiredMode.REQUIRED)
    private String address;
    @Schema(title = "고객 번호", example = "010-1234-5678", requiredMode = Schema.RequiredMode.REQUIRED)
    private String phone;
}
