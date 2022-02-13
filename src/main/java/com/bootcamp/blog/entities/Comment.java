package com.bootcamp.blog.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="comment")
public @Data
class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "name")
    private String name;

    @Column(name = "estado")
    private String estado;

    @Column(name = "comentario")
    private String comentario;

}
