package com.mycompany.app;
import com.timgroup.statsd.NonBlockingStatsDClient;
import java.util.Timer;


public class App
{
    private static Timer timer;
    public static void main( String[] args )
    {
        showLibraryPath();
    }

    public static void showLibraryPath() {
        String path = System.getProperty("java.library.path");
        System.out.print("java.library.path is:" + path);
    }
}
