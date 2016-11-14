package cn.javass.demo.model;

import cn.javass.common.model.AbstractModel;
import cn.javass.demo.model.AddressModel;
import jdk.nashorn.internal.ir.annotations.Ignore;

import javax.persistence.*;

/**
 * Created by 243277745@qq.com on 16/11/9.
 */

@Entity
@Table(name = "student")
public class StudentModel extends AbstractModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
