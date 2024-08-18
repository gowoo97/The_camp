package io.camp.inventory.model.dto;

import io.camp.coupon.model.dto.Coupon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class InventoryDto {

    private Long seq;

    private Long couponSeq;

    private String couponName;

    private String couponType;

    private String userEmail;

    private LocalDate expireDate;

    private int count;

    private boolean isUse;

    public void setCoupon(Coupon coupon) {
        this.couponSeq = coupon.getSeq();
        this.couponName = coupon.getName();
        this.couponType = coupon.getType().name();
        this.count = coupon.getDiscountRate();
    }
}
