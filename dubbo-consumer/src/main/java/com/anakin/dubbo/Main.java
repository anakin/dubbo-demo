package com.anakin.dubbo;

import org.apache.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] aorgs) throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        // Obtaining a remote service proxy
        DemoService demoService = (DemoService)context.getBean("demoService");
        // Executing remote methods
        String hello = demoService.sayHello("world");
        // Display the call result
        System.out.println(hello);
    }
}
