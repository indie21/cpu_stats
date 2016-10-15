package com.mycompany.app;
import com.sun.scenario.animation.shared.TimerReceiver;
import com.timgroup.statsd.NonBlockingStatsDClient;

import java.util.Timer;


public class App
{
    private static Timer timer;
    public static void main( String[] args )
    {
        showLibraryPath();
        timerRun();
    }

    public static void showLibraryPath() {
        String path = System.getProperty("java.library.path");
        System.out.print("java.library.path is:" + path + "\n");
    }

    public static void timerRun() {
        timer = new Timer();
        timer.schedule(new StatsdTask(), 0, 3 * 1000);
    }
}
