package com.bootcamp.blog.services;

import com.bootcamp.blog.entities.Author;
import com.bootcamp.blog.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements  AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Author findById(int id) {
        return authorRepository.findById(id);
    }

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public void delete(Author author) {
        authorRepository.delete(author);
    }
}
