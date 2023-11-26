package person;

public class UserClass
{     
    private String U_name, U_email,  U_number, U_address;
	private int U_id;
	
	public void setUserInfo(String name,String email, String number, String address)
	{  
	    this.U_name=name;
		this.U_email=email;
		this.U_number=number;
		this.U_address=address;
    }
    public void setUserId(int id)
	{	
	    this.U_id=id+1;
	}
	public int getUserId()
	{
		return U_id;
	}
    public String getUserN()
	{
        return 	U_name;
    }
    public String getUserE()
	{
        return U_email;
    }	
	public String getUserNum()
	{
        return 	U_number;
    }	
	public String getUserA()
	{
        return U_address;
    }	
		
	
}	