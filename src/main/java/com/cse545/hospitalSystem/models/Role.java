package com.cse545.hospitalSystem.models;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "roles")
@Data
public class Role {
    @Id
    @Column(name = "role_id")
    private Long id;
     
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }
}
