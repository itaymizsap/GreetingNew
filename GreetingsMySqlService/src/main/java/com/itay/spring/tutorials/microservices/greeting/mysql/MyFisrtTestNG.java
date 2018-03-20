package com.itay.spring.tutorials.microservices.greeting.mysql;

import org.testng.annotations.Test;

@Test
public class MyFisrtTestNG {

    @Test
    public void myTestFunc() {

        System.out.println("Hi, This is my first testNG");
    }

    @Test(priority = 1)
    public void mySecondTestFunc() {

        System.out.println("Hi, This is my second testNG");
    }
}
