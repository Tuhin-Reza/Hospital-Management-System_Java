package hms;
import java.lang.*;
import java.util.*;
import java.io.*;
import interfaces.*;

public class DoctorsInfo implements PatientsManage
{ private String d_name;
  private String d_id;
  private int d_roomno;
  private double d_salary;
 
   
  public PatientsInfo patients[]=new PatientsInfo[100];
  
 
  
  
  
  
 public DoctorsInfo()
 {
	
 }
 
    	 
public void setName( String name)
{   
    this.d_name=name;
}
    public void setId(String id)
{  
    this.d_id=id;
}
     public void setRoomNo(int roomno)
{ 	
    this.d_roomno=roomno;
}	 
   public void setSalary(double salary)
{  
   this.d_salary=salary;
}
  public String getName()
{
     return d_name;
}	 
   public String getId()
{
	return d_id;
}
    public int getRoomNo()
{
	return d_roomno;
}
    public double getSalary()
{
	return d_salary;
} 
public void addPatient(PatientsInfo p)
{ 
    for(int i=0;i<patients.length;i++)
    {   if(patients[i]==null)
        {  
        patients[i]=p;
		System.out.println("has been added successfully");
		break;
	    }
    }  
}
public void removePatient(PatientsInfo p)
{   int flag=0;
    for(int i=0;i<patients.length;i++)
	{   if (patients[i].getName().equals(p.getName()))
		{  		
		   patients[i]=null;
		   flag=1;
		   break;
		}  
	}
	if(flag==1)
	{    System.out.println("Patient has been removed from doctors list");
    }	
	else 
	{ System.out.println("can not remove!");	
	}
}	

public PatientsInfo getPatient(String name)

{   PatientsInfo p=null;
    for(int i=0;i<patients.length;i++)
	{
		if(patients[i]!=null)
		{
			if(patients[i].getName().equals(name))
			{    
		        p=patients[i];
				break;
			}	
        }
    }
    return p;
}	

public void showPatientsInfo()
{
	for(int i=0;i<patients.length;i++)
	{    if(patients[i]!=null)
		{
			System.out.println("\n patient's name :"+patients[i].getName()+"\n Date of Birth :"+patients[i].getDOB()+"\n Gender :"+patients[i].getGender()+"\n Disease :"+ patients[i].getDisease()+"\n Type :"+patients[i].getType());                                
        }
    }
}	

}