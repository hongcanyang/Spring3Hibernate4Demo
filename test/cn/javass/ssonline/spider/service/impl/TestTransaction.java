package cn.javass.ssonline.spider.service.impl;

import cn.javass.demo.model.AddressModel;
import cn.javass.demo.model.StudentModel;
import cn.javass.demo.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 243277745@qq.com on 16/11/9.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-*.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
public class TestTransaction {

    @Autowired
    private IStudentService userService;

    @Test
    public void testAddUser() throws Exception {

        StudentModel user = new StudentModel();
        user.setName("aa");
        AddressModel address = new AddressModel();
        address.setCity("city");
        address.setProvince("province");
        userService.save(user, address);

    }
}
