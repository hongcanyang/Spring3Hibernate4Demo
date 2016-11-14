package cn.javass.demo.dao.hibernate4;

import cn.javass.common.dao.hibernate4.BaseHibernateDao;
import cn.javass.demo.dao.IAddressDao;
import cn.javass.demo.model.AddressModel;
import org.springframework.stereotype.Repository;

/**
 * Created by 243277745@qq.com on 16/11/9.
 */

@Repository("AddressDao")
public class AddressDaoImpl extends BaseHibernateDao<AddressModel, Integer> implements IAddressDao {

    @Override
    public void saveAddress(AddressModel address) {
        save(address);
    }
}
