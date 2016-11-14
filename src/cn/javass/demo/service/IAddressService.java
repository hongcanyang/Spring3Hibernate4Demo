package cn.javass.demo.service;

import cn.javass.demo.model.AddressModel;

/**
 * Created by 243277745@qq.com on 16/11/9.
 */
public interface IAddressService {

    void save(AddressModel address) throws Exception;

    int countAll();
}
