import java.lang.*;
import hms.*;
import employee.*;
import interfaces.*;
import java.util.*;
import java.io.*;


public class Main
{
	public static void main(String args[])
	{   
	    HospitalManagement obj = new HospitalManagement();
		Scanner input = new Scanner(System.in) ;
		
		boolean option=true;
	    
		System.out.println("\n\n") ;
		System.out.println("             HOSPITAL MANAGEMENT SYSTEM") ;
		System.out.println("\n\n") ;
	
		
		while(option)
		{
		System.out.println("") ;
		System.out.println("") ;
		int choice =0;
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		System.out.println("                        Main Menu") ;
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		System.out.println("1. Patients Management") ;
		System.out.println("2. Doctors Management");
		System.out.println("3. Staff Management");
		System.out.println("4. Facility Management");
		System.out.println("5. Exit");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
		System.out.println("Choose An Option(Type the serial No.according to the information given\n");
		System.out.print("Option: ") ;
		choice=input.nextInt();
		System.out.println("") ;

		
		    if(choice==1)
		    {       
		        boolean option1=true;
		        while(option1)  
	            {	
		            int choice1=0;
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				    System.out.println("                  Patients Management     ") ;
				    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n") ;
		            System.out.println("1. Insert New Patients Information") ;
		            System.out.println("2. Show All Patient record") ;
		            System.out.println("3. GO back to Main Menu") ;
				    System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				    System.out.println("Type the serial NO. assigned above according to your choice\n");
				    System.out.print("Option: ");
				    choice1=input.nextInt();
				    PatientsInfo p = new PatientsInfo();
	
                    if(choice1==1)
			        {   
			            System.out.println("To add patients information on record fill the needed information.\n");
                        System.out.print("Enter patient's name :  ");
					    String name = input.next() ;
					    p.setName(name) ;	
                    
                        System.out.print("\nDate of Birth :  ");
                        String DOB=input.next();
					    p.setDOB(DOB);
					
                        System.out.print("\ngender :  ");
                        char G=input.next().charAt(0); 
                        p.setGender(G);

                    
                        System.out.print( "\nDisease/Disorder/Condition : ");
                        String D=input.next();
                        p.setDisease(D);				
						 
						 
                        System.out.print("\nPatients Type(admitted/outdoor) : ");
					    String T=input.next();
					    p.setType(T);
					
					
                        System.out.print("\nPatient's Doctor name :");
					    String nam = input.next();
					    p.setDoc(nam);
					
					    obj.addPatientsInfo(p);
						
					}     
				    else if(choice1==2)
					{
				        System.out.println("\nPatients Information record given\n");
			            obj.showPatientsInfo();
						choice1=0;
					}
					
					else if(choice1==3)
                    {   
				        
				        option1=false;
				        
				    }
					
					else
					{ 
				       System.out.println("\nInvalid input your available options : (1-3)\n");
					   
                    }				
				}	
            }
                    
					
        
        
		    else if(choice==2)
			{   boolean option2=true;
	            while(option2)
				{
				    int choice2=0;
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				    System.out.println("                  Doctors Management     ") ;
				    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n") ;
		            System.out.println("1. Insert New Doctors Information") ;
				    System.out.println("2. Remove any Doctor from the list of available doctors.");
		            System.out.println("3. Show all Doctors information of the hospital") ;
		            System.out.println("4. manage the patients list under any doctor") ;
				    System.out.println("5. GO back to Main Menu") ;
				    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				    System.out.println("Type the serial NO. assigned above according to your choice\n");
				    System.out.print("Option: ");
				    choice2=input.nextInt();
				    DoctorsInfo doc= new DoctorsInfo();
	
                    if(choice2==1)
					{  
				    
					    System.out.println("To insert new doctors information fill the needed information.\n");
                    
					    System.out.print("Enter doctor's ID :  ");
					    String id = input.next() ;
					    doc.setId(id); 
					
					    System.out.print("\nEnter doctor's name :  ");
					    String name5 = input.next() ;
					    doc.setName(name5);
					
					
					    System.out.print("\nDoctor's room no. :  ");
					    int room = input.nextInt() ;
					    doc.setRoomNo(room);
					
					    System.out.print("\nDoctor's salary :  ");
					    double salary = input.nextDouble();
					    doc.setSalary(salary);
					    obj.addDocsInfo(doc);
					    obj.insertDoc(doc);
					}
					
					else if(choice2==2)
				    {		
					    System.out.print("\n\nEnter doctor's ID to remove:  ");
					    String idd = input.next() ; 
                        obj.removeDoc(obj.getDoc(idd));
					}
					
					else if(choice2==3)
					{
					    obj.showDocsInfo();
					}
					
					else if(choice2==4)
				    {   
				        boolean luku=true;
						while(luku)
						{	
				        
						    int choicey=0;
				        
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("           Patients Management under any doctor   ") ;
				            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n") ;
				            System.out.println("1. Insert New patient under a doctor") ;
				            System.out.println("2. Remove any patient from a doctor's list");
		                    System.out.println("3. Show all patients of a doctor") ;
					        System.out.println("4. GO back .");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("Type the serial NO. assigned above according to your choice\n");
				            System.out.print("Option: ");
					        choicey=input.nextInt();
					        PatientsInfo p1 = new PatientsInfo();
                    
					        if(choicey==1)
					        {   
					   
					    
						        System.out.print("\nEnter patient's name :  ");
					            String namey = input.next() ;
					            p1.setName(namey) ;	
                    
                                System.out.print("\nDate of Birth :  ");
                                String DOB=input.next();
					            p1.setDOB(DOB);
					
                                System.out.print("\ngender :  ");
                                char G=input.next().charAt(0); 
                                p1.setGender(G);

                    
                                System.out.print( "\nDisease/Disorder/Condition : ");
                                String D=input.next();
                                p1.setDisease(D);				

                                System.out.print("\nPatients Type(admitted/outdoor) : ");
					            String T=input.next();
					            p1.setType(T);
					            doc.addPatient(p1);
						    }
						
						    else if(choicey==2)
							{	
						        System.out.println("\n Enter Patient's name to remove from doctors list: ");
						        String nameu = input.next() ;
                                doc.removePatient(doc.getPatient(nameu));
                            }
						
						    else if(choicey==3)
							{
						        doc.showPatientsInfo();
						    }
						
						    else if(choicey==4)
							{ 
						        luku=false;
						    }
							else
							{
							   	System.out.println("\nInvalid input your available options : (1-4)\n");
						    }
						} 
					    
					}	
					    
					
					else if(choice2== 5)
					{   
				        option2=false;	
					}
					else
					{
                        System.out.println("\nInvalid input your available options : (1-5)\n");						
					}
				}
            }				
	            
			else if(choice==3)
			{	boolean option3=true;
		        while(option3)
				{	
				    int choice3=0;
				    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				    System.out.println("                  Staff Management     ") ;
				    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n") ;
		            System.out.println("1. Receiptionist  ") ;
				    System.out.println("2. Administrative Staff");
		            System.out.println("3. Nurse  ") ;
		            System.out.println("4. Cleaner ") ;
				    System.out.println("5. Technical Staff ") ;
				    System.out.println("6. Security Guard ") ;
				    System.out.println("7. GO back to Main Menu") ;
				    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				    System.out.println("Type the serial NO. assigned above according to your choice\n");
				    System.out.print("Option: ");
				    choice3=input.nextInt();
				    Staff staffobj=new Staff();
					
				    if(choice3==1)
				    {       
				        boolean luku1=true;
						while(luku1)
						{	
				          
				            int choice4=0;
					        System.out.println("  ");
					        System.out.println("  ");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("                     Receiptionist      ") ;
				            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n") ;
		                    System.out.println("1. Insert new receiptionist in list  ") ;
				            System.out.println("2. Remove a receiptionist from the list ");
		                    System.out.println("3. Show all receiptionist of the list");
					        System.out.println("4. GO back .");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("Type the serial NO. assigned above according to your choice\n");
				            System.out.print("Option: ");
					        choice4=input.nextInt();
					        ReceiptionistStaff Rstaff=new ReceiptionistStaff();
					
					        if(choice4==1)
					        {   
					  
					            System.out.print("\nEnter receiptionist's name : ");
					            String name_=input.next();
					            Rstaff.setName(name_);
					   
					            System.out.print("\nEnter ID : ");
					            String Id=input.next();
					            Rstaff.setId(Id);
					   
					            System.out.print("\nEnter Gender : ");
					            char g=input.next().charAt(0); 
					            Rstaff.setGender(g);
					   
					            System.out.print("\nEnter Salary : ");
					            double sal=input.nextDouble();
					            Rstaff.setSalary(sal);
					            staffobj.addReceiptionist(Rstaff);
					        }
					   
					   
					        else if(choice4==2)
							{	
					            System.out.print("\nEnter receiptionist's name to remove: ");
					            String names=input.next();
					            staffobj.removeReceiptionist(staffobj.getReceiptionist(names));
					        }
					   
					        else if(choice4==3)
							{
					            staffobj.showReceiptionists();
					        }
					   
					        else if(choice4==4)
							{    
						        luku1=false;
							}
							
					        else 
							{	
                                System.out.println("\nInvalid input your available options : (1-4)\n");
							}
                        }
                    }						
                    else if(choice3==2)
					{   
                        boolean luku2=true;
                        while(luku2)
                        {							
                            int choice5=0;
					        System.out.println("  ");
					        System.out.println("  ");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("                   Administrative Staff      ") ;
				            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n") ;
		                    System.out.println("1. Insert new administrative staff in list  ") ;
				            System.out.println("2. Remove a administrative staff from the list ");
		                    System.out.println("3. Show all administrative staff of the list");
					        System.out.println("4. GO back .");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("Type the serial NO. assigned above according to your choice\n");
				            System.out.print("Option: ");
					        choice5=input.nextInt();
					        AdministrativeStaff Astaff=new AdministrativeStaff();
					
					        if(choice5==1)
					        {   
					  					
					            System.out.print("\nEnter administrative staff's name : ");
					            String name9=input.next();
					            Astaff.setName(name9);
					   
					            System.out.print("\nEnter ID : ");
					            String Id=input.next();
					            Astaff.setId(Id);
					   
					            System.out.print("\nEnter Gender : ");
					            char g=input.next().charAt(0); 
					            Astaff.setGender(g);
					   
					            System.out.print("\nEnter Salary : ");
					            double sal=input.nextDouble();
					            Astaff.setSalary(sal);
					            staffobj.addAdministrativeStaff(Astaff);
					        }
					   
					        else if(choice5==2)
                            {								
					            System.out.print("\nEnter administrative staff's name to remove: ");
					            String nameb=input.next();
					            staffobj.removeAdministrativeStaff(staffobj.getAdministrativeStaff(nameb));
					        }
							
							else if(choice5==3)
					        {
					            staffobj.showAdministrativeStaffs();
					        }
					   
					        else if(choice5==4)
							{
                                luku2=false;
							}									
				
                            else
                            {
                                System.out.println("\nInvalid input your available options : (1-4)\n");
                            }								
					    }
					}	
					 
					else if(choice3==3)
					{   
				        boolean luku3=true;
						while(luku3)
						{	
					        int choice6=0;
					        System.out.println("  ");
					        System.out.println("  ");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("                     Nurse      ") ;
				            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n") ;
		                    System.out.println("1. Insert new Nurse in list  ") ;
				            System.out.println("2. Remove a Nurse from the list ");
		                    System.out.println("3. Show all Nurses of the list");
					        System.out.println("4. GO back .");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("Type the serial NO. assigned above according to your choice\n");
				            System.out.print("Option: ");
					        choice6=input.nextInt();
					        Nurse Nstaff=new Nurse();
					
					        if (choice6==1)
							{	
					
					            System.out.print("\nEnter Nurse's name : ");
					            String namez=input.next();
					            Nstaff.setName(namez);
					   
					            System.out.print("\nEnter ID : ");
					            String Id=input.next();
					            Nstaff.setId(Id);
					   
					            System.out.print("\nEnter Gender : ");
					            char g=input.next().charAt(0); 
					            Nstaff.setGender(g);
					   
					            System.out.print("\nEnter Salary : ");
					            double sal=input.nextDouble();
					            Nstaff.setSalary(sal);
					            staffobj.addNurse(Nstaff);
							}	
					   
                            else if(choice6==2)
                            {								
					  
					            System.out.print("\nEnter nurse's name to remove: ");
					            String namee=input.next();
					            staffobj.removeNurse(staffobj.getNurse(namee));
					        }
					         
							else if(choice6==3) 
					        {
					            staffobj.showNurses();
					        }
					   
					        else if(choice6==4)
							{
                                luku3=false;
                            }								
					   
					        else
							{
					        System.out.println("\nInvalid input your available options : (1-4)\n");
							}
						}
                    }						
					else if(choice3==4)
					{   boolean luku4=true;
                        while(luku4)
                        {							
					        int choice7=0;
					        System.out.println("  ");
					        System.out.println("  ");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("                       Cleaner      ") ;
				            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n") ;
		                    System.out.println("1. Insert new cleaner in list  ") ;
				            System.out.println("2. Remove a cleaner from the list ");
		                    System.out.println("3. Show all cleaners of the list");
					        System.out.println("4. GO back .");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("Type the serial NO. assigned above according to your choice\n");
				            System.out.print("Option: ");
					        choice7=input.nextInt();
					        Cleaner Cstaff=new Cleaner();
					
					        if(choice7==1)
							{	
					
						        System.out.print("\nEnter cleaner's name : ");
					            String names=input.next();
					            Cstaff.setName(names);
					   
					            System.out.print("\nEnter ID : ");
					            String Id=input.next();
					            Cstaff.setId(Id);
					   
					            System.out.print("\nEnter Gender : ");
					            char g=input.next().charAt(0); 
					            Cstaff.setGender(g);
					     
          						System.out.print("\nEnter Salary : ");
			        		    double sal=input.nextDouble();
		        			    Cstaff.setSalary(sal);
					            staffobj.addCleaner(Cstaff);
				  	        }
					    
					        else if(choice7==2)
							{	
						        System.out.print("\nEnter cleaner's name to remove: ");
					            String nameo=input.next();
					            staffobj.removeCleaner(staffobj.getCleaner(nameo));
					        }
							
							else if(choice7==3)
							{	
					            staffobj.showCleaners();
						    }
					        else if(choice7==4)
							{	
						        luku4=false;
							}
                            else
                            {								
						        System.out.println("\nInvalid input your available options : (1-4)\n");
							}	 
						}
						
					}	
					
					else if(choice3==5)
					{   boolean luku5=true;
                        while(luku5)
                        {							
					        int choice8=0;
					        System.out.println("  ");
					        System.out.println("  ");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("                      TechnicalStaff      ") ;
				            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n") ;
		                    System.out.println("1. Insert new Technical Staff in list  ") ;
				            System.out.println("2. Remove a Technical Staff from the list ");
		                    System.out.println("3. Show all Technical Staffs of the list");
					        System.out.println("4. GO back .");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("Type the serial NO. assigned above according to your choice\n");
				            System.out.print("Option: ");
					        choice8=input.nextInt();
					        TechnicalStaff Tstaff=new TechnicalStaff();
					    
					
					        if(choice8==1)
					        {   
					   
						        System.out.print("\nEnter Technical Staff's name : ");
					            String namev=input.next();
					            Tstaff.setName(namev);
					   
					            System.out.print("\nEnter ID : ");
					            String Id=input.next();
					            Tstaff.setId(Id);
					   
					            System.out.print("\nEnter Gender : ");
					            char g=input.next().charAt(0); 
					            Tstaff.setGender(g);
					   
					            System.out.print("\nEnter Salary : ");
         					    double sal=input.nextDouble();
		        			    Tstaff.setSalary(sal);
				        	    staffobj.addTechnicalStaff(Tstaff);
					        }
							else if(choice8==2)
							{	
						
						        System.out.print("\nEnter Technical Staff's name to remove: ");
					            String namel=input.next();
					            staffobj.removeTechnicalStaff(staffobj.getTechnicalStaff(namel));
					        } 
						    else if(choice8==3)
							{	
						        staffobj.showTechnicalStaffs();
						    }
						
						    else if(choice8==4)
							{    
                                luku5=false;
                            }								
						    else
							{     	
						        System.out.println("\nInvalid input your available options : (1-4)\n");
							}	
						}
					}	
					
					
                    else if(choice3==6)
				    {   boolean luku6=true;
                        while(luku6)
                        {							
					        int choice9=0;
					        System.out.println("  ");
					        System.out.println("  ");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("                      SecurityGuard      ") ;
				            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n") ;
		                    System.out.println("1. Insert new Security Guard in list  ") ;
				            System.out.println("2. Remove a Security Guard from the list ");
		                    System.out.println("3. Show all Security Guards of the list");
					        System.out.println("4. GO back .");
					        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
				            System.out.println("Type the serial NO. assigned above according to your choice\n");
				            System.out.print("Option: ");
					        choice9=input.nextInt();
					        SecurityGuard Gstaff=new SecurityGuard();
					    
					
					        if(choice9==1)
				        	{   
					   
					            System.out.print("\nEnter Security Guard's name : ");
					            String name=input.next();
					            Gstaff.setName(name);
					   
					            System.out.print("\nEnter ID : ");
					            String Id=input.next();
				         	    Gstaff.setId(Id);
					   
		         			    System.out.print("\nEnter Gender : ");
	          				    char g=input.next().charAt(0); 
	        				    Gstaff.setGender(g);
					   
	         				    System.out.print("\nEnter Salary : ");
	        				    double sal=input.nextDouble();
	        				    Gstaff.setSalary(sal);
	         				    staffobj.addGuard(Gstaff);
					        }
					    
						    else if(choice9==2)
								
							{	System.out.print("\nEnter Security Guard's name to remove: ");
					            String namep=input.next();
					            staffobj.removeGuard(staffobj.getSecurityGuard(namep));
					        }
					
					        else if(choice9==3)
							{	
						        staffobj.showSecurityGuards();
						    }
						
						    else if(choice9==4)
						    {
								luku6=false;
						    }
							else
							{     	
						        System.out.println("\nInvalid input your available options : (1-4)\n");
							}
						}
					}
					
					else if(choice3==7)
					{   
                        option3=false;
                    }						
					
					else
					{	
					    System.out.println("\nInvalid input your available options : (1-7)\n");
					}
                }
            }				
			else if(choice== 4)
			{	boolean luku7=true;
		        while(luku7)
				{	int choice10=0;
			      	System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
			     	System.out.println("                      Facilities     ") ;
	      			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n\n") ;
	    	        System.out.println("1. Available Services  ") ;
	    			System.out.println("2. Available Meds in Pharmacy");
	    	        System.out.println("3. Emergency  ") ;
	     			System.out.println("4. Go back to Main Menu ") ;
	     			System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-") ;
	    			System.out.println("Type the serial NO. assigned above according to your choice\n");
	     			System.out.print("Option: ");
	    			choice10=input.nextInt();
	    			Facility F=new Facility();
	    			if(choice10==1)
				    { 
				    F.showAvailableServices();
				    }	
					
					else if(choice10==2) 
					{	
					F.showAvailableMeds();
					}
					
					else if(choice10==3)
					{	
					    F.emergency();
					}
					
					else if (choice10==4)
					{	
					    luku7=false;
					}	
					
					else
					{
                        System.out.println("\nInvalid input your available options : (1-4)\n");						
					}
				}
            }				
			else if(choice== 5)
			{	
				System.out.println("\nExiting Hospital Management application");
				option=false;
			}
			else 
			{	
				System.out.println("\nInvalid input your available options : (1-5)");
			}			
		}
       
    }
}