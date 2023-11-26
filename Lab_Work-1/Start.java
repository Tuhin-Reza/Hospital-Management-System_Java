import java.lang.*;

public class Start
{
	public static void main(String []args)
	{
		
		Account a1 = new Account(111111111,"OOP1 G",2010.0);
		Account a2 = new Account(111111112,"OOP2 G",2020.0);
		Account a3 = new Account(111111113,"OOP3 G",2030.0);
		
		
		Customer c1 = new Customer("+88012345678890",5000);
	    c1.create(a1);
		c1.create(a2);
		c1.create(a3);
		c1.showDetails();
		
		/*6 
		System.out.println("----------------------------------------");
		Account a2 = new Account(22222222, "OOP1 C", 2500.0);
		Customer c2 = new Customer("+88019876543221", a2);
		
		System.out.println("Customer PhnNumber: "+c2.getPhnNumber());
		System.out.println("Customer Account Number: "+c2.getAccount().getAccountNumber());
		System.out.println("Customer Account Holder Name: "+c2.getAccount().getAccountHolderName());
		System.out.println("Customer Balance: "+c2.getAccount().getBalance());*/
		
	}
}




