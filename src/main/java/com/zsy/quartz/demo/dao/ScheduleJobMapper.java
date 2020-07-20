package com.zsy.quartz.demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zsy.quartz.demo.entity.ScheduleJob;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 定时任务 Mapper 接口
 * </p>
 *
 * @author zsy
 * @since 2020-07-19
 */
@Repository
public interface ScheduleJobMapper extends BaseMapper<ScheduleJob> {

}
