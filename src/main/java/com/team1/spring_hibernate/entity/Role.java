package com.team1.spring_hibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<User> users = new HashSet<>();


    public Role(){

    }

    public Role(int id, String name) {
        this.id = id;
        this.name = name;
    }


    // ---------------------------Book roles-----------------------------------
    @OneToMany(mappedBy = "role")
    private Set<User> user = new HashSet<User>();

    public Set<User> getUserss() {
        return user;
    }

    public void setUserss(Set<User> user) {
        this.user = user;
    }

    public void setUser(Set<User> user) {
        this.user = user;
    }

    public void addUsers(User user) {
        this.user.add(user);
    }

    public void addGroup(User user) {
        this.user.add(user);
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    // --------------------------------------------------------------

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

}
