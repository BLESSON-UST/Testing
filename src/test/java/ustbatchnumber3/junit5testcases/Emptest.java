package ustbatchnumber3.junit5testcases;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Emptest {
	@Test
	public void test1()
	{
		Emp find=new Emp();
		assertEquals("*****",find.gc(LocalDate.of(2022,2,24)));
		
	}

}
