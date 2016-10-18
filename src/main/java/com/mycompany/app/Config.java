package com.mycompany.app;

import com.sun.scenario.animation.shared.TimerReceiver;
import com.timgroup.statsd.NonBlockingStatsDClient;

import junit.framework.Assert;

import java.io.FileInputStream;
import java.util.Timer;
import java.io.IOException;
import java.util.Properties;


public class Config {


    public static Config config =
        new Config("cando-v4-zhuoyikang.hzv.tenxapp.com", 39378, "cpu");

    public Config(String stastdHost, int stastdPort, String identity) {
        this.stastdHost = stastdHost;
        this.stastdPort = stastdPort;
        this.identity = identity;
    }

    private String stastdHost;
    private int stastdPort;
    private String identity;

    public String getStastdHost() {
        return this.stastdHost;
    }

    public void setStastdHost(String statsdHost) {
        this.stastdHost = statsdHost;
    }

    public int getStastdPort() {
        return this.stastdPort;
    }

    public void setStastdPort(int stastdPort) {
        this.stastdPort = stastdPort;
    }


    public String getIdentity() {
        return this.identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public void loadArgs(String[] args) {
        Assert.assertEquals(args.length, 3);
        stastdHost = args[0];
        stastdPort = Integer.parseInt(args[1]);
        identity = args[2];
    }

}
