package com.demowebshop.generic_utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

public class JavaUtility {
	//Timestamp
	public String getTimeStamp() {
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
		return LocalDateTime.now().format(formatter);
	}
	//Random Numbers
	public int getRandomNumber(int boundary) {
		Random random=new Random();
		return random.nextInt(boundary);
	}
	//Unique value
	public String getUniqueValue() {
		return UUID.randomUUID().toString();
	}

}
