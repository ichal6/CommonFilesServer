package com.lechowicz.servercommonfiles.model;

import java.time.OffsetDateTime;

public record VideoInput(String id, String name, OffsetDateTime createdDate, String ownerId, Long lengthInSeconds, String url) {
}
