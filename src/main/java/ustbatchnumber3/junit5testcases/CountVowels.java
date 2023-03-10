package ustbatchnumber3.junit5testcases;

public class CountVowels {
public static int vowelscount(String input) {
	int vowelscount=0;
	 
	 for (int i =0; i<input.length();i++) {
		 
		  char c= Character.toLowerCase(input.charAt(i));
		  if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			  vowelscount++;
		  }
	 }
		
		return vowelscount;
	}

	public static void main(String[] args) {
	 String input ="sharath";
	 int count = vowelscount(input);
	 
      System.out.println("the number of vowles in \""+input+"\"is:"+count);
	}
}

