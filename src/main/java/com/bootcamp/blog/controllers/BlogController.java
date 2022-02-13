package com.bootcamp.blog.controllers;

import com.bootcamp.blog.entities.Author;
import com.bootcamp.blog.entities.Blog;
import com.bootcamp.blog.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/{id}")
    public Blog findById(@PathVariable("id") int id){
        return this.blogService.findById(id);
    }

    @PostMapping("/save")
    public void save(
            @RequestBody Blog blog
    ){
        this.blogService.save(blog);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id){
        Blog objeto = new Blog();
        objeto.setId(id);
        this.blogService.delete(objeto);
    }

}
