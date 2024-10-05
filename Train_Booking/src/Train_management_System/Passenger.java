package Train_management_System;

public class Passenger 
{
	private String name;
	private int age;
	private int mobileNo;
	private int aadharNo;
	
	Ticket t;
	
	public void passenger() {}

	public Passenger(String name, int age, int mobileNo, int aadharNo, Ticket t) 
	{
		this.name = name;
		if (age>=21) 
		{
			this.age=age;
		} else 
		{
			System.out.println("Invalid Age");
		}
		this.mobileNo = mobileNo;
		this.aadharNo = aadharNo;
		this.t = t;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getAadharNo() {
		return aadharNo;
	}


	public Ticket getT() {
		return t;
	}
	
	public void display()
	{
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getMobileNo());
		System.out.println(getAadharNo());
		System.out.println(getT());
	}
	
	@Override
	public String toString() 
	{
		return "\n name=" + name + "\n age=" + age + "\n mobileNo=" + mobileNo + "\n aadharNo=" + aadharNo+ "\n "+ t + "\n ----------------------------------";
	}
	
	
}
