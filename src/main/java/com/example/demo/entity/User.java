package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column private int id;

    public static int MIN_AGE = 13;

    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="fname")
    private String fname;
    @Column(name="lname")
    private String lname;

    @Column(name="todolist")
    private String todolist;


    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getMinAge() {
        return MIN_AGE;
    }

    public static void setMinAge(int minAge) {
        MIN_AGE = minAge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fname;
    }

    public void setfName(String fName) {
        this.fname = fName;
    }

    public String getlName() {
        return lname;
    }

    public void setlName(String lName) {
        this.lname = lName;
    }

    public String getToDoList() {
        return todolist;
    }

    public void setToDoList(String toDoList) {
        this.todolist = toDoList;
    }
}
