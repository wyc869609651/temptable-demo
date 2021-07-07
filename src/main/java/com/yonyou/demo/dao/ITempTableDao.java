package com.yonyou.demo.dao;

import com.yonyou.demo.bean.PersonBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ITempTableDao {

    /**
     * 创建临时表
     * @param tableName
     */
    int createTempTable(@Param("tableName") String tableName);

    /**
     * 临时表添加数据
     * @param person
     */
    boolean insertPerson(PersonBean person);

    /**
     * 临时表修改数据
     * @param person
     */
    int updateStudent(PersonBean person);

    /**
     * 临时表查询数据
     */
    List<PersonBean> selectPerson();

}
