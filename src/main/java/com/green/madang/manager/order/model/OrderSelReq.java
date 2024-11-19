package com.green.madang.manager.order.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderSelReq {
    @Schema(description = "page 값", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private int page;
    @Schema(description = "size 값", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
    private int size;
    @JsonIgnore
    private int startIdx;
}
