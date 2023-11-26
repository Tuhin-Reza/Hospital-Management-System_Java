
public class TestEncapsulation 
{     
    public static void main (String[] args)  
    { 
        Encapsulate obj = new Encapsulate(); 
      
        obj.setName("Harsh"); 
        obj.setAge(19); 
        obj.setRoll(51); 
          
        System.out.println("Geek's name: " + obj.getName()); 
        System.out.println("Geek's age: " + obj.getAge()); 
        System.out.println("Geek's roll: " + obj.getRoll()); 
              
    } 
} 
