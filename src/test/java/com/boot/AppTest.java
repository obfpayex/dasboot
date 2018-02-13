package com.boot;

import com.boot.controller.HomeController;
import junit.framework.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @org.junit.Test
    public void testApp(){
        HomeController homeController = new HomeController();
        String result = homeController.home();
        assertEquals(result,"Das boot, reporting for duty");
    }

}