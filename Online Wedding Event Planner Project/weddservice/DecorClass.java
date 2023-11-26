package weddservice; 

public class DecorClass
{  
    private String D_Stylename;
    private double D_cost;
   
    public void setD_info(String name,double price)
    {  
        this.D_Stylename=name;
        this.D_cost=price;
       
    }
    public String getD_Stylename()
    {
        return  D_Stylename;
    }
    public double getD_cost()
    {
        return  D_cost;
    }
}