package com.xxx.blog.dao.po;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    // 用户ID，自增类型
    private int id;

    // 用户姓名
    private String name;

    // 用户密码，保存加密后的密码，配合salt使用，默认为"123456"
    private String password;

    // 配合password，存储加密后的密码，默认为123
    private String salt = "123";

    // 用户类型，1(COMMON)普通用户，2管理员(MANAGER)，默认普通用户
    private int type;

    // 用户状态，1(NORMAL)正常，2(BAN)封禁，3(DELETED)注销，默认正常
    private int status = 1;

    // 用户email，可为空
    private String email = "";

    // 用户创建日期，注册日期
    private Date createdDate;

    // 更新用户最新日期
    private Date updatedDate;

    public User() {
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", email='" + email + '\'' +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                '}';
    }
}
