public class BankAccount
{
	protected String account_number;
	protected double balance;
	
public BankAccount(String account_number,double balance)
{
	this.account_number= account_number;
	this.balance=balance;
}
 public void display_BankAccount()
{
	System.out.println("Account Number: "+this.account_number);
	System.out.println("Balance: "+this.balance);
}
	
	
}
	
