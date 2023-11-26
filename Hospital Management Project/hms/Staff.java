package hms;
import java.lang.*;
import employee.*;
import interfaces.*;

public class Staff implements StuffManage
{   public ReceiptionistStaff receiptionists[]=new ReceiptionistStaff[5];
    public SecurityGuard guards[]=new SecurityGuard[10];
	public TechnicalStaff technitians[]=new  TechnicalStaff[6];
	public AdministrativeStaff administrateStaff[]=new AdministrativeStaff[10];
	public Cleaner cleaners[]=new Cleaner[10];
	public Nurse nurses[]=new Nurse[15];
	
	
	
	
    public void addReceiptionist(ReceiptionistStaff R)
    {   
	    int flag=0;
        for(int i=0;i<receiptionists.length;i++)
		{   if(receiptionists[i]==null)
			{   receiptionists[i]=R;
		        flag=1;
		        break;
			}
		}
		if(flag==1)
		{System.out.println("New receiptionists has been added successfully");
	    }
		else 
		{ System.out.println("can not insert!");	
		}
    }
	public void removeReceiptionist(ReceiptionistStaff R)
	{   int flag=0;
	    for(int i=0;i<receiptionists.length;i++)
		{   
			   if(receiptionists[i].getName().equals(R.getName()))
			    {   
                    receiptionists[i]=null;
				    flag=1;
				   break;
	            }
			
		}
		if(flag==1)
		{System.out.println( "removed successfully from receiptionists list");
		}
		else 
		{ System.out.println("can not remove!");	
		}
    }
	public ReceiptionistStaff getReceiptionist(String name)
	{   
        ReceiptionistStaff r=null;
        for(int i=0;i<receiptionists.length;i++)
		{   if(receiptionists[i]!=null)
			{   if(receiptionists[i].getName().equals(name))
	            {  r=receiptionists[i];
			       break;
				}
            }
        }
        return r;
    }		
    public void showReceiptionists()
	{   for(int i=0;i<receiptionists.length;i++)
		{   if(receiptionists[i]!=null)
			{
				System.out.println("\nName of the receiptionist :"+receiptionists[i].getName()+"\nID no. :"+receiptionists[i].getId()+"\nGender :"+receiptionists[i].getGender()+"\nSalary :"+receiptionists[i].getSalary());
	        }
		}
    }		
	public void addGuard(SecurityGuard G)
    {   
	    int flag=0;
        for(int i=0;i<guards.length;i++)
		{   if(guards[i]==null)
			{   guards[i]=G;
		        flag=1;
		        break;
			}
		}
		if(flag==1)
		{System.out.println("New guard has been added successfully");
	    }
		else 
		{ System.out.println("can not insert!");	
		}
    }
	public void removeGuard(SecurityGuard g)
	{   int flag=0;
	    for(int i=0;i<guards.length;i++)
		{  
			   if(guards[i].getName().equals(g.getName()))
				{   
                    guards[i]=null;
					flag=1;
					break;
	            }
			
		}
		if(flag==1)
		{
			System.out.println(" has been removed successfully from guards list");
		}	
		else 
		{ 
	        System.out.println("can not remove!");	
		}
		
    }
	public SecurityGuard getSecurityGuard(String name)
	{   
        SecurityGuard g=null;
        for(int i=0;i<guards.length;i++)
		{   if(guards[i]!=null)
			{   if(guards[i].getName().equals(name))
	            {  g=guards[i];
			       break;
				}
            }
        }
        return g;
    }		
    public void showSecurityGuards()
	{   for(int i=0;i<guards.length;i++)
		{   if(guards[i]!=null)
			{
				System.out.println("\nName of the receiptionist :"+guards[i].getName()+"\nID no. :"+guards[i].getId()+"\nGender :"+guards[i].getGender()+"\nSalary :"+guards[i].getSalary());
	        }
		}
    }
    public void addTechnicalStaff(TechnicalStaff T)
    {   
	    int flag=0;
        for(int i=0;i<technitians.length;i++)
		{   if(technitians[i]==null)
			{   technitians[i]=T;
		        flag=1;
		        break;
			}
		}
		if(flag==1)
		{System.out.println("New Technical Staff has been added successfully");
	    }
		else 
		{ System.out.println("can not insert!");	
		}
    }
	public void removeTechnicalStaff(TechnicalStaff T)
	{   int flag=0;
	    for(int i=0;i<technitians.length;i++)
		{  
			   if(technitians[i].getName().equals(T.getName()))
				{   
                    technitians[i]=null;
					flag=1;
					break;
	            }
			
		}
		if(flag==1)
		{
			System.out.println(" has been removed successfully from Technical Staffs list");
		}	
		else 
		{ 
	        System.out.println("can not remove!");	
		}
    }
	public TechnicalStaff getTechnicalStaff(String name)
	{   
        TechnicalStaff t=null;
        for(int i=0;i<technitians.length;i++)
		{   if(technitians[i]!=null)
			{   if(technitians[i].getName().equals(name))
	            {  t=technitians[i];
			       
			       break;
				}
            }
        }
        return t;
    }
    public void showTechnicalStaffs ()
	{   for(int i=0;i<technitians.length;i++)
		{   if(technitians[i]!=null)
			{
				System.out.println("\nName of the Technical Staffs :"+technitians[i].getName()+"\nID no. :"+technitians[i].getId()+"\nGender :"+technitians[i].getGender()+"\nSalary :"+technitians[i].getSalary());
	        }
		}
    }
    public void addAdministrativeStaff(AdministrativeStaff A)
    {   
	    int flag=0;
        for(int i=0;i<administrateStaff.length;i++)
		{   if(administrateStaff[i]==null)
			{   administrateStaff[i]=A;
		        flag=1;
		        break;
			}
		}
		if(flag==1)
		{System.out.println("New Administrative Staff has been added successfully");
	    }
		else 
		{ System.out.println("can not insert!");	
		}
    }
	public void removeAdministrativeStaff(AdministrativeStaff A)
	{   int flag=0;
	    for(int i=0;i<administrateStaff.length;i++)
		{   
			  if(administrateStaff[i].getName().equals(A.getName()))
				{   
                    administrateStaff[i]=null;
					flag=1;
					break;
	            }
			
		}
		if(flag==1)
		{
			System.out.println(" has been removed successfully from Administrative Staffs list");
		}	
		else 
		{ 
	        System.out.println("can not remove!");	
		}
    }
	public AdministrativeStaff getAdministrativeStaff(String name)
	{   
        AdministrativeStaff a=null;
        for(int i=0;i<administrateStaff.length;i++)
		{   if(administrateStaff[i]!=null)
			{   if(administrateStaff[i].getName().equals(name))
	            {  a=administrateStaff[i];
			       break;
				}
            }
        }
        return a;
    }		
    public void showAdministrativeStaffs()
	{   for(int i=0;administrateStaff[i]!=null;i++)
		{   if(administrateStaff[i]!=null)
			{
				System.out.println("\nName of the Administrative Staff :"+administrateStaff[i].getName()+"\nID no. :"+administrateStaff[i].getId()+"\nGender :"+administrateStaff[i].getGender()+"\nSalary :"+administrateStaff[i].getSalary());
	        }
		}
    }
 public void addCleaner(Cleaner C)
    {   
	    int flag=0;
        for(int i=0;i<cleaners.length;i++)
		{   if(cleaners[i]==null)
			{   cleaners[i]=C;
		        flag=1;
		        break;
			}
		}
		if(flag==1)
		{System.out.println("New cleaner has been added successfully");
	    }
		else 
		{ System.out.println("can not insert!");	
		}
    }
	
