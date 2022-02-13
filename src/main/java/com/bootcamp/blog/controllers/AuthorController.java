package com.bootcamp.blog.controllers;

import com.bootcamp.blog.entities.Author;
import com.bootcamp.blog.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author/")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/{id}")
    public Author findById(@PathVariable("id") int id){
        return this.authorService.findById(id);
    }

    @PostMapping("/save")
    public void save(
            @RequestBody Author author
    ){
        this.authorService.save(author);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id){
        Author objeto = new Author();
        objeto.setId(id);
        this.authorService.delete(objeto);
    }
}
