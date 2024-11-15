package com.green.madang.manager.book.model;

import lombok.*;

@Getter
@Setter
@ToString
public class BookUpdReq {
    private int bookId;
    private String publisher;
    private String bookName;
    private Integer price;
    /*
        int price 였을 때 (구별 불가능)
        실제 책 가격을 0으로 수정하고 싶었음. 쿼리스트링에 추가함 price=0
        책가격을 수정하고 싶지 않았음(현상 유지). 쿼리스트링에 추가안함 price=0

        Integer price 였을 때 (구별 가능)
        실제 책 가격을 0으로 수정하고 싶었음. 쿼리스트링에 추가함 price=0
        책 가격을 수정하고 싶지 않았음(현상 유지). 쿼리스트링에 추가안함 price=null
     */
}
