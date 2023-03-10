package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestVehiclenum {
	@SuppressWarnings("deprecation")
	@Test
	public void test1()
	{
		
		Vehiclenum v1=new Vehiclenum();
		List<String> v2= Arrays.asList("KL 05 AX 0690" );
		String[] res= {"Kerala","Kottayam"};
		assertEquals(res,v1.data(v2));
		
	}
	@Test
	public void test2()
	{
		
		Vehiclenum v1=new Vehiclenum();
		List<String> v2= Arrays.asList("TN 07 VG 5678");
		String[] res= {"Tamilnadu","Selam"};
		assertEquals(res,v1.data(v2));
		
	}
	@Test
	public void test()
	{
		
		Vehiclenum v1=new Vehiclenum();
		List<String> v2= Arrays.asList("KL 07 VG 5678");
		String[] res= {"Kerala","Eranakulam"};
		assertEquals(res,v1.data(v2));
		

	}
}
