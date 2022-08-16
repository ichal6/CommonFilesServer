package com.lechowicz.servercommonfiles.service;

import com.lechowicz.servercommonfiles.model.Video;
import com.lechowicz.servercommonfiles.model.VideoInput;
import com.lechowicz.servercommonfiles.repository.VideoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideoService {
    private final VideoRepository videoRepository;

    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public List<Video> getAllVideo(){
        return videoRepository.findAll();
    }

    public Optional<Video> getVideoById(String id){
        return videoRepository.findById(id);
    }

    public void addVideo(Video newVideo){
        videoRepository.insert(newVideo);
    }

    public Video addVideo(VideoInput inputVideo){
        Video newVideo = new Video(inputVideo.name(), inputVideo.createdDate(), inputVideo.ownerId(), inputVideo.lengthInSeconds(), inputVideo.url());
        return videoRepository.insert(newVideo);
    }
}
