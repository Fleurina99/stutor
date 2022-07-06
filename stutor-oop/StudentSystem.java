import java.util.*;
import java.util.Scanner;

public class StudentSystem
{
	public static void displayMenu()
	{
		System.out.println("\n\nStudent Record System");
		System.out.println("================================");
		System.out.println("Choose");
		System.out.println("1. List of Students");
		System.out.println("2. List of Tutors");
		System.out.println("3. List of Subjects");
		System.out.println("4. Display Payment");
		System.out.println("5. Add Student");
		System.out.println("6. Exit");
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Vector<Student> sList = new Vector<Student>();

		Address address1 = new Address("Jalan Pahlawan", "Skudai", 81300, "Johor");
		Address address2 = new Address("Jalan Flora", "Skudai", 81300, "Johor");
		Address address3 = new Address("Jalan Bakti", "Skudai", 81300, "Johor");

		Student[] stud = new Student[4];
		stud[0] = new Student("Muhammad", "Male", address1, "01234323", "PT3");
		stud[1] = new Student("Nurul Aina", "Female", address2, "01234323", "PT3");
		stud[2] = new Student("Amirul Mukmin", "Male", address3, "01234323", "PT3");
		stud[3] = new Student("Aina aini", "Female", address2, "01256574", "SPM");

		Tutor tut1 = new Tutor("Aliah Ali", "Female", address1, "01234323");
		Tutor tut2 = new Tutor("Nabil Haidar", "Male", address2, "01234323");

		Subjects subj1 = new Subjects("Mathematics", 3);
		Subjects subj2 = new Subjects("Science   ", 2);
		Subjects subj3 = new Subjects("Add Maths", 3);
		Subjects subj4 = new Subjects("Chemistry", 2);

		stud[0].tutorBy(tut1);
		stud[1].tutorBy(tut2);
		stud[2].tutorBy(tut2);
		stud[3].tutorBy(tut1);

		stud[0].setSubject(subj1);
		stud[1].setSubject(subj1);
		stud[1].setSubject(subj2);
		stud[2].setSubject(subj1);
		stud[3].setSubject(subj3);
		stud[3].setSubject(subj4);

		tut1.setSubjTeach(subj3);
		tut1.setSubjTeach(subj4);
		tut2.setSubjTeach(subj1);
		tut2.setSubjTeach(subj2);

		sList.addElement(stud[0]);
		sList.addElement(stud[1]);
		sList.addElement(stud[2]);
		sList.addElement(stud[3]);

		Vector<Tutor> tList = new Vector<Tutor>();
		tList.add(tut1);
		tList.add(tut2);

		int choice;
		try
		{
			do
			{
					displayMenu();
					System.out.print("\nEnter your choice(1/2/3/4/5): ");
					choice = input.nextInt();
					input.nextLine();

					switch (choice)
					{
						case 1:
							System.out.println("\nList of students:");
							System.out.println("======================");
							System.out.println("Name\t\tGender\tAddress\t\t\t\t\tPhoneNo\t\tLevel" );
							System.out.println("----\t\t------\t-------\t\t\t\t\t-------\t\t------" );

							for(int i=0; i<sList.size(); i++){
								Student student = (Student) sList.elementAt(i);
								student.display();}

							break;

						case 2:
							System.out.println("\nTutor's information: ");
							System.out.println("============================");
							tut1.display();
							System.out.println("--------------------------------------------");
							tut2.display();

							break;

						case 3:
							System.out.println("\nList of subjects:");
							System.out.println("======================");
							System.out.println("Name\t\tHour" );
							System.out.println("----------------------------" );
							subj1.displaySubject();
							subj2.displaySubject();
							subj3.displaySubject();
							subj4.displaySubject();

							break;
						case 4:
							/*System.out.println("\nDisplay Payment:");
							for(int i=0; i<stud.length; i++)
								stud[i].print();*/

							for(int i=0; i<sList.size(); i++)
							{
								sList.get(i).print();
							}


							break;

						case 5:
							System.out.print("Students's name: ");
							String name = input.nextLine();


							System.out.print("Gender: ");
							String gen = input.nextLine();

							System.out.print("Street: ");
							String street= input.nextLine();
							//input.nextLine();

							System.out.print("City: ");
							String city = input.nextLine();
							//input.nextLine();

							System.out.print("Postcode: ");
							int postcode= input.nextInt();
							input.nextLine();

							System.out.print("State: ");
							String state = input.nextLine();
							//input.nextLine();

							System.out.print("Phone Number: ");
							String num = input.nextLine();

							System.out.print("Level: ");
							String le = input.nextLine();

							Address address = new Address(street, city, postcode, state);
							sList.addElement(new Student(name,gen,address , num, le));

							System.out.println("\n\nPlease choose your tutor ");
							System.out.println("===============================");

							for(int i=0; i<tList.size(); i++)
							{
								System.out.println("Tutor No." + (i+1));
								System.out.println("===================");
								tList.get(i).display();

								System.out.println("\n");


							}

							int indexA =0;
							for(int i=0; i<sList.size(); i++)
							{
								if(name.equals(sList.get(i).getName()))
								{
									indexA = i;
								}

							}


							int lec = 0;
							System.out.print("Enter your choice: ");
							lec = input.nextInt();
							lec--;

							sList.get(indexA).tutorBy(tList.get(lec));

							tList.get(lec).assignSubject(sList.get(indexA));







							break;
					}

			}while(choice != 6);
			System.out.println("You have exited from the system. :)");
		}

	 	catch (InputMismatchException ex)
	    {	System.out.println("Invalid Choice");	}



	}
}