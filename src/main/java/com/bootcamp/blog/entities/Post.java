package com.bootcamp.blog.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="post")
public @Data
class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private String date;

    @Column(name = "status")
    private String status;

    @Column(name = "content")
    private String content;

    @Column(name = "blog")
    private String blog;

    @Column(name = "author")
    private String author;
}
