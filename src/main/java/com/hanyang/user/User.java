package com.hanyang.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hanyang.core.BaseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.Entity;

@Entity
public class User extends BaseEntity {
    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
    private String name;
    private String[] roles;
    @JsonIgnore
    private String password;

    protected User() {
        super();
    }

    public User(String name, String[] roles, String password) {
        super();
        this.name = name;
        this.roles = roles;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
