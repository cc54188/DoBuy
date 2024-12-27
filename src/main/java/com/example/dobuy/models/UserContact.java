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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_contact")
public class UserContact implements Serializable {

    @Id
    @Column(name = "user_id")
    private long userId;

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

}
