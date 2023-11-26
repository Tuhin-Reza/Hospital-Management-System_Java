public class SalaryAccount extends BankAccount
{
	private double salary;
	
	public  SalaryAccount (String account_number,double balance,double salary)
	{
		super(account_number,balance);
		this.salary=salary;
	}
	 public void deposit(double depositAmount)
  {
    balance+= depositAmount+salary;
  }
	public void SalaryAccount_display()
	{
		System.out.println("Monthly Balance:" +balance);
	}
	
}
