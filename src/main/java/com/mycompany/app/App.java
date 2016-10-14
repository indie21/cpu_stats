package com.mycompany.app;
import com.timgroup.statsd.StatsDClient;
import com.timgroup.statsd.NonBlockingStatsDClient;
import java.util.Timer;


/**
 * Hello world!
 *
 */
public class App
{
    private static Timer timer;
    //private static final StatsDClient statsd = new NonBlockingStatsDClient("my.prefix", "statsd-host", 8125);
    public static void main( String[] args )
    {
        showLibraryPath();


    }

    public static void showLibraryPath() {
        String path = System.getProperty("java.library.path");
        System.out.print("java.library.path is:" + path);
    }


}
