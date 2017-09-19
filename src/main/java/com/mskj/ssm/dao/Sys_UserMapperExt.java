package com.mskj.ssm.dao;

import com.mskj.ssm.Pojo.SysUserExt;

import java.util.Map;

/**
 * Created by ZHIWEN on 2017/9/13.
 */
public interface Sys_UserMapperExt {
    /**
     * description:查询客户
     */
    SysUserExt Select_UserByName(Map<String,Object> map);
}
