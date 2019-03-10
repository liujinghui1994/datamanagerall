package com.datamanager.server.web.systemmanager.indexmanager.web;

import com.datamanager.server.api.systemmanager.logininmanager.constant.LoginConstant;
import com.datamanager.server.api.systemmanager.logininmanager.service.ILoginManagerService;
import com.datamanager.server.api.systemmanager.usermanager.model.UserVO;
import com.datamanager.server.impl.systemmanager.sessionmanager.helper.CookieHelper;
import com.datamanager.server.web.systemmanager.resultmanager.helper.Result;
import com.datamanager.server.web.systemmanager.resultmanager.helper.ResultVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登陆模块Controller
 */
@RequestMapping("/datamanager")
@Controller
public class IndexManagerController {

	private static final Logger logger = LoggerFactory.getLogger(IndexManagerController.class);

    /**
     * 登陆页面
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/index")
    public String loginPage(HttpServletRequest request,Model model) throws Exception {
        model.addAttribute("userVO",new UserVO());
        return "mainindex/mainindex";
    }


}
