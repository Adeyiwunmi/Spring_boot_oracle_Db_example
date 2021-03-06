package com.exam.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "STAFF")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SNO")
    private int id;

    @Column(name = "STAFFID")
    private int STAFFID;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public User(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
