import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringcalculatorTest {
//Test case for empty string
	@Test
	public void Emptytest() {
		assertEquals(0,StringCal.Add(""));
	}
	@Test
	public void OneNumTest() {
		assertEquals(1,StringCal.Add("1"));
	}
	@Test
	public void TwoNumTest() {
		assertEquals(3,StringCal.Add("1,2"));
	}
	@Test
	public void threeNumTest() {
		assertEquals(6,StringCal.Add("1\n2,3"));
	}
	
}
