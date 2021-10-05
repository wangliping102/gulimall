package com.wlp.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wlp.common.utils.PageUtils;
import com.wlp.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wlp
 * @email wlp@gmail.com
 * @date 2021-07-20 16:15:34
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

