package com.lkm.controller;

import com.lkm.dao.LkmMapper;
import com.lkm.entity.Lkm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author lkm
 * @create 2021-01-20 17:06
 * @description TODO
 */
@Controller
public class MyController {

    @Autowired
    LkmMapper lkmMapper;

    @RequestMapping("/aa")
    public String aa() {
        List<Lkm> lkms = lkmMapper.selectAll();
        System.out.println(lkms);
        return "aa";
    }
}
