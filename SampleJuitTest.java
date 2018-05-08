package com.alacriti.demo.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleJuitTest {

	@Test
	public void test() {
		Sample s = new Sample();
		assertEquals(500, s.multiply(50));
	}

}
