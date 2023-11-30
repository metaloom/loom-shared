package io.metaloom.loom.rest.model.json;

import java.time.Instant;

import org.junit.jupiter.api.Test;

import io.metaloom.loom.rest.json.Json;
import io.metaloom.loom.test.data.TestValues;

public class DateTest implements TestValues {

	@Test
	public void testDate() {
		DatePojo pojo = new DatePojo();
		Instant date = Instant.parse("2023-04-20T20:12:01Z");
		pojo.setEdited(date);
		String json = Json.parse(pojo);
		System.out.println(json);
		
		DatePojo fromJson = Json.parse(json, DatePojo.class);
	}
}
