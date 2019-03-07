package com.syw.demo1.entity;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private int id;
    private String name;
    private String password;
}
