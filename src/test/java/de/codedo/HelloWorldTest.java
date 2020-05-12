package de.codedo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloWorldTest {
	@Test
	void messageTest() {
		assertEquals("Hello World", new HelloWorld().getMessage());
	}
}
