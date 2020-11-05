import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringcalculatorTest {
//Test case for empty string
	@Test
	public void Emptytest() {
		assertEquals(0,StringCal.Add(""));
	}
}
