class Subjects
{
	private String name;
	private int hour;

	Subjects(String n, int h)
	{
		name = n;
		hour = h;
	}

	public String getName()
	{	return name;	}

	public int getHour()
	{	return hour;	}

	public void displaySubject()
	{
		System.out.println(name + "\t" + hour);

	}

}

