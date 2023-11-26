package employee;
import java.lang.*;

public class TechnicalStaff 
{
	private String T_id;
	private String T_name;
    private char T_gender;
    private double T_salary;
	
	public TechnicalStaff ()
	{
	}
	public TechnicalStaff(String name,String id)
	{   
	    this.T_name=name;
		this.T_id=id;
	}
    public void TechnicalStaff(String name,String id, char gender, double salary)
	{   
	    this.T_name=name;
		this.T_id=id;
		this.T_gender=gender;
		this.T_salary=salary;
	}
    	
	   
	public void setName( String name)
    {   
    this.T_name=name;
    }
    public void setId(String id)
    {  
    this.T_id=id;
    }
	public void setGender(char gender)
    {
    this.T_gender=gender;
    }
	public void setSalary(double salary)
    {  
    this.T_salary=salary;
    }
	
	public String getName()
    {
    return T_name;
    }	 
    public String getId()
    {
	return T_id;
    }
    public char getGender()
    {
	return T_gender;
    }
    public double getSalary()
    {
	return T_salary;
    } 
	
}