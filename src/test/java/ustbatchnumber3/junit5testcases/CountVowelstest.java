package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import count.CountVowels;

/**
 * @author Administrator
 *
 */
public class CountVowelstest {
	
	@Test
	public void counttesting() {
		
		String input ="sharath";
		
		int expected=2;
		int actual=CountVowels.vowelscount(input);
		assertEquals(expected,actual);
		
	}
	
	
	

}