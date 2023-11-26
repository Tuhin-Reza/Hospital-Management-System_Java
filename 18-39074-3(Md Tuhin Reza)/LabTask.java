import java.util.Scanner;
import java.lang.*;

public class LabTask
{
	public static void main(String args[])
	{
		Scanner myObj=new Scanner(System.in);
		
		System.out.println("Enter your string1");
		String s1=myObj.nextLine();
		
		System.out.println("Enter your string2");
		String s2=myObj.nextLine();
		
		String s3=s1.concat(s2);
		System.out.println(s3);  
		
		String s4=s3.substring(6,11);
		System.out.println(s4);  
		
		if(s1.equals(s2))
		{
			System.out.println("They are Equals");
		}
		else
		{
			System.out.println("They are not Equals");
		}
		
		s3=s3.toUpperCase();
		System.out.println(s3);
		
		System.out.println(s3.charAt(5));
		System.out.println(s3.indexOf("i"));
		
	}
}