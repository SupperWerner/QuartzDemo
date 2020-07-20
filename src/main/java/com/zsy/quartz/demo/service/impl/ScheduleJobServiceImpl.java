package com.zsy.quartz.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.zsy.quartz.demo.entity.ScheduleJob;
import com.zsy.quartz.demo.dao.ScheduleJobMapper;
import com.zsy.quartz.demo.service.ScheduleJobService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zsy.quartz.demo.utils.ResModel;
import com.zsy.quartz.demo.utils.ScheduleUtils;
import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 定时任务 服务实现类
 * </p>
 *
 * @author zsy
 * @since 2020-07-19
 */
@Service
public class ScheduleJobServiceImpl extends ServiceImpl<ScheduleJobMapper, ScheduleJob> implements ScheduleJobService {
    @Autowired
    private Scheduler scheduler;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResModel saveScheduleJob(ScheduleJob scheduleJob) {
        // 新增到数据库中
        baseMapper.insert(scheduleJob);
        // 添加关联
        ScheduleUtils.createScheduleJob(scheduler,scheduleJob);
        return ResModel.success();
    }

    @Override
    public ResModel updateScheduleJob(ScheduleJob scheduleJob) {
        baseMapper.updateById(scheduleJob);
        return ResModel.success();
    }



}
