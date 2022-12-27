package com.example.dobuy.models;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

@Entity
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

    @Column(name = "desc", length = 1000)
    private String desc; // 商品描述

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


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }

    public int getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(int realPrice) {
        this.realPrice = realPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", type='" + type + '\'' +
                ", proName='" + proName + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", realPrice=" + realPrice +
                ", amount=" + amount +
                ", discount='" + discount + '\'' +
                ", seller='" + seller + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", updateUser='" + updateUser + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
