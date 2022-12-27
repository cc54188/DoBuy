package com.example.dobuy.models;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "pro_type")
public class ProType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_type_id")
    private long proTypeId;

    @NotNull
    @Column(name = "pro_type_name", length = 200)
    private String proTypeName;

    @Column(name = "desc", length = 2000)
    private String desc; // 商品類型描述

    @NotNull
    @Column(name = "create_user")
    private long createUser; // 創建者userId

    @NotNull
    @Column(name = "create_time")
    private Instant createTime;

    @NotNull
    @Column(name = "update_user")
    private long updateUser; // 變更者userId

    @NotNull
    @Column(name = "update_time")
    private Instant updateTime;

    public long getProTypeId() {
        return proTypeId;
    }

    public void setProTypeId(long proTypeId) {
        this.proTypeId = proTypeId;
    }

    public String getProTypeName() {
        return proTypeName;
    }

    public void setProTypeName(String proTypeName) {
        this.proTypeName = proTypeName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(long createUser) {
        this.createUser = createUser;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public long getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(long updateUser) {
        this.updateUser = updateUser;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ProType{" +
                "proTypeId='" + proTypeId + '\'' +
                ", proTypeName='" + proTypeName + '\'' +
                ", desc='" + desc + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", updateUser='" + updateUser + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
