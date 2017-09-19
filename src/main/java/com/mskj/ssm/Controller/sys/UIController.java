package com.mskj.ssm.Controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * UI控制器 负责ui跳转  class for
 *
 * @author 李志文
 * @create 2017-09-13 16:34
 **/
@Controller
@RequestMapping("/ui")
public class UIController {

    /**
    * @Author 李志文【lizhiwen】
    * @Description :  controller index跳转至登录页面
    * @param
    * @return
    * @Date 2017/9/13
    **/
    @RequestMapping("/loginPwd")
    public String  loginPwd(){
        return  "/login";
    }
}
