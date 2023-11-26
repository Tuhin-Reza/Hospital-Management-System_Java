package person;


	
public class PlannerClass
{  
    private String P_name;
    private String P_code;
   
    public void setP_Nam(String name,String code)
    {  
        this.P_name=name;
        this.P_code=code;
       
    }
	public void setP_code(String code)
    {  
 
        this.P_code=code;
       
    }
	public void setP_nam(String name)
    {  
        this.P_name=name;
        
       
    }
    public String getP_name()
    {
        return  P_name;
    }
	public String getP_code()
    {
        return  P_code;
    }
    	
}		