package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.TricketSeller;

class JunitTest {

	@Test
	void test() {
		TricketSeller ts = new TricketSeller();
		assertEquals(ts.BuyTicket(10), 90);
	}

}
