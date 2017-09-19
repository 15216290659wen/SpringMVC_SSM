package com.mskj.ssm.service.serviceImp.sys;

import com.mskj.ssm.Pojo.SysUserExt;
import com.mskj.ssm.dao.Sys_UserMapperExt;
import com.mskj.ssm.service.Iservice.sys.ISysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * userservice实现类  class for
 *
 * @author lizhiwen
 * @create 2017-09-13 16:03
 **/
@Service
public class SysUserServiceImp implements ISysUserService {

    @Resource
    private Sys_UserMapperExt sys_userMapperExt;


    public SysUserExt SelcectUserByName(String username) {


            Map<String,Object> map = new HashMap<String, Object>();
            map.put("username",username);
            return sys_userMapperExt.Select_UserByName(map);

    }
}
