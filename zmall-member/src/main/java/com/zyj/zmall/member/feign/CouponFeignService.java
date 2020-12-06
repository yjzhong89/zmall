package com.zyj.zmall.member.feign;

import com.zyj.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: yjzhong
 * @Date: 2020/12/6 12:11
 */
@FeignClient("zmall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/coupon-list")
    R getMemberCoupons();
}
