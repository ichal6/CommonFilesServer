package com.lechowicz.servercommonfiles.repository;

import com.lechowicz.servercommonfiles.model.Author;

import java.util.Arrays;
import java.util.List;

public class AuthorRepository {
    private List<Author> authors;

    public AuthorRepository(){
        this.authors = Arrays.asList(
                new Author("author-1", "Joanne", "Rowling"),
                new Author("author-2", "Herman", "Melville"),
                new Author("author-3", "Anne", "Rice")
        );
    }

    public Author getAuthorById(String id){
            return authors.stream().filter(author -> author.id().equals(id)).findFirst().orElse(null);
    }
}
