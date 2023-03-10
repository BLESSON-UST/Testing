package ustbatchnumber3.junit5testcases;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Vehiclenum 
{
	public String[]  data(List<String> s)
	{
//	
//	System.out.println(m);
//	if(Stasrtswith)
//	Map<String,String> st=new HashMap<String,String>();
//	st.put("KL","Kerala");
//	st.put("TN","Tamilnadu");
//	st.put("TS", "Telungana");
		Map<String,String> kldis=new HashMap<String,String>();
		kldis.put("05", "Kottayam");
		kldis.put("07", "Eranakulam");
		kldis.put("06", "Thrissur");
		
		Map<String,String> tndis=new HashMap<String,String>();
		tndis.put("05", "coiambathoor");
		tndis.put("07", "selam");
		tndis.put("06", "palani");
		
		Map<String,String> tsdis=new HashMap<String,String>();
		tsdis.put("31", "nagarkarnol");
		tsdis.put("32", "wanparthi");
		tsdis.put("33", "vikarabadh");
		

		
		Stream<String> n= s.stream().map(p->p.toUpperCase()).filter(t->t.startsWith("KL"));
		List<String> m=n.collect(Collectors.toList());

		Stream<String> q=s.stream().map(p->p.toUpperCase()).filter(t->t.startsWith("TN"));
		List<String> x=q.collect(Collectors.toList());

		Stream<String> y= s.stream().map(p->p.toUpperCase()).filter(t->t.startsWith("TS"));
		List<String> z=y.collect(Collectors.toList());

		
		String s1=m.toString();
//		System.out.println(s1);
		String s2=x.toString();
//		System.out.println(s2);
		String s3=z.toString();
//		System.out.println(s3);
		if(s1.contains("KL") )
		{
			String[] kl=s1.split("\\s");
			String[] result= {"Kerala",kldis.get(kl[1])};
			return result;
	}
		
		else if(s2.contains("TN")  )
		{
			String[] k2=s1.split("\\s");
			String[] result1= {"Tamilnadu",tndis.get(k2[1])};
			return result1;
		}
		
		if(s3.contains("TS") )
		{
			String[] k3=s1.split("\\s");
			String[] result2= {"Telungana",tsdis.get(k3[1])};
			return result2;
		}
		
//		

//		String[] kl=s1.split("\\s");
//		String[] result= {"Kerala",kldis.get(kl[1])};
//		return result;
			return null;
	
	}
	
	
	

}
