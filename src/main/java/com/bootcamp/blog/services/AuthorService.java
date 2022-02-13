package com.bootcamp.blog.services;

import com.bootcamp.blog.entities.Author;

public interface AuthorService {
   Author findById(int id);
   Author save(Author author);
   void delete(Author author);
}
