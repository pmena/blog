package com.bootcamp.blog.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="blog")
public @Data
class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "url")
    private String url;

    @Column(name = "status")
    private String status;

    @Column(name = "usuario")
    private int usuario;
}
