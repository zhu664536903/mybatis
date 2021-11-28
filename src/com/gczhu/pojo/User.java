package com.gczhu.pojo;


import org.apache.ibatis.type.Alias;

import javax.annotation.Generated;
import java.text.SimpleDateFormat;
import java.util.Date;


public class User {

    private Integer id;
    private String name;
    private String gender;
    private Date createTime;

    public User() {
    }

    public User(Integer id, String name, String gender, Date createTime) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.createTime = createTime;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }



    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", createTime=" + new SimpleDateFormat("YYYY-mm-dd HH:mm:ss").format(createTime) +
                '}';
    }
}
