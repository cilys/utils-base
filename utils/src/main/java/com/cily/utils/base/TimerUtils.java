package com.cily.utils.base;

import com.cily.utils.base.log.Logs;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * user:cily
 * time:2017/8/28
 * desc:计时器
 */
public class TimerUtils {
    private final static ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

    /**
     * 启动定时器任务
     * @param run           定时器任务
     * @param initialDelay  启动时，延时多少时间
     * @param period        时间间隔
     * @param unit          间隔单位
     */
    public final static void task(Runnable run, long initialDelay, long period, TimeUnit unit){
        Logs.sysOut("" + service.isShutdown());
        if(!service.isShutdown()){
            service.scheduleAtFixedRate(run, initialDelay, period, unit);
        }
    }

    /**
     * 停止定时器
     */
    public final static void shutdown(){
        if(!service.isShutdown()){
            service.shutdown();
        }
    }

    /**
     * 特定时间开始定时器
     * @param task      定时器任务
     * @param c         指定时间
     * @param period    时间间隔
     * @param dateType
     * @param inval
     */
    public final static void start(TimerTask task, Calendar c, long period, int dateType, int inval){
        Date d = c.getTime();
        if(d.before(new Date())){
            d = changeDate(d, dateType, inval);
        }

        Timer t = new Timer();
        t.schedule(task, d, period);
    }

    public final static Date changeDate(Date d, int dateType, int num){
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        c.add(dateType, num);
        return c.getTime();
    }
}
