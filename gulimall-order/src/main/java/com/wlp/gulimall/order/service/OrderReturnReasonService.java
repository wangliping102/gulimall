package com.wlp.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wlp.common.utils.PageUtils;
import com.wlp.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author wlp
 * @email wlp@gmail.com
 * @date 2021-07-20 21:14:26
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

