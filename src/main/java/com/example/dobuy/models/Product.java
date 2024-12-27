package com.example.dobuy.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @Column(name = "product_id", length = 20)
    private String productId;

    @NotNull
    @Column(name = "type", length = 20)
    private String type; // ProTypeId

    @NotNull
    @Column(name = "pro_name", length = 100)
    private String proName; // 商品名稱

    @Column(name = "pro_desc", length = 1000)
    private String proDesc; // 商品描述

    @NotNull
    @Column(name = "price")
    private int price; // 價錢

    @Column(name = "real_price")
    private int realPrice; // 實際售價(打折後)

    @Column(name = "amount")
    private int amount; // 剩餘數量

    @Column(name = "discount", length = 1000)
    private String discount; // 優惠

    @Column(name = "seller", length = 20)
    private String seller; // 賣家(userId)

    @NotNull
    @Column(name = "create_user", length = 20)
    private String createUser; // 賣商品的userId

    @NotNull
    @Column(name = "create_time")
    private Instant createTime;

    @NotNull
    @Column(name = "update_user", length = 20)
    private String updateUser; // 變更者(賣家or買家)

    @NotNull
    @Column(name = "update_time")
    private Instant updateTime;

}
