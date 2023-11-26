import java.util.Scanner;

class Myclass
{
	public static void main(String[] args)
	{
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter ur name,age and salary:");
		
	    String name=myobj.nextLine();
		int age=myobj.nextInt();
		double salary=myobj.nextDouble();
		
		System.out.println("NAME:" +name);
		System.out.println("AGE:" +age);
		System.out.println("SALARY:" +salary);
	}
}