package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Testtextile {

	@Test
	public void test1()
	{
		Textile t=new Textile();

		List<String> d1= new ArrayList<String>();
		d1.add("Shirt");
		d1.add("10");
		d1.add("8000");
		assertEquals(d1,t.details(LocalDate.of(2023,1, 4)));
	}
	
	
	
}