	public void removeCleaner(Cleaner C)
	{   int flag=0;
	    for(int i=0;i<cleaners.length;i++)
		{   
			   if(cleaners[i].getName().equals(C.getName()))
				{   
                    cleaners[i]=null;
					flag=1;
					break;
	            }
			
		}
		if(flag==1)
		{System.out.println(" has been removed successfully from cleaners list");
	    }
		else 
		{ System.out.println("can not remove!");	
		}
    }
	public Cleaner getCleaner(String name)
	{   
        Cleaner c=null;
        for(int i=0;i<cleaners.length;i++)
		{   if(cleaners[i]!=null)
			{   if(cleaners[i].getName().equals(name))
	            {  c=cleaners[i];
			       break;
				}
            }
        }
        return c;
    }		
    public void showCleaners()
	{   for(int i=0;i<cleaners.length;i++)
		{   if(cleaners[i]!=null)
			{
				System.out.println("\nName of the Cleaner :"+cleaners[i].getName()+"\nID no. :"+cleaners[i].getId()+"\nGender :"+cleaners[i].getGender()+"\nSalary :"+cleaners[i].getSalary());
	        }
		}
    }
    public void addNurse(Nurse N)
    {   
	    int flag=0;
        for(int i=0;i<nurses.length;i++)
		{   if(nurses[i]==null)
			{   nurses[i]=N;
		        flag=1;
		        break;
			}
		}
		if(flag==1)
		{System.out.println("New nurse has been added successfully");
	    }
		else 
		{ System.out.println("can not insert!");	
		}
    }
	
	public void removeNurse(Nurse N)
	{   int flag=0;
	    for(int i=0;i<nurses.length;i++)
		{   
			   if(nurses[i].getName().equals(N.getName()))
				{   
                   nurses[i]=null;
					flag=1;
					break;
	            }
			
		}
		if(flag==1)
		{System.out.println(" has been removed successfully from nurses list");
		}
		else 
		{ System.out.println("can not remove!");	
		}
    }
	public Nurse getNurse(String name)
	{   
        Nurse n=null;
        for(int i=0;i<nurses.length;i++)
		{   if(nurses[i]!=null)
			{   if(nurses[i].getName().equals(name))
	            {  n=nurses[i];
			       break;
				}
            }
        }
        return n;
    }		
    public void showNurses()
	{   for(int i=0;i<nurses.length;i++)
		{   if(nurses[i]!=null)
			{
				System.out.println("\nName of the Nurse :"+nurses[i].getName()+"\nID no. :"+nurses[i].getId()+"\nGender :"+nurses[i].getGender()+"\nSalary :"+nurses[i].getSalary());
	        }
		}
    }	
}

