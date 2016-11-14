package cn.javass.demo.model;

import cn.javass.common.model.AbstractModel;

import javax.persistence.*;

/**
 * Created by 243277745@qq.com on 16/11/9.
 */

@Entity
@Table(name = "address")
public class AddressModel extends AbstractModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;

    private String province;

    private String city;

    private int  userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
