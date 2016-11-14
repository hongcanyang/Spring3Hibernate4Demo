package cn.javass.demo.service;

import cn.javass.demo.model.AddressModel;
import cn.javass.demo.model.StudentModel;

/**
 * Created by 243277745@qq.com on 16/11/9.
 */
public interface IStudentService {

    void save(StudentModel studentModel, AddressModel addressModel) throws Exception;

    int countAll();
}
