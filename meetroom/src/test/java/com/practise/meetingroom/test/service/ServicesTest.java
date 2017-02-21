package com.practise.meetingroom.test.service;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/../../main/resources/applicationContext.xml"})
public class ServicesTest {
    @Autowired
//    private UserServiceImpl userService;
@Test
    public void test(){

//        userService.selectByUsername("123");
    }


}

