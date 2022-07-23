package com.chap004mtestwithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEnvironmentUrlApp {

    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns hard coded URL", "http://192.123.0.3:67", TestAppEnv.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the domain", "192.123.0.3", TestAppEnv.DOMAIN);
        assertEquals("Just the port", "67", TestAppEnv.PORT);
    }

//    @Test
//        public void checkTitleCorrectionOnApp() {
//
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("http://192.123.0.3:67");
//
//        assertEquals("Title should match", "Test app", driver.getTitle());
//    }
}
