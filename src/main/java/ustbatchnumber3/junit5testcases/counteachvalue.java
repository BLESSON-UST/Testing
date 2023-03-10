package ustbatchnumber3.junit5testcases;
/*
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Listfreequency {
	



	public static  void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//String[] m= {"Blesson","Anirudh","Christo","Jenson","Blesson","Christo"};
		ArrayList<String> m =new ArrayList<String>();
		m.add("Blesson");
		m.add("Christo");
		m.add("Anirudh");
		m.add("Jenson");
		m.add("Blesson");
		m.add("Christo");
		m.add("Jenson");
		m.add("Jenson");
		
		m.stream().collect(Collectors.groupingBy(s->s)).forEach((k,v)->System.out.println(k + " "+ v.size()));
		
	}
	
	


	
}
	
*/
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

public class counteachvalue {
public static Map<String,Long>each()  {
		List<String> arr=new ArrayList<String>();
		arr.add("apple");
		arr.add("orange");
		arr.add("grapes");
		arr.add("apple");
		arr.add("grapes");
		Map<String, Long> a=arr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		return a;
		
	}
    public static void main(String args[])
    {
    	System.out.println(each());
    }
}






