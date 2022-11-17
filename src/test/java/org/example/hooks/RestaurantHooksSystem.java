package org.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class RestaurantHooksSystem {
    @Before("@SmokeTest")
    public void beforeDisplayMessage(Scenario sc){
        System.out.println("before hook " + sc.getName());
    }
    @After("@SmokeTest")
    public void afterDisplayMessage(Scenario sc){
        System.out.println("after hook " + sc.getName());

    }
}
