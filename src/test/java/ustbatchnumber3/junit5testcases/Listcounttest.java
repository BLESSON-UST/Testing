package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Listcounttest {
	@Test
	public void counttest()
	{
		List<String> n= Arrays.asList("Blesson","Anirudh","Christo","Jenson","Blesson","Christo");
		String input ="Blesson";
		long expected=2;
		long actual=Listcount.count(n,input);
		assertEquals(expected,actual);
	}
	@Test
	public void counttest2()
	{
		List<String> n= Arrays.asList("Blesson","Anirudh","Christo","Jenson","Blesson","Christo");
		String input ="Jenson";
		long expected=1;
		long actual=Listcount.count(n,input);
		assertEquals(expected,actual);
	}

}
