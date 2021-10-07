package com.nsss.pizzamanagementsystembackend.request;

import com.nsss.pizzamanagementsystembackend.model.Role;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Set;

public class SignupRequest {
    private String username;
    private String email;
    private Set<String> roles;
    private String password;

    private String createdBy;

//    public SignupRequest(String username, String email, Set<String> roles, String password) {
//        this.username = username;
//        this.email = email;
//        this.roles = roles;
//        this.password = password;
//    }

    public SignupRequest(String username, String email, Set<String> roles, String password, String createdBy) {
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.password = password;
        this.createdBy = createdBy;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
