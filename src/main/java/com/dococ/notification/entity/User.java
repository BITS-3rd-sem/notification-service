package com.dococ.notification.entity;

import lombok.Data;

@Data
public class User {

    public int userId;

    public String name;

    public String email;

    private String role;
}
