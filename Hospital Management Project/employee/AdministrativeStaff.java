package employee;
import java.lang.*;

public class AdministrativeStaff 
{
	private String A_id;
	private String A_name;
	private char A_gender;
    private double A_salary;
	
	public AdministrativeStaff ()
	{
	}
	public AdministrativeStaff (String name,String id)
	{   
	    this.A_name=name;
		this.A_id=id;
	}
    public void AdministrativeStaff (String name,String id, char gender, double salary)
	{   
	    this.A_name=name;
		this.A_id=id;
		this.A_gender=gender;
		this.A_salary=salary;
	}
    	
	   
	public void setName( String name)
    {   
    this.A_name=name;
    }
    public void setId(String id)
    {  
    this.A_id=id;
    }
	public void setGender(char gender)
    {
    this.A_gender=gender;
    }
	public void setSalary(double salary)
    {  
    this.A_salary=salary;
    }
	
	public String getName()
    {
    return A_name;
    }	 
    public String getId()
    {
	return A_id;
    }
    public char getGender()
    {
	return A_gender;
    }
    public double getSalary()
    {
	return A_salary;
    } 
}