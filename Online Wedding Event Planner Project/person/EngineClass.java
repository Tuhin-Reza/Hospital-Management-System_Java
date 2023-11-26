package person;
import java.util.*;
import java.lang.*;
import java.io.*;


public class EngineClass implements Enginterface
{
	
	public ArrayList <UserClass> UserArr=new ArrayList <UserClass> ();
    public ArrayList <PlannerClass> PlannerArr=new ArrayList <PlannerClass> ();	
	public int GuestNum=0;
	public int k=0;
	
	public void setGuestNum(int n)
	{
		this.GuestNum=n;
    }
	public int getGuestNum()
	{
		return GuestNum;
	}	
	public boolean checkPlanner(String n, String c)
	{    
	    boolean ch=false;
	    for(int i=0;i<PlannerArr.size();i++)
		{   
	    	if(PlannerArr.get(i)!=null)
	        {	
    			if(PlannerArr.get(i).getP_name().equals(n) && PlannerArr.get(i).getP_code().equals(c))
      		    {
				    ch=true;
				}
			}	 				
		}			
		return ch;			
	}				
					
					
					
	public void addPlanner(PlannerClass obj)
    {   try{
			PlannerArr.add(obj);
			     
           

		}catch(Exception e){
			System.out.println("there was error during the process. please try again!");
		}
	}
	public PlannerClass getPlanner(String nam)
	{ 
	    PlannerClass obj=null;
	    for(int i=0;i<PlannerArr.size();i++)
	    {    if(PlannerArr.get(i)!=null)
			{   if(PlannerArr.get(i).getP_name().equals(nam))
				{   obj =PlannerArr.get(i);
			        break;
				}
			}
		}
		return obj;
	}
    public void removePlanner(PlannerClass obj)
    {   int flag=0;
	    for(int i=0;i<PlannerArr.size();i++)
		{   if(PlannerArr.get(i).getP_name().equals(obj.getP_name()))
			{ 
		       PlannerArr.remove(i);
		       flag=1;
			   break;
			}   
		}
        if(flag==1)
		{ System.out.println("User has been removed from the list");
		}	
		else 
		{ System.out.println("can not remove!");	
		}
	}
	public void showPlanner()
	{   for(int i=0;i<PlannerArr.size();i++)
		{   if(PlannerArr.get(i)!=null)
			{  
		        System.out.println("Planner's Name: "+PlannerArr.get(i).getP_name()+"\nGiven code: "+PlannerArr.get(i).getP_code());
            }
        }
    }	
    	
	public void addUser(UserClass obj)
    {   /*int flag=0;
        for(int i=0; i<UserArr.size();i++)
		{     
                UserArr.get(i).setUserId(i);  
		        UserArr.add(obj);
				
				flag=1;
				break;
			
		}
        if(flag==1)
        {
            System.out.println("We have created an account for you.!!!");			
		}
        else
		{	
	        System.out.println("there was error during the process. please try again!");		
	    }*/
		try{
			UserArr.add(obj);
			     
            UserArr.get(k).setUserId(k);  
		    k++;
		        //UserArr.add(obj);
				//flag=1;
				//break;
			
		}catch(Exception e){
			System.out.println("there was error during the process. please try again!");
		}
	}
	public void addUserRecord(UserClass obj)
	{   try
	    {   
		    FileReader frd = new FileReader("CustomerRecord.txt");
		    BufferedReader reader= new BufferedReader(frd);
		    int linecount=0;
	    	String s=null;
		
	    	while((s=reader.readLine())!=null)
			{ 
		        linecount++;
		     
		    }
	        reader.close();
		   
		    FileWriter writer = new FileWriter("CustomerRecord.txt",true);
	        BufferedWriter bwr= new BufferedWriter(writer);
		    PrintWriter pwr= new PrintWriter(bwr);
			
		    for(int i=0;i<UserArr.size();i++)
            {	
		        if(UserArr.get(i).equals(obj))
                {			
		            pwr.println( (linecount+1)+".Customer ID: "+UserArr.get(i).getUserId()+"; Name: "+UserArr.get(i).getUserN()+"; Email id : "+UserArr.get(i).getUserE()+"; Contact Number : "+UserArr.get(i).getUserNum()+"; Address : "+UserArr.get(i).getUserA());
		            break;
		        }
		    }
		    pwr.flush();
	        pwr.close();
	    }
		catch(IOException e){
			e.printStackTrace();
           System.out.println("An error occurs");
        }
		
	}
	public UserClass getUser(int id)
	{ 
	    UserClass obj=null;
	    for(int i=0;i<UserArr.size();i++)
	    {    if(UserArr.get(i)!=null)
			{   if(UserArr.get(i).getUserId()==id)
				{   obj =UserArr.get(i);
			        break;
				}
			}
		}
		return obj;
	}	
	public void removeUser(UserClass obj)
    {   int flag=0;
	    for(int i=0;i<UserArr.size();i++)
		{   if(UserArr.get(i).getUserId()==obj.getUserId())
			{  UserArr.remove(i);
		       flag=1;
			   break;
			}   
		}
        if(flag==1)
		{ System.out.println("User has been removed from the list");
		}	
		else 
		{ System.out.println("can not remove!");	
		}
	}
	public void showCurrentUser()
	{   for(int i=0;i<UserArr.size();i++)
		{   if(UserArr.get(i)!=null)
			{
				System.out.println("\nName of the Customer :"+UserArr.get(i).getUserN()+"\nID no. :"+UserArr.get(i).getUserId()+"\nEmail : :"+UserArr.get(i).getUserE()+"\nContact Number :"+UserArr.get(i).getUserNum()+"\n Address : "+UserArr.get(i).getUserA());
	        }
		}
    }	
	public void showUserRecord()
	{   try
	    {
		FileReader frd = new FileReader("CustomerRecord.txt");
		BufferedReader reader= new BufferedReader(frd);
		int linecount=0;
		String s=null;
		
		while((s=reader.readLine())!=null)
            { linecount++;
             System.out.println(s);
            }
		reader.close();
	    }
		catch(IOException e){
			e.printStackTrace();
           System.out.println("An error occured while processing to show information");
        }
	}
    public void showOrderRecord()	
	{
		try
	    {
		FileReader frd = new FileReader("OrderRecord.txt");
		BufferedReader reader= new BufferedReader(frd);
		int linecount=0;
		String s=null;
		
		while((s=reader.readLine())!=null)
            { linecount++;
             System.out.println(s);
            }
		reader.close();
	    }
		catch(IOException e){
			e.printStackTrace();
           System.out.println("An error occured while processing to show information");
        }
	}
	/*public static void main (String[]arg)
    { System.out.println("uuuuu");
	}*/
}	

	
	
	

    	