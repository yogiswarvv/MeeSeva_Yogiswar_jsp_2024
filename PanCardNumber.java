package MeeSeva;

import java.util.Random;

public class PanCardNumber 
{
	private static PanCardNumber p=null;
	
	private int panNo;
	
	Random r=new Random();
	
	private PanCardNumber()
	{
		this.panNo=r.nextInt(123456);
		System.out.println("PanCard Number : "+panNo);
	}
	
	
	public static PanCardNumber createPanCardObject(Customer c)
	{
		if(c.getFatherName().equalsIgnoreCase("Ram"))
		{
			if(p==null)
			{
				p=new PanCardNumber();
				System.out.println("Pan card number created");
			}
			else
			{
				System.out.println("pan card is already existed");
			}
		}
		else
		{
			System.out.println("Father name misMatch");
		}
		return p;
		
	}
}
