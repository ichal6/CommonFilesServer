package com.lechowicz.servercommonfiles;

import com.lechowicz.servercommonfiles.model.Video;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;


import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ServerCommonFilesApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void givenSavedVideoTimeIsRetrievedCorrectly(@Autowired MongoTemplate videoRepository) {
		String id = "testId";
		OffsetDateTime date = OffsetDateTime.of(2022, 8, 15, 18, 38, 59, 49, ZoneOffset.UTC);

		videoRepository.save(new Video("video-99", "My Video", date, "author-1", 120L, "C:/"));
		List<Video> videosList = videoRepository.findAll(Video.class);

		System.out.println(videosList.get(0));
		assertEquals(1, videosList.size());
		Video video = videosList.get(0);
		assertEquals("2022-08-15T18:38:59Z", video.createdDate().toString());
	}

}
