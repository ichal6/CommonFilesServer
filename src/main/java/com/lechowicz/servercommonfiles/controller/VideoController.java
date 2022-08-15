package com.lechowicz.servercommonfiles.controller;

import com.lechowicz.servercommonfiles.model.Author;
import com.lechowicz.servercommonfiles.model.Photo;
import com.lechowicz.servercommonfiles.model.Video;
import com.lechowicz.servercommonfiles.model.VideoInput;
import com.lechowicz.servercommonfiles.repository.AuthorRepository;
import com.lechowicz.servercommonfiles.service.VideoService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VideoController {
    private final VideoService videoService;
    private final AuthorRepository authorRepository;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
        this.authorRepository = new AuthorRepository();
    }

    @QueryMapping
    public List<Video> getAllVideo(){
        return videoService.getAllVideo();
    }

    @QueryMapping
    public Video videoById(@Argument String id){
        if(this.videoService.getVideoById(id).isPresent()){
            return this.videoService.getVideoById(id).get();
        } else{
            return null;
        }
    }

    @MutationMapping
    Video addVideo(@Argument("input") VideoInput video){
        return this.videoService.addVideo(video);
    }

    @SchemaMapping
    public Author owner(Video video) {
        return authorRepository.getAuthorById(video.ownerId());
    }
}
