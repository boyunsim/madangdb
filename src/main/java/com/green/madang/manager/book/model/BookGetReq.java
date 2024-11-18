package com.green.madang.manager.book.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@Getter
@Setter
@ToString
public class BookGetReq {
    private int page; //실제 받는 값
    private int size; //실제 받는 값
    private String searchText;
    @JsonIgnore //swagger 문서에서 멤버필드를 표기하지 않기 위한 애노테이션
    private int startIdx; //(page - 1) * size
}

//public class BookGetReq {
//    @Parameter(description = "선택된 페이지값", example = "1", required = true)
//    private int page;
//    @Parameter(description = "한 페이지마다 보여질 아이템 수", example = "30", required = true)
//    private int size;
//    @Parameter(description = "도서 제목에서 검색을 한다.", example = "검색 텍스트")
//    private String searchText;
//    @JsonIgnore //Swagger 문서에서 멤버필드가 안 나왔으면 할 때 이 애노테이션을 붙이면 된다.
//    private int startIdx; //(page - 1) * size
//}
