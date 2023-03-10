package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class testevenorodd {
	@Test
	
	public void testeven()
	{
		int n=12;
		boolean result =Iseven(n);
		assertTrue(result);
	}
	
	@Test
	public void testodd()
	{
		int n=11;
		boolean result =Iseven(n);
		assertFalse(result);
	}
	public boolean Iseven(int n)
	{
		return n%2==0;
	}

}