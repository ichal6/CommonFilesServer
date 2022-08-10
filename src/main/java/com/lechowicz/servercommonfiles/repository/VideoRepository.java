package com.lechowicz.servercommonfiles.repository;

import com.lechowicz.servercommonfiles.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {

}
