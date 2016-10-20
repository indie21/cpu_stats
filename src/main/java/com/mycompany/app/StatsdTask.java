package com.mycompany.app;

import java.util.TimerTask;
import com.timgroup.statsd.StatsDClient;
import com.timgroup.statsd.NonBlockingStatsDClient;

import java.util.Date;
import java.text.SimpleDateFormat;

public class StatsdTask extends TimerTask {

    private StatsDClient statsd;

    public StatsdTask() {
        // statsd = new NonBlockingStatsDClient(Config.config.getIdentity(),
        //                                      Config.config.getStastdHost(),
        //                                      Config.config.getStastdPort());
    }

    public void run() {

        try {
            StatsDClient statsd = new NonBlockingStatsDClient(Config.config.getIdentity(),
                                                              Config.config.getStastdHost(),
                                                              Config.config.getStastdPort());
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            String time = df.format(new Date());// new Date()为获取当前系统时间
            double  utild =  CpuStats.utilization();
            long util = (long)(utild*100);
            System.out.printf("%s:不要关我 cpu utilization:%d\n", time, util);
            statsd.recordGaugeValue("baz", util);
            statsd.recordGaugeValue("top", 100);
        } catch(Exception ex) {
            System.out.printf("exception\n");
        }
    }
}
