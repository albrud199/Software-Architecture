package com.macro.mall.dto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

/**
 * 优惠券分类对应商品信息
 * Created by macro on 2018/8/29.
 */
@Data
@EqualsAndHashCode
public class SmsCouponProductCategoryRelationDto {
    @Schema(title = "商品分类id")
    private Long productCategoryId;
    @Schema(title = "商品分类名称")
    private String productCategoryName;
    @Schema(title = "父分类id")
    private Long parentCategoryId;
}
