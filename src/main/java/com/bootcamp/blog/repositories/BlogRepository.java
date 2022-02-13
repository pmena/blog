package com.bootcamp.blog.repositories;

import com.bootcamp.blog.entities.Author;
import com.bootcamp.blog.entities.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    @Query("SELECT p FROM Blog p WHERE usuario = :#{#id} ")
    public Blog findById(int id);

    public Blog save(Blog author);

    public void delete(Blog author);
}
