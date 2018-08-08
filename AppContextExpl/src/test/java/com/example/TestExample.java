package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestExample extends AppContextExplApplicationTests {
	
	private MessageProvider mp = new MessageProvider();

	@Test
	public void testMessage() throws Exception {
		assertThat(true).isTrue();		
	}
	
	@Test
	public void testMessageValue() throws Exception {
		assertEquals("Empty", mp.getMsg());		
	}
}
