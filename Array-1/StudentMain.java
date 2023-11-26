public class StudentMain
{

	public static void main(String[] args)
	{
		
		Student students[]=new Student[4];
	   Student st1= new Student("Karim", "20-00001-2", 4.0,"cgpa");
	   Student st2= new Student("Rahim", "20-00002-1", 3.9,"cgpa");
	   Student st3= new Student("Tuhin", "20-00002-3", 3.0,"cgpa");
        
	 students[0]  =st1;  
     students[1]  =st2; 
	  students[2]  =st3;
     
	   for(int i=0; i<4; i++)
		{
			if(students[i] != null)
			{
				System.out.println("------------------");
				System.out.println("Student["+i+"] NAME: "+students[i].name);
				System.out.println("Student["+i+"]ID: "+students[i].id);
				System.out.println("Student["+i+"] CGPA: "+students[i].cgpa);
				System.out.println("Student["+i+"] DEPARTMENT: "+students[i].department);
				System.out.println();
			}
			else
			{
				System.out.println("------------------");
				System.out.println("There is No Object in students ["+i+"]");
			}
		 
		}
	
	     
			
		

		
		 for(int i=0; i<4; i++)
		{
			 if(students[i] ==st3 )
			 {
			   students[i]=null;
			 }
			 
			  if(students[i]!=null)
			 {
				System.out.println("------------------");
				System.out.println("Student["+i+"] NAME: "+students[i].name);
				System.out.println("Student["+i+"]ID: "+students[i].id);
				System.out.println("Student["+i+"] CGPA: "+students[i].cgpa);
				System.out.println("Student["+i+"] DEPARTMENT: "+students[i].department);
				System.out.println();
			
			 }
			 else
			 {
				System.out.println("------------------");
				System.out.println("There is No Object in students ["+i+"]");
			 }
			
		 
		}
	}	
}

