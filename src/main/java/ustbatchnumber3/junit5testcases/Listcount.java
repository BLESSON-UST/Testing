package ustbatchnumber3.junit5testcases;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class Listcount {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		List<String> m= Arrays.asList("Blesson","Anirudh","Christo","Jenson","Blesson","Christo");
		System.out.println("Enter the String");
		String s=sc.next();
		long c=count(m,s);
		System.out.println(c);
		
		
	}

	public static long count(List<String> n,String s) {
		// TODO Auto-generated method stub
	
//		List<String> m= Arrays.asList("Blesson","Anirudh","Christo","Jenson","Blesson","Christo");

		long c=n.stream().filter(p->p.contains(s)).count();

		return c;
		
		
	}	
}
