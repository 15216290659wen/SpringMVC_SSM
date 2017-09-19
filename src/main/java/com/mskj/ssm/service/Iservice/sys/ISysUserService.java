package com.mskj.ssm.service.Iservice.sys;

import com.mskj.ssm.Pojo.SysUserExt;

/**
 *
 */


public interface ISysUserService {

    /**
    * @Author 李志文【lizhiwen】
    * @Description : 查询用户接口byname接口
    * @param
    * @return
    * @Date 2017/9/13
    **/
   SysUserExt SelcectUserByName(String username);
}
