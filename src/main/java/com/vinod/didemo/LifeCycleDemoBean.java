package com.vinod.didemo;

import com.vinod.didemo.repository.GreetingRepository;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    private GreetingRepository greetingRepository;

    @Autowired
    public void setGreetingRepository(GreetingRepository greetingRepository) {
        System.out.println("## I'm in set greeting repository method, setting property");
        this.greetingRepository = greetingRepository;
    }

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean constructor");
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("## LifeCycleBean name has been set to "+beanName);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## LifeCycleBean has factory set"+beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## LifeCycleBean has ApplicationContext : "+applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## LifCycleBean has its properties set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## LifeCycleBean post construct annotated method has been called");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## LifeCycleBean pre destroy annotated method has been called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## LifeCycleBean has been terminated");
    }


}
