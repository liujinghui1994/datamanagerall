package com.datamanager.server.web.systemmanager.demomanager.web;

import com.datamanager.server.api.systemmanager.demomanager.model.DemoVO;
import com.datamanager.server.api.systemmanager.demomanager.service.IDemoManagerService;
import com.datamanager.server.api.systemmanager.usermanager.model.UserVO;
import com.datamanager.server.api.systemmanager.usermanager.service.IUserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import java.util.List;

/**
 * @program: com.datamanager.server.web.systemmanager.usermanager.web
 * @description:
 * @author: liujinghui
 * @create: 2019-03-10 11:16
 **/
@Controller
@RequestMapping("/demo")
public class DemoManagerController {

    @Autowired
    private IDemoManagerService iDemoManagerService;

    @RequestMapping("/searchDemoList")
    public String searchDemoList(Model model){
        model.addAttribute("demoList",iDemoManagerService.queryDemoVOList());
        return "/demo/demopage-search";
    }

    @RequestMapping("/managerDemoList")
    public String managerDemoList(Model model){
        model.addAttribute("demoList",iDemoManagerService.queryDemoVOList());
        return "/demo/demopage-manager";
    }

    @RequestMapping("/deleteDemo")
    @ResponseBody
    public String deleteDemo(long id){
        iDemoManagerService.deleteDemoVO(id);
        return "delete success";
    }

    @RequestMapping("/updateDemo")
    @ResponseBody
    public void updateDemo(String id,String name,String email,String detail){
        DemoVO demoVO = new DemoVO(Integer.parseInt(id),name,email,detail);
        iDemoManagerService.updateDemoVO(demoVO);
    }

    @RequestMapping("/addDemo")
    @ResponseBody
    public void addDemo(String id,String name,String email,String detail){
        DemoVO demoVO = new DemoVO(Integer.parseInt(id),name,email,detail);
        iDemoManagerService.addDemoVO(demoVO);
    }
}
