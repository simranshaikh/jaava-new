package day1;

public class student {
	private int rollno;
	private String name;

	//default constructor
	public student()
	{
		System.out.println("in student default constructor");

	}

	public student(int roll,String nm)
	{
		rollno=roll;
		name=nm;
	}
	int getRollno()
	{
		return rollno;
	}
	String getname()
	{
		return name;
	}

	public void stud(){
		System.out.println("rollno"+rollno+ "name"+name+"");
	}

}
