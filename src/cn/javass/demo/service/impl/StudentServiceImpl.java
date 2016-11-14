package cn.javass.demo.service.impl;

import cn.javass.demo.dao.IPersonDao;
import cn.javass.demo.model.AddressModel;
import cn.javass.demo.model.StudentModel;
import cn.javass.demo.service.IAddressService;
import cn.javass.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 243277745@qq.com on 16/11/9.
 */

@Service("PersonService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IPersonDao userDao;

    @Autowired
    private IAddressService addressService;


    /**
     * 测试声明式事务在RuntimException回滚
     * @param user
     * @param addressModel
     */
    @Transactional(propagation= Propagation.REQUIRED, isolation= Isolation.READ_COMMITTED)
    @Override
    public void save(StudentModel user, AddressModel addressModel) throws Exception {

        userDao.savePerson(user);
        addressModel.setUserId(user.getId());
        addressService.save(addressModel);
    }

    @Override
    public int countAll() {
        return 0;
    }
}
