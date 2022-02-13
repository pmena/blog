package com.bootcamp.blog.services;

import com.bootcamp.blog.entities.Blog;
import com.bootcamp.blog.repositories.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class BlogServiceImpl implements  BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id);
    }

    @Override
    public Blog save(Blog author) {
        return blogRepository.save(author);
    }

    @Override
    public void delete(Blog author) {
        blogRepository.delete(author);
    }
}
