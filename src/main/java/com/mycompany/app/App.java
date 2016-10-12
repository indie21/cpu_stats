package com.mycompany.app;
import com.timgroup.statsd.StatsDClient;
import com.timgroup.statsd.NonBlockingStatsDClient;


/**
 * Hello world!
 *
 */
public class App
{
    //private static final StatsDClient statsd = new NonBlockingStatsDClient("my.prefix", "statsd-host", 8125);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // statsd.incrementCounter("bar");
        // statsd.recordGaugeValue("baz", 100);
        // statsd.recordExecutionTime("bag", 25);
        // statsd.recordSetEvent("qux", "one");
    }
}
