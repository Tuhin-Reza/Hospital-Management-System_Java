package employee;
import java.lang.*;

public class Nurse 
{
	private String N_id;
	private String N_name;
	private char N_gender;
    private double N_salary;
	
	public Nurse()
	{
	}
	public Nurse(String name,String id)
	{   
	    this.N_name=name;
		this.N_id=id;
	}
    public void Nurse(String name,String id, char gender, double salary)
	{   
	    this.N_name=name;
		this.N_id=id;
		this.N_gender=gender;
		this.N_salary=salary;
	}
    	
	   
	public void setName( String name)
    {   
    this.N_name=name;
    }
    public void setId(String id)
    {  
    this.N_id=id;
    }
	public void setGender(char gender)
    {
    this.N_gender=gender;
    }
	public void setSalary(double salary)
    {  
    this.N_salary=salary;
    }
	
	public String getName()
    {
    return N_name;
    }	 
    public String getId()
    {
	return N_id;
    }
    public char getGender()
    {
	return N_gender;
    }
    public double getSalary()
    {
	return N_salary;
    } 
	
}