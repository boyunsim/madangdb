package com.green.madang.manager.customer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.web.bind.annotation.BindParam;
/*
    우리가 만드는 API는 응답 시 JSON형태로 응답한다.
    응답시 객체에 있는 특정 멤버필드의 값을 제외하고 싶을 때
    @JsonIgnore를 멤버필드에 붙이면 제외시킬 수 있다.
    (응답 때 JsonIgnore를 쓰는 경우는 거의 없다.)

    Swagger 문서상에 응답 Schema에서 안 보이기도 한다.
 */
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
    //@JsonIgnore 와 @Schema(hidden = true)는 Swagger 문서에서 Parameters 부분에서 멤버필드가 안 나왔으면 할 때 이 애노테이션을 붙이면 된다.
    @JsonIgnore
    //@Schema(hidden = true)
    private int startIdx; //(page - 1) * size

    public CustomerGetReq(int page, int size, @BindParam("search_type") String searchType, @BindParam("search_text")String searchText) {
        this.page = page;
        this.size = size;
        this.searchType = searchType;
        this.searchText = searchText;
        this.startIdx = (page - 1) * size;
    }
}
