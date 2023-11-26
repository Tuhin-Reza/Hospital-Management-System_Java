package hms;
import java.lang.*;
import java.io.*; 
import interfaces.*;
public class Service extends TheAbstractClass
{
	
	
	public void showAvailableServices()
	{
		try{
		FileReader frd = new FileReader("serviceinfo.txt");
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