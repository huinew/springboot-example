package com.example.mongodbdemo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class User implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;

    private String userName;
    private String passWord;

    @Override
    public String toString() {
        return "UserEntity{" +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}