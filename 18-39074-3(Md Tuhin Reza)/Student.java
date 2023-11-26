public class Student
{
	public String name;
	public String id;
	public double cgpa;
	public String department;
	
	public Student()
	{
	this.name="Null";
	this.id="Null";
	this.cgpa=0.0;
	this.department="Null";
	}

	public Student(String n, String id, double cgpa,  String dept)
	{
	this.name=n;
	this.id=id;
	this.cgpa=cgpa;
	this.department=dept;
	}

}
