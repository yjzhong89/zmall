package com.zyj.zmall.order.dao;

import com.zyj.zmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author zyj
 * @email zyj@gmail.com
 * @date 2020-12-05 20:50:09
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
