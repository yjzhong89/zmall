package com.zyj.zmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyj.common.utils.PageUtils;
import com.zyj.zmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 
 *
 * @author zyj
 * @email zyj@gmail.com
 * @date 2020-12-05 17:38:52
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

