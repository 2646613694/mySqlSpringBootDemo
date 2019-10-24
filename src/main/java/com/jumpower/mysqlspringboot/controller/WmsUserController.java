package com.jumpower.mysqlspringboot.controller;

import com.jumpower.mysqlspringboot.entity.WmsUser;
import com.jumpower.mysqlspringboot.service.WmsUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class WmsUserController {

    @Resource
    private WmsUserService wmsUserService;

    /**
     * 返回首页
     * @param wmsUser
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String index(WmsUser wmsUser, Model model){
        List<WmsUser> wmsUsers = wmsUserService.queryWmsUserMapperList(wmsUser);
        model.addAttribute("WmsUsersList",wmsUsers);
        return "index";
    }

    /**
     * 访问添加方法
     * @return
     */
    @RequestMapping("/insert")
    public String insert(){
        WmsUser wmsUser=new WmsUser();
        wmsUser.setUserId(800);
        wmsUser.setUserUsername("小名");
        wmsUser.setUserPassword("111111");
        List<WmsUser> list = new ArrayList<>();
        list.add(wmsUser);
       // list.add(new WmsUser(888,"小名","123456"));
        wmsUserService.insertWmsUserMapperList(list);
        return "index";
    }

}
