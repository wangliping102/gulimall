package com.wlp.gulimall.coupon.dao;

import com.wlp.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wlp
 * @email wlp@gmail.com
 * @date 2021-07-20 17:14:39
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
