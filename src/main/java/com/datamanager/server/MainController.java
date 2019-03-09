package com.datamanager.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: com.datamanager.server
 * @description:
 * @author: liujinghui
 * @create: 2019-03-08 22:46
 **/
@RequestMapping("/test")
@Controller
public class MainController {

    @RequestMapping("/method")
    @ResponseBody
    public String method(){
        return "abc";
    }
}
