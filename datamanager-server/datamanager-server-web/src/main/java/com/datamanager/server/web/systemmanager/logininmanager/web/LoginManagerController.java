package com.datamanager.server.web.systemmanager.logininmanager.web;

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

@RequestMapping("login")
@Controller
public class LoginManagerController {

	private static final Logger logger = LoggerFactory.getLogger(LoginManagerController.class);

	@Autowired
	private ILoginManagerService iLoginManagerService;
	@Autowired
	private CookieHelper cookieHelper;


    /**
     * 登陆页面
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("/loginPage")
    public String loginPage(HttpServletRequest request,Model model) throws Exception {
        model.addAttribute("userVO",new UserVO());
        return "login/login";
    }

	/**
     * 执行登陆
     * @param //request
     * @return
     * @throws Exception
     */
    @RequestMapping("/doLogin")
    @ResponseBody
    public ResultVO doLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model, UserVO user) throws Exception {
        //输入内容校验
        if(null == user || null == user.getUserName() || null == user.getUserPassword()){
            return Result.error(LoginConstant.EMPTY_INPUT);
        }
        UserVO userVO = null;
        try{
            userVO = iLoginManagerService.loginUserByUserNameAndUserPassword(user.getUserName(),user.getUserPassword());
            if(null == userVO){
                return Result.error(LoginConstant.WRONG_USERNAME_PASSWORD);
            }
            model.addAttribute("userVO",userVO);
            //!!!!登陆成功后我们就设置我们的Cookie
            cookieHelper.addCookie(response,session.getId(),userVO);
        }catch(Exception e){
            e.printStackTrace();
           return Result.error(e,LoginConstant.QUERY_USER_INFO_ERROR);
        }
        return Result.success(LoginConstant.LOGIN_SUCCESS);
    }

}
