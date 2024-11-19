package com.green.madang.client.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderPostReq {
    @Schema(title = "고객 pk", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private int custId;
    @Schema(title = "도서 pk", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
    private int bookId;
    @Schema(title = "할인율", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
    private int discount;
}
