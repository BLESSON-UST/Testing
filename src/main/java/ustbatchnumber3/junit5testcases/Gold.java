package ustbatchnumber3.junit5testcases;

public class Gold {
	
	public static int coin(long days)
	{
		int coin=0;
		if(days<=80)
		{
			coin=5;
		}
		else if(days>80 && days<=172)
		{
			coin=3;
		}
		else if(days>172 && days<=266)
		{
			coin=1;
		}
		else if(days>172 && days<=365)
		{
			coin=0;
		}
		return coin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
