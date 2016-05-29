package com.yew1eb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "https://github.com/yew1eb");
        return "index";
    }
}

