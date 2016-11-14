package cn.javass.demo.service.impl;

import cn.javass.demo.dao.IAddressDao;
import cn.javass.demo.dao.hibernate4.AddressDaoImpl;
import cn.javass.demo.model.AddressModel;
import cn.javass.demo.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 243277745@qq.com on 16/11/9.
 */

@Service("AddressService")
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressDaoImpl addressDao;


    public void save(AddressModel address) throws Exception {

        addressDao.saveAddress(address);
        throw new Exception();//抛出异常 默认是RuntimeException 在rollback-for配置处理
    }

    public int countAll() {
        return addressDao.countAll();
    }
}
