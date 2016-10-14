package com.mycompany.app;


import org.hyperic.sigar.CpuInfo;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.FileSystem;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.NetFlags;
import org.hyperic.sigar.NetInterfaceConfig;
import org.hyperic.sigar.NetInterfaceStat;
import org.hyperic.sigar.OperatingSystem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.Swap;
import org.hyperic.sigar.Who;
import java.util.TimerTask;


public class CpuStats {

    public static double utilization() {
        double ret = 0.0;
        Sigar sigar = new Sigar();
        CpuPerc cpuList[] = null;

        try {
            cpuList = sigar.getCpuPercList();
        }catch(Exception ex) {
            System.out.println("sigar exception !!!!");
            ex.printStackTrace();
        }

        for (int i = 0; i < cpuList.length; i++) {
            CpuPerc cpu = cpuList[i];
            ret += cpu.getCombined();
        }

        return ret / cpuList.length;
    }
}
