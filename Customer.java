package MeeSeva;

public class Customer {
	
	private String name;
	private int age;
	private long MobileNumber;
	private String fatherName;
	private String location;
	private char gender;
	
	public Customer() {}

	public Customer(String name, int age, long mobileNumber, String fatherName, String location, char gender) {
		this.name = name;
		this.age = age;
		this.MobileNumber = mobileNumber;
		this.fatherName = fatherName;
		this.location = location;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void display()
	{
		System.out.println("Name : "+getName());
		System.out.println("Age : "+getAge());
		System.out.println("Mobile number : "+getMobileNumber());
		System.out.println("Father Name : "+getFatherName());
		System.out.println("Location : "+getLocation());
		System.out.println("Gender  : "+getGender());
	} 
	

}
