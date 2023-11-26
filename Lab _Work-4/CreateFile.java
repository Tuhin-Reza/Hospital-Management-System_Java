import java.io.File;
import java.io.IOException;

public class CreateFile
{
	public static void main(String[] args)
	{
		try
		{
			File obj1=new File("C:\\Users\\hp.LAPTOP-IHBQ6FD0\\Desktop\\JAVA 1  [X]\\Lab _Work-4\\Test.text");
			if(obj1.createNewFile())
			{
				System.out.println(obj1.getName()+"File Created");
			}
			else
			{
				System.out.println("File already exits");
			}
		}catch(IOException e)
		{
			System.out.println("An error ocured");
			e.printStackTrace();
		}
	}
}