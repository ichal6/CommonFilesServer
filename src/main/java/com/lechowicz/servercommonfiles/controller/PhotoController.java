package com.lechowicz.servercommonfiles.controller;

import com.lechowicz.servercommonfiles.model.Author;
import com.lechowicz.servercommonfiles.model.Photo;
import com.lechowicz.servercommonfiles.repository.AuthorRepository;
import com.lechowicz.servercommonfiles.repository.PhotoRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PhotoController {
    private AuthorRepository authorRepository;
    private PhotoRepository photoRepository;


    public PhotoController(){
        this.authorRepository = new AuthorRepository();
        this.photoRepository = new PhotoRepository();
    }

    @QueryMapping
    public Photo photoById(@Argument String id) {
        return photoRepository.getPhotoById(id);
    }

    @SchemaMapping
    public Author owner(Photo photo) {
        return authorRepository.getAuthorById(photo.ownerId());
    }

}
