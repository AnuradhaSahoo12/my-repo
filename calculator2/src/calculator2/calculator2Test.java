package calculator2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculator2Test {

	@Test
	public void calTest() {
		assertEquals(30, calculator2.add(10, 20));
	}

	@Test
	public void calTestSub() {
		assertEquals(30, calculator2.sub(50, 20));
	}

	@Test
	public void calcTestMul() {
		assertEquals(30, calculator2.mul(6, 5));
	}

	@Test
	public void calcTestDiv() {
		assertEquals(6, calculator2.div(30, 5));
	}

}
