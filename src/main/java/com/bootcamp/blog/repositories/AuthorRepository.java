package com.bootcamp.blog.repositories;

import com.bootcamp.blog.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Query("SELECT p FROM Author p WHERE id = :#{#id} ")
    public Author findById(int id);

    public Author save(Author author);

    public void delete(Author author);

}