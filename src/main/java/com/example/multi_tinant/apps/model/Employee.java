package com.example.multi_tinant.apps.model;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
@Access(value=AccessType.FIELD)
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

