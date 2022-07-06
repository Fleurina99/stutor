class Address
{
	private String street, city, state;
	private int postcode;

	Address(String s, String c, int p, String sta)
	{
		street = s;
		city = c;
		postcode = p;
		state = sta;
	}

	public String getAddress()
	{	return street + ", " + postcode + " " + city + ", " + state;	}
}