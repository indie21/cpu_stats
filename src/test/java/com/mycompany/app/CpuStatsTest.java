package com.mycompany.app;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class CpuStatsTest extends TestCase
{
    public void testUtilization() {
        double util = CpuStats.utilization();

        System.out.println("cpu 使用率:");
        System.out.println(util);
    }

}
