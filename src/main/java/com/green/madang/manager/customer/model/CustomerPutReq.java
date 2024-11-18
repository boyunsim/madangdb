package com.green.madang.manager.customer.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerPutReq {
    private int custId;
    @Schema(title = "고객 이름", example = "김우준", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;
    @Schema(title = "고객 주소", example = "대한민국 김천", requiredMode = Schema.RequiredMode.REQUIRED)
    private String address;
    @Schema(title = "고객 번호", example = "010-5461-1354", requiredMode = Schema.RequiredMode.REQUIRED)
    private String phone;
}
