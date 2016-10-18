package com.mycompany.app;
import com.sun.scenario.animation.shared.TimerReceiver;
import com.timgroup.statsd.NonBlockingStatsDClient;
import java.io.FileInputStream;
import java.util.Timer;
import java.io.IOException;
import java.util.Properties;


public class App
{
    private static Timer timer;
    public static void main( String[] args )
    {
        readConfig(args);
        showLibraryPath();
        timerRun();
    }

    // 打印lib路径
    public static void showLibraryPath() {
        String path = System.getProperty("java.library.path");
        System.out.print("java.library.path is:" + path + "\n");
    }

    // 启动定时器
    public static void timerRun() {
        timer = new Timer();
        timer.schedule(new StatsdTask(), 0, 3 * 1000);
    }

    // 读取配置文件
    public static void readConfig(String[] args) {
        Config.config.loadArgs(args);
        System.out.println(Config.config.getStastdHost());
        // System.out.println("您调用main方法时指定的参数包括：");
        // for (int i = 0; i < args.length; i++) {
        //     System.out.println("参数" + (i + 1) + "的值为：" + args[i]);
        // }
    }

}
