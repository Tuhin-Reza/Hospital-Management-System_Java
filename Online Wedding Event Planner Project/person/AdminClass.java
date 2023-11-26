package person;
import java.util.*;

public class AdminClass extends EngineClass
{  
    public String A_Idname;
	public String A_password;
	
	
	
	
	
   
    public void setA_info(String name,String password)
    {  
        this.A_Idname=name;
        this.A_password=password;
       
    }
    public String getA_name()
    {
        return  A_Idname;
    }
    public String getA_password()
    {
        return  A_password;
    }

  
	
	

}	
	