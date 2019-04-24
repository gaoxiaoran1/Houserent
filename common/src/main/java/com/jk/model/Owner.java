package com.jk.model;

public class Owner {

    //主键id
    private Integer id;

    //姓名
    private String name;

    //联系电话
    private Integer phone;

    //房屋城市
    private String area;

    //小区
    private String housing;

    //其他情况
    private String other_conditions;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public String getOther_conditions() {
        return other_conditions;
    }

    public void setOther_conditions(String other_conditions) {
        this.other_conditions = other_conditions;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", area='" + area + '\'' +
                ", housing='" + housing + '\'' +
                ", other_conditions='" + other_conditions + '\'' +
                '}';
    }
}
