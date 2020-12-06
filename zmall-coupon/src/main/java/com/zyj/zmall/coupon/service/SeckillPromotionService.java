package com.zyj.zmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyj.common.utils.PageUtils;
import com.zyj.zmall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 
 *
 * @author zyj
 * @email zyj@gmail.com
 * @date 2020-12-05 20:19:38
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

