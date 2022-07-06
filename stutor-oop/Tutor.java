public class Tutor extends Person
{
	private Subjects[] subTeach;
	private int numSubj;

	public Tutor(String n, String g, Address a, String PN)
	{
		super(n,g,a,PN);
		subTeach = new Subjects[10];
	}

    public String toString()
    {	return String.format("%s", getName());	}

    public void setSubjTeach(Subjects s)
    {
		subTeach[numSubj] = s;
		numSubj++;
	}

	public int getNumSubj()
	{	return numSubj;	}

	public void assignSubject(Student st)
	{
		st.getSubject(subTeach, numSubj);
	}



	public void display()
	{
		System.out.println("Name: " + getName());
		System.out.println("Gender: " + getGender());
		System.out.println("Phone No: " + getPhoneNo());
		System.out.println("Address: " + getAddress().getAddress());
		System.out.println("Subject(s) teach: ");
		for(int i=0; i<numSubj; i++)
			System.out.println((i+1) + ". " + subTeach[i].getName());
	}
}
