package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {
	@Test
	
	void test() {
		GreatesSpeed speed = new GreatesSpeed(); 
		assertEquals(10,speed.maxSpeed(1));
		assertEquals(1,speed.maxSpeed(2));
	}

}
