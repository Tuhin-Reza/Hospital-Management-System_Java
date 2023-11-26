package hms;
import employee.*;
import java.util.*;
import java.lang.*;
import java.io.*; 
import interfaces.*;
public class HospitalManagement implements DoctorsManage
{   
    private DoctorsInfo Doctors[] = new DoctorsInfo [15]  ;
	

	
	public void addPatientsInfo(PatientsInfo p)
	{
		try{
		FileReader frd = new FileReader("patientsrecord.txt");
		BufferedReader reader= new BufferedReader(frd);
		int linecount=0;
		String s=null;
		
		while((s=reader.readLine())!=null)
			{ linecount++;
		     
		    }
		reader.close();
		
		FileWriter writer = new FileWriter("patientsrecord.txt",true);
	    BufferedWriter bwr= new BufferedWriter(writer);
		PrintWriter pwr= new PrintWriter(bwr);
			
			
		pwr.println("  "+linecount+"       "+p.getName()+"                    "+p.getDOB()+"           "+p.getGender()+"       "+p.getType()+"          "+p.getDisease()+"              "+p.getDoc());
		    
		pwr.flush();
	    pwr.close();
		}
		catch(IOException e){
			e.printStackTrace();
           System.out.println("An error occurs");
        }
		System.out.println("has been added successfully");
	}
	
	public void showPatientsInfo()
	{ 
	    try{
		FileReader frd = new FileReader("patientsrecord.txt");
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
	
	public void addDocsInfo(DoctorsInfo d)
	{
		try{
		FileReader frd = new FileReader("patientsrecord.txt");
		BufferedReader reader= new BufferedReader(frd);
		int linecount=0;
		String s=null;
		
		while((s=reader.readLine())!=null)
			{ linecount++;
		     
		    }
		reader.close();
		
		FileWriter writer = new FileWriter("doctorsrecord.txt",true);
	    BufferedWriter bwr= new BufferedWriter(writer);
		PrintWriter pwr= new PrintWriter(bwr);
			
			
		pwr.println(" "+linecount+"              "+d.getId()+"            "+d.getName()+"                    "+d.getRoomNo()+"         "+d.getSalary());
		    
		pwr.flush();
	    pwr.close();
		}
		catch(IOException e){
			e.printStackTrace();
           System.out.println("An error occured while adding information");
        }
	}
	public void insertDoc(DoctorsInfo d)
	{ 
	    int flag=0;
		for(int i=0;i<Doctors.length;i++)
		{ if(Doctors[i]==null)
			{ Doctors[i]=d;
		      flag=1;
			  break;
			} 
	    }
		if(flag==1)
		{ System.out.println("New doctor's info has been inserted into record");
	    }
        else 
		{ System.out.println("can not insert!");	
		}
	}
    public void removeDoc(DoctorsInfo d)
    {   int flag=0;
	    for(int i=0;i<Doctors.length;i++)
		{   if(Doctors[i].getId().equals(d.getId()))
			{  Doctors[i]=null;
		       flag=1;
			   break;
			}   
		}
        if(flag==1)
		{ System.out.println("Doctor has been removed from the list");
		}	
		else 
		{ System.out.println("can not remove!");	
		}
	}
	
	public DoctorsInfo getDoc(String id)
	{ 
	    DoctorsInfo d=null;
	    for(int i=0;i<Doctors.length;i++)
	    {    if(Doctors[i]!=null)
			{   if(Doctors[i].getId().equals(id))
				{   d=Doctors[i];
			        break;
				}
			}
		}
		return d;
	}	
	
	public void showDocsInfo()
	{ 
	    try{
		FileReader frd = new FileReader("doctorsrecord.txt");
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
	
}