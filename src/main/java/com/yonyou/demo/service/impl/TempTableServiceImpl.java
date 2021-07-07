package com.yonyou.demo.service.impl;

import com.yonyou.demo.bean.PersonBean;
import com.yonyou.demo.dao.ITempTableDao;
import com.yonyou.demo.service.ITempTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("tempTableService")
public class TempTableServiceImpl implements ITempTableService {
    @Autowired
    ITempTableDao tempTableDao;

    @Transactional
    @Override
    public List<PersonBean> tempTableSimpleTest() {
        tempTableDao.createTempTable("person");
        PersonBean person = new PersonBean();
        person.setName("张三");
        person.setAge(18);
        tempTableDao.insertPerson(person);
        person.setName("赵四");
        person.setAge(45);
        tempTableDao.updateStudent(person);

        List<PersonBean> personList = tempTableDao.selectPerson();
        return personList;
    }
}
