package com.zsy.quartz.demo.utils;

import com.zsy.quartz.demo.dao.ScheduleJobLogMapper;
import com.zsy.quartz.demo.entity.ScheduleJob;
import com.zsy.quartz.demo.entity.ScheduleJobLog;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @ClassName Schedule
 * @Description 定时任务工具
 * @Author mybook
 * @Date 2020/7/19 1:17 AM
 * @Version 1.0
 */

@Slf4j
@Component
public class ScheduleJobUtils extends QuartzJobBean {
    private ExecutorService service = Executors.newSingleThreadExecutor();

    @Autowired
    private ScheduleJobLogMapper scheduleJobLogMapper;

    /**
     * @Author zsy
     * @Description // TODO 执行方法
     * @Date 1:27 AM 2020/7/19
     * @Param [jobExecutionContext]
     * @return void
     **/
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

    }

}
