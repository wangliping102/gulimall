package com.wlp.gulimall.product.dao;

import com.wlp.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wlp
 * @email wlp@gmail.com
 * @date 2021-07-20 16:15:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
