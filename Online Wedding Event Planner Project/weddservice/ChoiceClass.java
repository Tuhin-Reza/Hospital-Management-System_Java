package weddservice;


public class ChoiceClass() extends VenueClass
{    
    
    public VenueClass []venues= new VenueClass[4];
	public VenueClass V1= new VenueClass();
	public VenueClass V2= new VenueClass();
	public VenueClass V3= new VenueClass();
	public VenueClass V4= new VenueClass();
	V1.setV_info("Beach side Wedding",80000.0);
	V2.setV_info("Park area Wedding",130000.0);
	V3.setV_info("Personal Property",15000.0);
	V4.setV_info("Community Centre",100000.0);
	venues[0]=V1;
	venues[1]=V2;
	venues[2]=V3;
	venues[3]=V4;
}	
	
	
    	