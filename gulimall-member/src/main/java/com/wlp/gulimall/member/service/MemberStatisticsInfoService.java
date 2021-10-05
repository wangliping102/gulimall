package com.wlp.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wlp.common.utils.PageUtils;
import com.wlp.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author wlp
 * @email wlp@gmail.com
 * @date 2021-07-20 19:33:19
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

