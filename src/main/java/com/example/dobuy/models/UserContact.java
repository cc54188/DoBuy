package com.example.dobuy.models;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "user_contact")
public class UserContact implements Serializable {

    @Id
    @Column(name = "user_id", length = 20)
    private String userId;

    @Id
    @Column(name = "idno", length = 20)
    private String idno; // 身分證字號

    @NotNull
    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "work_tel", length = 20)
    private String workTel;

    @Column(name = "home_tel", length = 20)
    private String homeTel;

    @Column(name = "mobile_tel", length = 20)
    private String mobileTel; // 手機

    @Column(name = "mail", length = 50)
    private String mail; // 電子信箱

    @Column(name = "zip", length = 3)
    private String zip; // 郵遞區號

    @Column(name = "city", length = 6)
    private String city;

    @Column(name = "town", length = 6)
    private String town;

    @Column(name = "addr_other", length = 100)
    private String addrOther;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkTel() {
        return workTel;
    }

    public void setWorkTel(String workTel) {
        this.workTel = workTel;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getMobileTel() {
        return mobileTel;
    }

    public void setMobileTel(String mobileTel) {
        this.mobileTel = mobileTel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getAddrOther() {
        return addrOther;
    }

    public void setAddrOther(String addrOther) {
        this.addrOther = addrOther;
    }

    @Override
    public String toString() {
        return "UserContact{" +
                "userId='" + userId + '\'' +
                ", idno='" + idno + '\'' +
                ", name='" + name + '\'' +
                ", workTel='" + workTel + '\'' +
                ", homeTel='" + homeTel + '\'' +
                ", mobileTel='" + mobileTel + '\'' +
                ", mail='" + mail + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", addrOther='" + addrOther + '\'' +
                '}';
    }
}
