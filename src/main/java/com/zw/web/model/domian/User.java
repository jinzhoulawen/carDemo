package com.zw.web.model.domian;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private String tel;
    private Integer identity;
}
