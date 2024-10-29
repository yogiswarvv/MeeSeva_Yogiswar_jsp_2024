package MeeSeva;

import java.util.Random;

public class AadharNumber {
	
	private static AadharNumber a=null;
	private long number;
	
	Random r=new Random();
	
	private AadharNumber() {
		
		this.number=r.nextLong();
		System.out.println("Aadhaar Number : "+number);
	}
	
	
	public static AadharNumber createAadharObject()
	{
		if(a==null)
		{
			a=new AadharNumber();
			System.out.println("Aadhar number created");
		}
		else
		{
			System.out.println("Aadhar number is already existed");
		}
		return a;
	}

}
