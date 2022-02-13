package com.bootcamp.blog.services;

import com.bootcamp.blog.entities.Author;
import com.bootcamp.blog.entities.Blog;

public interface BlogService {
    Blog findById(int id);
    Blog save(Blog author);
    void delete(Blog author);
}
