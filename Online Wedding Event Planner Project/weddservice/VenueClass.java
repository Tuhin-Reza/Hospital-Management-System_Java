package weddservice;

public class VenueClass
{
	private String V_name;
	private double V_price;
	
	
	public void setV_info(String name,double price)
	{   
	    this.V_name=name;
		this.V_price=price;
		
	}
    
    public String getV_name()
    {
		return V_name;
    }
	public double getV_price()
    {   
	    return V_price;
    }
    
	
}	
	
	
	
	
	
	