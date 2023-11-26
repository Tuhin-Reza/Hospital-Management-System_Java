package weddservice;

public class MenuClass
{   
    private String M_starter, M_main,M_dessert,M_drinks;
	private double M_cost;
	
	public void setM_info(String start,String tart,String art,String rt,double price)
	{   
	    this.M_starter=start;
		this.M_main=tart;
		this.M_dessert=art;
		this.M_drinks=rt;
		this.M_cost=price;
		
	}
	public String getM_starter()
    {
        return  M_starter;
    }
	public String getM_main()
    {
      return M_main;
    }
    
    public String getM_dessert()
    {
        return  M_dessert;
    }
    
     public String getM_drinks()
    {
        return  M_drinks;
    }
	public double getM_cost()
    {
        return  M_cost;
    }
}   