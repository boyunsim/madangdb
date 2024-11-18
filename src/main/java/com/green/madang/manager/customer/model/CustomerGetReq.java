package com.green.madang.manager.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@ToString
public class CustomerGetReq {
    @Schema(description = "선택된 페이지값", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private int page;
    @Schema(description = "한 페이지마다 보여질 고객정보 수", example = "50", requiredMode = Schema.RequiredMode.REQUIRED)
    private int size;
    @Schema(description = "검색타입: {name, address, phone}중 한 값을 보낸다.", example = "name")
    private String searchType;
    @Schema(description = "검색내용", example = "ani")
    private String searchText;
    @JsonIgnore //Swagger 문서에서 멤버필드가 안 나왔으면 할 때 이 애노테이션을 붙이면 된다.
    private int startIdx; //(page - 1) * size
}
