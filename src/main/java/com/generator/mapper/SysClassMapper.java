package com.generator.mapper;

import com.generator.pojo.SysClass;
import com.generator.pojo.SysClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_class
     *
     * @mbggenerated
     */
    int countByExample(SysClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_class
     *
     * @mbggenerated
     */
    int deleteByExample(SysClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_class
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_class
     *
     * @mbggenerated
     */
    int insert(SysClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_class
     *
     * @mbggenerated
     */
    int insertSelective(SysClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_class
     *
     * @mbggenerated
     */
    List<SysClass> selectByExample(SysClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_class
     *
     * @mbggenerated
     */
    SysClass selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_class
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SysClass record, @Param("example") SysClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_class
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SysClass record, @Param("example") SysClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_class
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SysClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_class
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysClass record);
}