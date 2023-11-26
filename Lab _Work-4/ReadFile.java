import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile
{
	public static void main(String[] args)
	{
		try
		{
			FileReader obj1=new FileReader("Test.text");
			Scanner myReader=new Scanner(obj1);
			while ( myReader.hasNextLine())
			{
				String data =myReader.nextLine();
				System.out.println(data);
			}
			
			
		myReader.close();
		}catch(Exception e)
		{
			System.out.println("An error ocured");
			e.printStackTrace();
		}
	}
}