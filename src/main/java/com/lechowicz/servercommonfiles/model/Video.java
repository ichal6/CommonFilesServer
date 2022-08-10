package com.lechowicz.servercommonfiles.model;

import java.util.Date;

public record Video(String id, String name, Date createdDate, String ownerId, long lengthInSeconds, String url) {
    public Video(String name, Date createdDate, String ownerId, long lengthInSeconds, String url) {
        this(null, name, createdDate, ownerId, lengthInSeconds, url);
    }
}
