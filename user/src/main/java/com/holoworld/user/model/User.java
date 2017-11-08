package com.holoworld.user.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 潘峰
 * @date 2017/11/8 下午6:36
 */
@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 20, nullable = true, name = "username")
    private String name;

    private String password;

    @Temporal(TemporalType.DATE)
    private Date birthday;


}
