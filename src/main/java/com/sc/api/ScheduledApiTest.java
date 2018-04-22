package com.sc.api;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.testng.TestNG;
import org.testng.collections.Lists;

import java.util.List;

/**
 * Created by Suncy on 2018/4/22 0022.
 */
@Component("scheduledManager")
public class ScheduledApiTest {
    /**
     * 心跳更新。启动时执行一次，之后每隔1分钟执行一次
     */
    @Scheduled(fixedRate = 1000*60*1) //每天凌晨两点执行 (0 0 2 * * ?)
    void doSomethingWith(){
        System.out.println("doSomethingWith---------");
        TestNG testng = new TestNG();
        List suites = Lists.newArrayList();
//        String path = System.getProperty("Interfaces.root");
//        System.out.println(path);
        String localPath = "D:\\workspaces\\Interfaces\\src\\main\\resources\\testng.xml";
        suites.add(localPath);//path to xml..
        testng.setTestSuites(suites);
        testng.run();
    }
}
