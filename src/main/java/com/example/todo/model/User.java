package com.example.todo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_ID")
    private int userID ;
    private String userName ;
    private String name ;
    private String surname ;
    private String password ;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "userId")
    private Set<Task> userTask ;

    public int getUserID() {return userID; }

    public void setUserID(int userID) {this.userID = userID; }

    public String getUserName() { return userName; }

    public void setUserName(String userName) { this.userName = userName; }

    public String getName() { return name;}

    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }

    public Set<Task> getUserTask() { return userTask; }

    public void setUserTask(Set<Task> userTask) { this.userTask = userTask; }
}
