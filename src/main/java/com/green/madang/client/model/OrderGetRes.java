package com.green.madang.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderGetRes {
    @JsonProperty("order_id")
    private int orderId;
    @JsonProperty("book_id")
    private int bookId;
    @JsonProperty("sale_price")
    private int salePrice;
    @JsonProperty("book_name")
    private String bookName;
    @JsonProperty("order_date")
    private String orderDate;
}
