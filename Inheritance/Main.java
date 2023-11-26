public class Main
{
	public static void main(String args[])
	{
		BankAccount obj1=new BankAccount("T123456",500);
		obj1.display_BankAccount();
		
		SavingsAccount obj2=new SavingsAccount("T123456",500,0.12);
		obj2.calculatesInterest();
		obj2. display_calculatesInterest();
		
		 SalaryAccount obj3=new  SalaryAccount("T123456",500,2000.0);
		 obj3.deposit(3000);
		 obj3.SalaryAccount_display();
	}
}