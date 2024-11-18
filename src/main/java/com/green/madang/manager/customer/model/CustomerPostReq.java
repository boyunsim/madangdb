package com.green.madang.manager.customer.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerPostReq {
    @Schema(title = "고객 이름", example = "홍길동", requiredMode = Schema.RequiredMode.REQUIRED)
    private String name;
    @Schema(title = "고객 주소", example = "대한민국 경기도", requiredMode = Schema.RequiredMode.REQUIRED)
    private String address;
    @Schema(title = "고객 번호", example = "010-1234-5678", requiredMode = Schema.RequiredMode.REQUIRED)
    private String phone;
}

//public class BookPostReq {
//    @Schema(title = "도서 이름", description = "설명할거 있으면 적으며 된다.", example = "학교 종이 땡땡땡!", requiredMode = Schema.RequiredMode.REQUIRED)
//    private String bookName;
//    @Schema(title = "출판사 이름", example = "한빛출판사", requiredMode = Schema.RequiredMode.REQUIRED)
//    private String publisher;
//    @Schema(title = "도서 가격", example = "12000", requiredMode = Schema.RequiredMode.REQUIRED)
//    private int price;
//}
