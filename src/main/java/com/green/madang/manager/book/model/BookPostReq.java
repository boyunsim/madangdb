package com.green.madang.manager.book.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Getter
@Setter
@ToString
public class BookPostReq {
    //private int bookId;
    //pk값은 프론트가 결정하는 값이 아니다. >> 그래서 보통 auto-increment로 처리
    @Schema(title = "도서 이름")
    private String bookName;
    @Schema(title = "출판사 이름")
    private String publisher;
    @Schema(title = "도서 가격")
    private int price;
}
