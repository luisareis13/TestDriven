package testDriven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrancTest {

	@Test
	public void testFrancMultiplication() {
		   Franc five = new Franc(5,"CHF");
		   assertEquals(new Franc(10,"CHF"), five.times(2));
		   assertEquals(new Franc(15,"CHF"), five.times(3));
		}

}
