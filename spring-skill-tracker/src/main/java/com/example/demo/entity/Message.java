package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "message")
public class Message {
    
    @Id
    private String mail;
    
    private String message;
}
