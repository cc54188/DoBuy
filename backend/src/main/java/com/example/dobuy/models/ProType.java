package com.example.dobuy.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "pro_type")
public class ProType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pro_type_id")
    private long proTypeId;

    @NotNull
    @Column(name = "pro_type_name", length = 200)
    private String proTypeName;

    @Column(name = "pro_type_desc", length = 2000)
    private String proTypeDesc; // 商品類型描述

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
}
