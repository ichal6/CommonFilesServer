package com.lechowicz.servercommonfiles.repository;

import com.lechowicz.servercommonfiles.model.Photo;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

public class PhotoRepository {
    private List<Photo> examplePhotos;

    public PhotoRepository(){
        this.examplePhotos = Arrays.asList(
                new Photo("photo-1", "Harry Potter and the Philosopher's Stone", OffsetDateTime.now(), "author-1"),
                new Photo("photo-2", "Moby Dick", OffsetDateTime.now(), "author-2"),
                new Photo("photo-3", "Interview with the vampire", OffsetDateTime.now(), "author-3")
        );
    }

    public Photo getPhotoById(String id){
        return examplePhotos.stream().filter(photo -> photo.id().equals(id)).findFirst().orElse(null);
    }

}
