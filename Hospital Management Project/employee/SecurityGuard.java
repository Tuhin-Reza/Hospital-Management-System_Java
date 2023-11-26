package employee;
import java.lang.*;

public class SecurityGuard 
{
	private String G_id;
	private String G_name;
	private char G_gender;
    private double G_salary;
	
	public SecurityGuard  ()
	{
	}
	public SecurityGuard (String name,String id)
	{   
	    this.G_name=name;
		this.G_id=id;
	}
    public void SecurityGuard(String name,String id, char gender, double salary)
	{   
	    this.G_name=name;
		this.G_id=id;
		this.G_gender=gender;
		this.G_salary=salary;
	}
    	
	   
	public void setName( String name)
    {   
    this.G_name=name;
    }
    public void setId(String id)
    {  
    this.G_id=id;
    }
	public void setGender(char gender)
    {
    this.G_gender=gender;
    }
	public void setSalary(double salary)
    {  
    this.G_salary=salary;
    }
	
	public String getName()
    {
    return G_name;
    }	 
    public String getId()
    {
	return G_id;
    }
    public char getGender()
    {
	return G_gender;
    }
    public double getSalary()
    {
	return G_salary;
    } 
	
	
}