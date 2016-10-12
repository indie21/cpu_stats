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
        System.out.println( "Hello World!" );
        timer = new Timer();
        timer.schedule(new StatsdTask(), 0, 3 * 1000);

        // statsd.incrementCounter("bar");
        // statsd.recordGaugeValue("baz", 100);
        // statsd.recordExecutionTime("bag", 25);
        // statsd.recordSetEvent("qux", "one");
    }
}
