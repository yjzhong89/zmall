package com.zyj.zmall.product;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.zyj.zmall.product.entity.BrandEntity;
import com.zyj.zmall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: yjzhong
 * @Date: 2020/12/5 20:05
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ZmallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void test() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("Huawei");
        brandEntity.setDescript("华为");
        brandService.updateById(brandEntity);
    }
}
