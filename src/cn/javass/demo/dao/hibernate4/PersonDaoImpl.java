package cn.javass.demo.dao.hibernate4;

import cn.javass.common.dao.hibernate4.BaseHibernateDao;
import cn.javass.demo.dao.IPersonDao;
import cn.javass.demo.model.StudentModel;
import org.springframework.stereotype.Repository;

/**
 * Created by 243277745@qq.com on 16/11/9.
 */

@Repository("PersonDao")
public class PersonDaoImpl extends BaseHibernateDao<StudentModel, Integer> implements IPersonDao {

    @Override
    public void savePerson(StudentModel studentModel) {
        save(studentModel);
    }
}
