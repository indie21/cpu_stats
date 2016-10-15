package com.mycompany.app;

import com.timgroup.statsd.StatsDClient;
import com.timgroup.statsd.NonBlockingStatsDClient;

public class StatsdDemo {
    private static final StatsDClient statsd = new NonBlockingStatsDClient("my.prefix", "cando-zhuoyikang.hz.tenxapp.com", 45046);

    public static void test() {

        System.out.println("statsd do....");

        for (int i = 0; i< 10000; i++) {
            statsd.incrementCounter("bar");
            statsd.recordGaugeValue("baz", 100);
            statsd.recordExecutionTime("bag", 25);
            statsd.recordSetEvent("qux", "one");
        }

        System.out.println("statsd end....");


    }

}
