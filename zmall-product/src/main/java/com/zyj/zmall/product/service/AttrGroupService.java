package com.zyj.zmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyj.common.utils.PageUtils;
import com.zyj.zmall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 
 *
 * @author zyj
 * @email zyj@gmail.com
 * @date 2020-12-05 17:38:51
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

