package com.zyj.zmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyj.common.utils.PageUtils;
import com.zyj.zmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 
 *
 * @author zyj
 * @email zyj@gmail.com
 * @date 2020-12-05 20:50:09
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

