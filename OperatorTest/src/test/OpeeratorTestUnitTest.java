package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.OperatorTestClass;

class OperatorTestUnitTest {
	
	OperatorTestClass operatorTest = new OperatorTestClass();

	@Test
	void operatorTestUnitTest() {
		
		assertEquals(5,operatorTest.addition(2,3),"");
		assertEquals(-1,operatorTest.subtruction(2,3),"");
		assertEquals(6,operatorTest.multiplication(2,3),"");
		assertEquals(0,operatorTest.division(2,3),"");
		assertEquals(2,operatorTest.modulus(2,3),"");
		
		assertEquals(2,operatorTest.BitAnd(2,3),"");
		assertEquals(3,operatorTest.BitOr(2,3),"");
		//assertEquals(,operatorTest.BitNot(42),"");
		
		assertEquals(32,operatorTest.LeftShift(8),"");
		assertEquals(8,operatorTest.RightShift(32),"");
		
		
		//fail("Not yet implemented");
	}

}
