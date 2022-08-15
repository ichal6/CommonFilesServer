package com.lechowicz.servercommonfiles.model;

import org.springframework.data.annotation.PersistenceCreator;

import java.time.OffsetDateTime;

public record Video(String id, String name, OffsetDateTime createdDate, String ownerId, Long lengthInSeconds, String url) {
    public Video(String name, OffsetDateTime createdDate, String ownerId, Long lengthInSeconds, String url) {
        this(null, name, createdDate, ownerId, lengthInSeconds, url);
    }

    @PersistenceCreator
    public Video(String id, String name, OffsetDateTime createdDate, String ownerId, Long lengthInSeconds, String url) {
        this.id = id;
        this.name = name;
        this.createdDate = createdDate;
        this.ownerId = ownerId;
        this.lengthInSeconds = lengthInSeconds;
        this.url = url;
    }
}
