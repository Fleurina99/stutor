abstract class Person
{
	private String name;
	private String gender;
	private Address address;
	private String phoneNo;

	public Person(String n, String g, Address a, String PN)
	{
		name = n;
		gender = g;
		address = a;
		phoneNo = PN;
	}
	public String getName()
	{
		return name;
	}
	public String getGender()
	{
		return gender;
	}
	public Address getAddress()
	{
		return address;
	}
	public String getPhoneNo()
	{
		return phoneNo;
	}

	public abstract void display();

}