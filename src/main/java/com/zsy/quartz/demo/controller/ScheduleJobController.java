package com.zsy.quartz.demo.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zsy.quartz.demo.entity.ScheduleJob;
import com.zsy.quartz.demo.service.ScheduleJobService;
import com.zsy.quartz.demo.utils.ResModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 定时任务 前端控制器
 * </p>
 *
 * @author zsy
 * @since 2020-07-19
 */
@Api(description = "定时任务管理")
@RestController
@RequestMapping("/demo/schedule-job")
public class ScheduleJobController {
    @Autowired
    private ScheduleJobService scheduleJobService;

    @ApiOperation("新增定时任务")
    @PostMapping("saveScheduleJob")
    public ResModel saveScheduleJob(@ApiParam("新增定时任务信息接收对象")@RequestBody ScheduleJob scheduleJob){
        return scheduleJobService.saveScheduleJob(scheduleJob);
    }

    @ApiOperation("修改定时任务")
    @PostMapping("updateScheduleJob")
    public ResModel updateScheduleJob(@ApiParam("修改定时任务的接收对象")@RequestBody ScheduleJob scheduleJob ){
        return scheduleJobService.updateScheduleJob(scheduleJob);
    }
    @ApiOperation("分页查询定时任务")
    @PostMapping("/queryScheduleJobPage/{size}/{page}")
    public ResModel queryScheduleJobPage(@ApiParam("显示条数")@PathVariable Integer size
                                        ,@ApiParam("当前页码")@PathVariable Integer page
                                        ,@ApiParam("查询条件")@RequestBody ScheduleJob scheduleJob){
        Page<ScheduleJob> page1 = new Page<>();
        Wrapper<ScheduleJob> wrapper = new QueryWrapper<>();
        scheduleJobService.page(page1);

        return ResModel.success().data("data","");
    }



}

