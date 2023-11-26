import person.*;
import weddservice.*;
import java.util.*;
import java.io.*;

public class WeddPlan
{
    public static void main (String[]arg)
    {
	    Scanner sc= new Scanner(System.in);
	    EngineClass EngObj= new EngineClass();
	    PlannerClass PlanObj=new PlannerClass();
	
	    AdminClass A1=new AdminClass();
        AdminClass A2=new AdminClass();
	    A1.setA_info("Saikha20","PixyDust789");
    	A2.setA_info("Assafa20","Salvador420");
	
	    VenueClass []venues= new VenueClass[4];
        VenueClass V1= new VenueClass();
        VenueClass V2= new VenueClass();
        VenueClass V3= new VenueClass();
        VenueClass V4= new VenueClass();
    	V1.setV_info("Beach side Wedding",80000.0);
    	V2.setV_info("Park area Wedding",130000.0);
    	V3.setV_info("Personal Property",15000.0);
    	V4.setV_info("Community Centre",100000.0);
    	venues[0]=V1;
    	venues[1]=V2;
    	venues[2]=V3;
	    venues[3]=V4;
	
	    MenuClass []menues=new MenuClass[5];
    	MenuClass M1= new MenuClass();
    	MenuClass M2= new MenuClass();
    	MenuClass M3= new MenuClass();
    	MenuClass M4= new MenuClass();
    	M1.setM_info("Wonthon & Soup"," Fried Rice, Chicken & Veg","Ice cream","Soft Drinks",350.0);
    	M2.setM_info("tikki kabab & nan","Kachhi, Chicken roast","Firni","Borhani",650.0);
     	M3.setM_info("Chicken Fry","Polao, Beef curry & veg ","Payesh","Borhani",550.0);
    	M4.setM_info("tikki kabab & Nan","Kachhi, Beef Curry, Veg, ChickenRoast","Firni","Borhani & Cold Drinks",890.0);
    	menues[0]=M1;
    	menues[1]=M2;
    	menues[2]=M3;
    	menues[3]=M4;
	
    	DecorClass[] Stylename=new DecorClass[4];
        DecorClass D1=new DecorClass();
        DecorClass D2=new DecorClass();
        DecorClass D3=new DecorClass();
        DecorClass D4=new DecorClass();
        D1.setD_info("Modern Style Wedding",40000);
        D2.setD_info("Tradition Style Wedding",80000);
        D3.setD_info("Theme_Base Style Wedding",75000);
        D4.setD_info("Customized Wedding",65000);
        Stylename[0]=D1;
        Stylename[1]=D2;
        Stylename[2]=D3;
        Stylename[3]=D4;
	
    	boolean choice1=true;
        while(choice1)
        {
	        System.out.println("\n\n             Online wedding planner website\n");
    	    System.out.println(" 1.Customer                      "); 
    	    System.out.println(" 2.Admin                          ");
    		System.out.println(" 3.Planner                            ");
	        System.out.println(" 4.Exit the website                    ");
        	System.out.println(" Who are you ???(choose option according to your status) \n");
	    	System.out.print(" Choose your option : ");
        	int option1=0;
         	option1=sc.nextInt();
         	double TotalCost=0;	
	    
	    	if(option1==1)
    	    {   
                UserClass user_obj= new UserClass();
                boolean choice2=true;
                while(choice2)
	        	{   
                    System.out.println("To use our website you need to provide us your information\n");
             
	        	    System.out.print("Enter your name : ");
	                String name=sc.next();
					sc.nextLine();
        		    System.out.print("\nEnter your Email Address : ");
         		    String id=sc.next();
					sc.nextLine();
         			System.out.print("\nEnter your Phone number : ");
	         		String num=sc.next();
					sc.nextLine();
         			System.out.print("\nEnter your Address : ");
        			String address=sc.next();
			
	        		user_obj.setUserInfo( name,id,num,address);
        			EngObj.addUser(user_obj);
        			EngObj.addUserRecord(user_obj);
			
	         		System.out.println("\nWhat do you want to do next?");
	        		System.out.println(" 1. proceed to place Order");
	         		System.out.println(" 2. Go back \n");
			        System.out.print(" option : "); 
	        		int option2=0;
	         		option2=sc.nextInt();
	        	
			
				
			        if(option2==1)
			     	{	
			            for(int i=0; i<venues.length;i++)
			            {  
        					if(venues[i]!=null)
				            {
		     	                System.out.println((i+1)+"."+venues[i].getV_name()+" : "+venues[i].getV_price()+"\n");
		     	            }
		     		    }
                        System.out.println("\nchoose your venue option : ");				
	     		        int option3=sc.nextInt(); 
					
	    				double Total_cost=0;
	      				Total_cost=venues[(option3-1)].getV_price();
					
	     				for(int j=0; j<menues.length;j++)
	     		        {  
        					if(menues[j]!=null)
	     			        {
	     		                System.out.println("Package"+(j+1)+"."+"[starter : "+menues[j].getM_starter()+"; Main course : "+menues[j].getM_main()+"; Dessert : "+menues[j].getM_dessert()+"; Drinks : "+menues[j].getM_drinks()+"]; cost per head : "+menues[j].getM_cost()+"\n");                            
	     		            }
	    			    }
                        System.out.println("\nchoose your menu option : ")	;			
	    		        int option4=sc.nextInt();
					
	     				System.out.print("\nEnter the guest number at wedding : ");
	    				int numey=sc.nextInt();
	     				EngObj.setGuestNum(numey);
		    			double foodcost=(menues[(option4-1)].getM_cost()*numey);
					
		     			Total_cost += foodcost;
					
		     			for(int k=0; k<Stylename.length;k++)
	    		        {   
					        if(Stylename[k]!=null)
				            {
			                    System.out.println("DecorStyle"+(k+1)+". "+Stylename[k].getD_Stylename()+";  DecorCost : "+Stylename[k].getD_cost()+"\n");
	    		            }
	     			    }
                        System.out.println("\nchoose your decor option : ");				
	     		        int option5=sc.nextInt(); 
	 				
	     				Total_cost += Stylename[(option5-1)].getD_cost();
	    				System.out.println("\nTotal cost of your arrangement :"+	Total_cost);
					
		    			try
	                    {
		                    FileReader frd = new FileReader("OrderRecord.txt");
		                    BufferedReader reader= new BufferedReader(frd);
		                    int linecount=0;
	        	            String s=null;
		
	                     	while((s=reader.readLine())!=null)
		                	{ 
		                        linecount++;
		     
		                    }
	                        reader.close();
		   
	    	                FileWriter writer = new FileWriter("OrderRecord.txt",true);
	                        BufferedWriter bwr= new BufferedWriter(writer);
                 		    PrintWriter pwr= new PrintWriter(bwr);
						
	    					pwr.println("   "+" Venue Preference: "+venues[(option3-1)].getV_name()+"; amount: "+venues[(option3-1)].getV_price());
    						pwr.println("   "+"Menu Preference: "+"starter :"+menues[(option4-1)].getM_starter()+"; Main course : "+menues[(option4-1)].getM_main()+"; Dessert : "+menues[(option4-1)].getM_dessert()+"; Drinks : "+menues[(option4-1)].getM_drinks()+"; cost per head : "+menues[(option4-1)].getM_cost());
	    					pwr.println("   "+"Decoration Preference: "+Stylename[(option5-1)].getD_Stylename()+";  DecorCost : "+Stylename[(option5-1)].getD_cost());
	    					pwr.println("   "+"Total guest"+numey+"Total cost of arrangement : "+	Total_cost+"\n");
	    					pwr.flush();
	                        pwr.close();
	    	            }
				        catch(IOException e)
		    			{
			                e.printStackTrace();
                            System.out.println("An error occured while adding information");
                        }
	                    System.out.println("Your order has been placed.");
						System.out.println("Thank you for visiting us!!!"+"\n Our team will soon contact you for payment details ");
      			     	System.out.println("For any other inquiry contact with us at : "+"getSet_PerfectWedding@gmail.com");
						break;
					}	
       			     
				   
				
				    else if(option2==2)
				    {    
                        System.out.println("Taking back to Home Page.....");			
				        choice2=false;
				    }
				
                    else
                    {					
				        System.out.println("Error!!!\n Your available options are 1-2. \n Please Try Again!!");
					
				    }
				}	
		    }	
				
			
		

		
	        else if(option1==2)          
	    	{   
		        
		       
          		  
                
			        System.out.print("\nEnter your ID name : ");
                    String id=sc.next();
                    System.out.print("\nEnter your password : ");			
                    String pass=sc.next();
	     	        boolean choicey=true;
                    while(choicey)
					{	
			
                    if((A1.getA_name().equals(id) && A1.getA_password().equals(pass)) || (A2.getA_name().equals(id) && A2.getA_password().equals(pass)))
 	                {  
			            System.out.println(" 1.Customer Management ");
			        	System.out.println(" 2.Planner Management  "); 
                     	System.out.println(" 3.See Order records   "); 
	                    System.out.println(" 4.Log out             ");
             	        System.out.print(" choose your option : ");
            	
				        int option3=0;
	        		 	option3=sc.nextInt();
	         				
	        				if(option3==1)
	        				{   
						        boolean choice4=true;
	                            while(choice4)
	         			        {
	         		            System.out.println("\n 1.Remove Customer");
         	  		            System.out.println(" 2.Show current Customer ");
	         		            System.out.println(" 3.Show Customer record ");
	        					System.out.println(" 4.Go Back");
						        System.out.print("option : ");
		        	            int option4=sc.nextInt();
				                	
							
					     
				      	        if(option4==1)
			     				{  
         							System.out.println(" Enter Customers ID to remove :");
			                        int idd=sc.nextInt();
			     					EngObj.removeUser(EngObj.getUser(idd));
			     				}	
			                    else if(option4==2)
			     				{  
                                    EngObj.showCurrentUser();					
		    			        } 
				    			else if(option4==3)
			    			    {
			    			        EngObj.showUserRecord();
			      				}
                                else if(option4==4)
                                { 
                                    
									choice4=false;
								}	
		    					else
		    					{
			     					System.out.println("Your available options are 1-4");
			     				}
								}								
								
							}	
							
					        else if(option3==2)	
				        	{   
						        boolean choice0=true;
	                            while(choice0)
	         			        {
								
			         	        System.out.println("\n 1.Add Planner    ");
			                    System.out.println(" 2.Remove Planner ");
		         	            System.out.println(" 3.Show Planners info ");
		         				System.out.println(" 4.Go Back");
								System.out.print(" option :");
	        					int option5=sc.nextInt();
						
	         					if(option5==1)
	         					{   
				         	        System.out.println("Enter New Planner's name : ");
			         				String namu=sc.next();
			        				PlanObj.setP_nam(namu);
			                
		         					System.out.println("Give your Planner an unique code to log in : ");
		         					String na=sc.next();
	        						PlanObj.setP_code(na);
							
	         						EngObj.addPlanner(PlanObj);
			        		    }
                                else if(option5==2)	
				        		{   
                                    System.out.println("Enter the planner's name you want to remove :");
                                    String namey=sc.next();
                                    EngObj.removePlanner(EngObj.getPlanner(namey));						
					        	}
                                else if(option5==3)	
					         	{  						
                                    EngObj.showPlanner();
					           	}	
					         	else if(option5==4)	
					        	{    
					               choice0=false;
				        		}	
				        		else
				         		{
				        			System.out.println("Your available options are 1-4");
				        			choice0=false;
			        			}
								}
			        		}
							
					        else if(option3==3)			
					        {   
                                EngObj.showOrderRecord();				
					        }			
				         	else if(option3==4)
				         	{
		        				
                             break;								
		         			}			
		        			else
		        			{						
	         					System.out.println("Your available options are 1-3");
		 						
		         			}
							
		        	}	
		        	
					
                    else 
                    {
                        System.out.println("Either your id name/password was wrong");
                        break;				
                    }
					}
			}	
       
	   
	   
            else if(option1==3)
	    	{   
	        
			    System.out.println("Enter your name : ");
                String id=sc.next();
                System.out.print("Enter your given code: ");			
                String pass=sc.next();
				boolean choice5=true;
				if(EngObj.checkPlanner(id,pass))
				{	
	                
	    	        	
    			        	
	                        while(choice5)
		                 	{   
				
                                System.out.println("1.See Venue Detail");
                                System.out.println("2.See Menu  Detail");
                                System.out.println("3.See Venue Detail");		
                                System.out.println("4.See Order Record");
                                System.out.println("5.Log out");
			     				System.out.print("Choose your option: ");
	                     		int option3=sc.nextInt();
                                
	        		
                                if(option3==1)
	                			{ 
	    	         	            for(int l=0; l<venues.length;l++)
	     		                    {  
                   						if(venues[l]!=null)
			     	                    {
		        	                        System.out.println((l+1)+"."+venues[l].getV_name()+" : "+venues[l].getV_price()+"\n");
		     	                        }
	     			                }
                            
                                }
							
	    		               	else if(option3==2)
                                {
	         			            for(int m=0; m<menues.length;m++)
		         	                {   
			        	         		if(menues[m]!=null)
		         		                {
     			                            System.out.println(" Package"+(m+1)+"."+"[starter : "+menues[m].getM_starter()+"; Main course : "+menues[m].getM_main()+"; Dessert : "+menues[m].getM_dessert()+"; Drinks : "+menues[m].getM_drinks()+"; cost per head : "+menues[m].getM_cost()+"\n");                            
    			                        }
    				                }	
                                }
							
                                else if(option3==3)
                                {
                                    for(int n=0; n<Stylename.length;n++)
	            		            {  
							            if(Stylename[n]!=null)
             				            {
            			                    System.out.println(" DecorStyle"+(n+1)+". "+Stylename[n].getD_Stylename()+";  DecorCost : "+Stylename[n].getD_cost()+"\n");
            			                }
            				        }
                                }
							 
                                else if(option3==4)
                                {
                                    EngObj.showOrderRecord();
                                }
							
                                else if(option3==5)
	            		     	{
	            		    		choice5=false;		
	             		    	}
							
	            		    	else
     	        		    	{						
	    			            	System.out.println("Your available options are 1-5");
				 				    break;
	            	     		}
			      	        }
       				    
					
					    
                       
			    
                }				
	        }
        
            else if(option1==4)
            {    
                choice1=false;
	    	}
		    else
	    	{	
	    	     System.out.println("Error!!!\n Your available options are 1-4. \n Please Try Again!!");
	    	}
		}	
	}
}	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		  