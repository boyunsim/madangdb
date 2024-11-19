package com.green.madang.manager.order.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderSelRes {
    private int orderId;
    private int custId;
    private String name;
    private int bookId;
    private String bookName;
    private int salePrice;
    private String orderDate;
}
