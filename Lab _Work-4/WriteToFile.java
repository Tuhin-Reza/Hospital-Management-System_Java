import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ur name");
			String name=sc.nextLine();
			FileWriter obj1= new FileWriter("Test.text");
			obj1.write(name);
			System.out.println("Successfull");
			
			
		obj1.close();
		}catch(Exception e)
		{
			System.out.println("An error ocured");
			e.printStackTrace();
		}
	}
}