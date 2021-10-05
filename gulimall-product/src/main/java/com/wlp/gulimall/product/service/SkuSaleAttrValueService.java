package com.wlp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wlp.common.utils.PageUtils;
import com.wlp.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author wlp
 * @email wlp@gmail.com
 * @date 2021-07-20 15:24:46
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

