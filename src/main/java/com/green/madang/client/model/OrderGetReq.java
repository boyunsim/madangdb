package com.green.madang.client.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderGetReq {
    @Schema(title = "고객 pk", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    private int custId;
}
