package com.example.dobuy.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 為了不讓mySql產生hibernate_sequence
    @Column(name = "user_id")
    private long userId;

    @NotNull
    @Column(name = "account", length = 20)
    private String account;

    @NotNull
    @Column(name = "password", length = 20)
    private String password;

    @NotNull
    @Column(name = "type", length = 1)
    private String type; // 管理者 or 使用者

}
