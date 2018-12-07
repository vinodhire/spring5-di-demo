package com.vinod.didemo.controller;

import com.vinod.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public  void  testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.MSG,constructorInjectedController.sayHello());
    }
}
