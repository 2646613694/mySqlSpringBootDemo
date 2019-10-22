package com.jumpower.mysqlspringboot.controller;

import com.jumpower.mysqlspringboot.entity.WmsUser;
import com.jumpower.mysqlspringboot.service.WmsUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
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

}
