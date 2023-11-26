package employee;
import java.lang.*;
public class ReceiptionistStaff 
{
	private String R_id;
	private String R_name;
	private char R_gender;
    private double R_salary;
	
	public ReceiptionistStaff ()
	{
	}
	public ReceiptionistStaff(String name,String id)
	{   
	    this.R_name=name;
		this.R_id=id;
	}
    public void ReceiptionistStaffInfo(String name,String id, char gender, double salary)
	{   
	    this.R_name=name;
		this.R_id=id;
		this.R_gender=gender;
		this.R_salary=salary;
	}
    	
	   
	public void setName( String name)
    {   
    this.R_name=name;
    }
    public void setId(String id)
    {  
    this.R_id=id;
    }
	public void setGender(char gender)
    {
    this.R_gender=gender;
    }
	public void setSalary(double salary)
    {  
    this.R_salary=salary;
    }
	
	public String getName()
    {
    return R_name;
    }	 
    public String getId()
    {
	return R_id;
    }
    public char getGender()
    {
	return R_gender;
    }
    public double getSalary()
    {
	return R_salary;
    } 
	
	

	
}