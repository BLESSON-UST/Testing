package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.Test;

public class TestGold {
	@Test
	public void test1()
	{
		int expected=5;
		long days;
		LocalDate start=LocalDate.of(2023, 01, 01);
		LocalDate joining=LocalDate.of(2023,02 ,24 );
		days=ChronoUnit.DAYS.between(start,joining);
		int actual=Gold.coin(days);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test2()
	{
		int expected=3;
		long days;
		LocalDate start=LocalDate.of(2023, 01, 01);
		LocalDate joining=LocalDate.of(2023,04 ,24 );
		days=ChronoUnit.DAYS.between(start,joining);
		int actual=Gold.coin(days);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test3()
	{
		int expected=1;
		long days;
		LocalDate start=LocalDate.of(2023, 01, 01);
		LocalDate joining=LocalDate.of(2023,8 ,24 );
		days=ChronoUnit.DAYS.between(start,joining);
		int actual=Gold.coin(days);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test4()
	{
		int expected=0;
		long days;
		LocalDate start=LocalDate.of(2023, 01, 01);
		LocalDate joining=LocalDate.of(2023,12 ,24 );
		days=ChronoUnit.DAYS.between(start,joining);
		int actual=Gold.coin(days);
		assertEquals(expected,actual);
	}

}
