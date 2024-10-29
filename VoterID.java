package MeeSeva;

import java.util.Random;

public class VoterID {
	
	private static VoterID v=null;
	
	private int num;
	
	Random r=new Random();
	
	private VoterID()
	{
		this.num=r.nextInt(12345);
		System.out.println("Voter ID : "+num);
	}
	
	
	public static VoterID createVoterID(Customer c)
	{
		if(c.getAge()>=18)
		{
			if(v==null)
			{
				v=new VoterID();
				System.out.println("Voter id is created");
			}
			else
			{
				System.out.println("Voter id is already existed");
			}
		}
		else
		{
			System.out.println("Not eligible for voting age must above or equal to 18");
		}
		return v;
	}
	
	
	
	

}
