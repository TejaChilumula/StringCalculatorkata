import static org.junit.jupiter.api.Assertions.*;
import java.lang.*;

import org.junit.jupiter.api.Test;

class StringcalculatorTest {
//Test case for empty string
	@Test
	public void Emptytest() throws Exception {
		assertEquals(0,StringCal.Add(""));
	}
	@Test
	public void OneNumTest() throws Exception{
		assertEquals(1,StringCal.Add("1"));
	}
	@Test
	public void TwoNumTest() throws Exception{
		assertEquals(3,StringCal.Add("1,2"));
	}
	@Test
	public void threeNumTest()  throws Exception{
		assertEquals(6,StringCal.Add("1\n2,3"));
	}
	
	
	@Test
	//(Expected=IllegalArgumentException.class)
	public void NegativeNumTest() throws Exception {
		StringCal calc = new StringCal();
		
		try{
			calc.Add("-1,2");
			
		}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(),"Negative not allowed: -1");
		}
	}
	@Test
	public void GreaterNumTest() throws Exception {
		assertEquals(9,StringCal.greater("1000,2,3,4"));
	}	
}
