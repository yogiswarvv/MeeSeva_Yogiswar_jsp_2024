package MeeSeva;

import java.util.Scanner;

public class MeeSeva {
	
	public static void main(String[] args) {
		
		//String name, int age, long mobileNumber, String fatherName, String location, char gender
		Customer c=new Customer("Mani",19,1234567890,"Ram","Hyderbad",'M');
		
		Scanner s=new Scanner(System.in);
		
		boolean start=true;
		
		while(start)
		{
			System.out.println("Enter the choice : \n 1.To create Aadhar \n 2.To create Pan Card \n 3.To create Voter ID \n 4.Exit");
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
			{
				AadharNumber.createAadharObject();
			}
			break;
			case 2:
			{
				PanCardNumber.createPanCardObject(c);
			}
			break;
			case 3:
			{
				VoterID.createVoterID(c);
			}
			break;
			case 4:
			{
				System.out.println("Thank you...!");
				start=false;
			}
			break;
			default : System.out.println("Invalid choice you entered");
			}
		}
	}

}
