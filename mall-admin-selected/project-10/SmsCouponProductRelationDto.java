package com.macro.mall.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 优惠券分类对应商品信息
 * Created by macro on 2018/8/29.
 */
@Data
@EqualsAndHashCode
public class SmsCouponProductRelationDto {
    @Schema(title = "商品id")
    private Long productId;
    @Schema(title = "商品名称")
    private String productName;
    @Schema(title = "商品编码")
    private String productSn;
}
