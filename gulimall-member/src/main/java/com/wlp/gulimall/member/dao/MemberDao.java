package com.wlp.gulimall.member.dao;

import com.wlp.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wlp
 * @email wlp@gmail.com
 * @date 2021-07-20 19:33:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
