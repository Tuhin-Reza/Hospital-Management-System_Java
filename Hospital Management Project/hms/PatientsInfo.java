package hms;

import java.lang.*;


public class PatientsInfo 
{    
    private String p_name;
	private String p_type;
	private String Disease;
	private String p_DOB;
	private char p_gender;
	private int serialNo;
	private String DocOfP;
	
	
  public PatientsInfo()
  {
  }
  
  public void setDoc( String name)
  {
	  this.DocOfP=name;
  }

   public void setName( String name)
{   
    this.p_name=name;
}
    public void setDisease(String d)
{  
    this.Disease=d;
}	
     public void setType (String type)
{ 	
    this.p_type=type;
}	 
public void setDOB(String DOB)
{
	this.p_DOB=DOB;
}	
public void setGender(char gender)
{
    this.p_gender=gender;
}
public void setSerial(int serial)
{ 
    this.serialNo=serial;
}	
    public String getName()
{
     return p_name;
}	 
    public int getSerial()
{
	return serialNo;
}
    public String getType()
{
	return p_type;
}
    public String getDOB()
{
	return p_DOB;
} 
   public char getGender()
{  
	return p_gender;
} 
   public String getDisease()
{
    return Disease;
} 
public String getDoc( )
{
	  return DocOfP;
}

}