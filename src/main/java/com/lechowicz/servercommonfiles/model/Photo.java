package com.lechowicz.servercommonfiles.model;

import java.time.Instant;

public record Photo(String id, String name, Instant date, String ownerId) {
}
