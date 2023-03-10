package ustbatchnumber3.junit5testcases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Textile {
	public List<String> details(LocalDate date) 
	{
		List<String> d1= new ArrayList<String>();
		d1.add("Shirt");
		d1.add("10");
		d1.add("8000");
		
		List<String> d2= new ArrayList<String>();
		d2.add("T-Shirt");
		d2.add("15");
		d2.add("9000");
		
		List<String> d3= new ArrayList<String>();
		d3.add("Jeans");
		d3.add("8");
		d3.add("16000");
		
		Map<LocalDate,List<String>> m= new HashMap<LocalDate,List<String>>();
		m.put(LocalDate.of(2023, 1, 4), d1);
		m.put(LocalDate.of(2023,1,5), d2);
		m.put(LocalDate.of(2023, 1, 6), d3);
		
		for ( Map.Entry<LocalDate,List<String>> entry : m.entrySet()) {			
		    if (entry.getKey().equals (date))
		    {
		    	 return(entry.getValue());
				
		    }
		    
		
		
		
		}
		return null;
	}}

