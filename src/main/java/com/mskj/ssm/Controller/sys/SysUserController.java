package com.mskj.ssm.Controller.sys;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mskj.ssm.Pojo.SysUserExt;
import com.mskj.ssm.service.Iservice.sys.ISysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 用户控制器 handle  class for
 *
 * @author lizhiwen
 * @create 2017-09-13 16:30
 **/
@Controller
@RequestMapping("/test")
public class SysUserController {
    @Resource
    private ISysUserService iSysUserService;

    @RequestMapping("/one")
    public @ResponseBody Object selectByName(){
        JsonObject j = new JsonObject();

        Gson gson = new Gson();

        JsonParser jsonParser = new JsonParser();

         String name  = "李志文";
      SysUserExt as =    iSysUserService.SelcectUserByName(name);
      j.add("date",jsonParser.parse(gson.toJson(as)));
      System.out.println(j.toString());

      return  j;
    }
}
