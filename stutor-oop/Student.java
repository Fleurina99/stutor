public class Student extends Person implements Payment
{
	private String level;
	private int numsubject;
	private Tutor tutor;
	private double total;
	private Subjects[] subj;


	Student(String n, String g, Address a, String PN, String l)
	{
		super(n, g, a, PN);
		level = l;
		subj = new Subjects[10];
		numsubject = 0;
	}

	public String getLevel()
	{	return level;	}

	public void tutorBy(Tutor t)
	{	tutor = t;	}

	public Tutor getTutor()
	{	return tutor;	}

	public int getNoSubject()
	{	return numsubject;	}

	public void getSubject(Subjects[] s, int x)
	{
		for(int i=0; i<x; i++)
		{
			subj[i]=s[i];
		}

		numsubject = x;
	}

	public void setSubject(Subjects s)
	{
		subj[numsubject] = s;
		numsubject++;
	}




	public double getTotal()
	{
		if(level == "PT3")
			total = PT3 * numsubject;
		else
			total = SPM * numsubject;

		return total;
	}

	public void display()
	{
		System.out.println(getName() + "\t" + getGender() +	"\t" + getAddress().getAddress() +
		"\t" + getPhoneNo() +
		"\t" + level);
		System.out.println("\n\n");
	}

	public void print()
	{
		System.out.println("\n===========================");
		System.out.println("Students's name: " + getName());
		System.out.println("Tutor's name: " + tutor.getName());
		System.out.println("Level: " + level);
		System.out.println("Total subject(s): " + tutor.getNumSubj());
		System.out.println("Total payment: RM" + getTotal());
	}
}


interface Payment
{
	double PT3 = 30;
	double SPM = 40;
}
