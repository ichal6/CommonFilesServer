package com.lechowicz.servercommonfiles.model;

import java.time.OffsetDateTime;

public record Photo(String id, String name, OffsetDateTime createdDate, String ownerId) {
}
