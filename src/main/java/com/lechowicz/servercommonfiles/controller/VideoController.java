package com.lechowicz.servercommonfiles.controller;

import com.lechowicz.servercommonfiles.model.Video;
import com.lechowicz.servercommonfiles.service.VideoService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;

@Controller
public class VideoController {
    private final VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
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
}
