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
