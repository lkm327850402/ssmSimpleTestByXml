package com.lkm.test;

import com.lkm.dao.LkmMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author lkm
 * @create 2021-01-21 10:19
 * @description TODO
 */



@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MyMbgTest {

    @Autowired
    LkmMapper lkmMapper;
    @Test
    public void aa() {
        System.out.println(lkmMapper);
    }

}
