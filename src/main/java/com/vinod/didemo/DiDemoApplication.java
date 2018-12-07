package com.vinod.didemo;

import com.vinod.didemo.examplebeans.FakeDataSource;
import com.vinod.didemo.examplebeans.FakeJMSBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
         ApplicationContext ctx =  SpringApplication.run(DiDemoApplication.class, args);
         /*MyController controller =  (MyController) ctx.getBean("myController");
         controller.hello();*/

        /*System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(controller.hello());*/

        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource);

        FakeJMSBroker fakeJMSBroker = ctx.getBean(FakeJMSBroker.class);
        System.out.println(fakeJMSBroker);
    }
}
