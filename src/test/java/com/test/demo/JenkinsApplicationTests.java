package com.test.demo;

import static org.junit.Assert.assertEquals;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsApplicationTests {

	@SuppressWarnings("null")
	@Test
	public void testAdd() {
		Sum s=null;
		assertEquals(15, s.add(10, 5));
		
	}

}
