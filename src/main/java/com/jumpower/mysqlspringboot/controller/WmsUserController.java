package com.jumpower.mysqlspringboot.controller;

import com.jumpower.mysqlspringboot.entity.WmsUser;
import com.jumpower.mysqlspringboot.service.WmsUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class WmsUserController {

    @Resource
    private WmsUserService wmsUserService;

    /**
     * 返回首页
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String index( Model model, HttpSession session){



        return "index";
    }
    @PostMapping("/wmsUserList")
    @ResponseBody
    public Object xxx(WmsUser wmsUser){
        List<WmsUser>  wmsUsers = wmsUserService.queryWmsUserMapperList(wmsUser);
        return wmsUsers;
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

    /**
     * 用于测试
     * @param XX
     * @return
     */
    @GetMapping(value = "/aoligei")
    public String aoligei( @RequestParam(value = "XX",required = false) List<String> XX){
        System.out.println(XX.get(0));
        return null;
    }

}
