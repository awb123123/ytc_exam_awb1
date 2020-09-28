package com.ytc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("top")
    public String getTop(){
        return  "frame/top";
    }
    @RequestMapping("center")
    public String getCenter(){
        return  "frame/center";
    }
    @RequestMapping("left")
    public String getLeft(){
        return  "frame/left";
    }
}
