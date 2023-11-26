package employee;
import java.lang.*;
public class Cleaner 
{
	private String C_id;
	private String C_name;
	private char C_gender;
    private double C_salary;
	
	public Cleaner  ()
	{
	}
	public Cleaner  (String name,String id)
	{   
	    this.C_name=name;
		this.C_id=id;
	}
    public void Cleaner (String name,String id, char gender, double salary)
	{   
	    this.C_name=name;
		this.C_id=id;
		this.C_gender=gender;
		this.C_salary=salary;
	}
    	
	   
	public void setName( String name)
    {   
    this.C_name=name;
    }
    public void setId(String id)
    {  
    this.C_id=id;
    }
	public void setGender(char gender)
    {
    this.C_gender=gender;
    }
	public void setSalary(double salary)
    {  
    this.C_salary=salary;
    }
	
	public String getName()
    {
    return C_name;
    }	 
    public String getId()
    {
	return C_id;
    }
    public char getGender()
    {
	return C_gender;
	}
    public double getSalary()
    {
	return C_salary;
    } 
}