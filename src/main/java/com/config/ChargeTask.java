package com.config;

import com.charge.service.ChargeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/15.
 */
@Configuration
@Component
@EnableScheduling
public class ChargeTask {

    private static final Logger logger = LoggerFactory.getLogger(ChargeTask.class);

    @Autowired
    private ChargeService chargeService;

    @Scheduled(cron="0 0/1 8-20 * * ?")
    public void executeFileDownLoadTask() {

        // 间隔2分钟,执行工单上传任务
        Thread current = Thread.currentThread();
        System.out.println("定时任务1:"+current.getId());
        try {
            chargeService.handleCharggeInfo();
        } catch (Exception e) {
            logger.info(e.getMessage());
        }
        logger.info("ScheduledTest.executeFileDownLoadTask 定时任务1:"+current.getId()+ ",name:"+current.getName());
    }


}
