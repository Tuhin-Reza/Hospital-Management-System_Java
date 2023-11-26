public class SavingsAccount extends BankAccount
{
	private double annual_InterestRate;
	private double  monthly_InterestRate;
	
	public  SavingsAccount(String account_number,double balance,double annual_InterestRate)
	{
		super(account_number,balance);
		this.annual_InterestRate=annual_InterestRate;
	}

	public void calculatesInterest()
	{
	    monthly_InterestRate = ( annual_InterestRate / 12);
        monthly_InterestRate= balance * monthly_InterestRate ;
		balance = balance +  monthly_InterestRate;
		System.out.println("Add this interest with balance every month: " +balance);
	}
	public void display_calculatesInterest()
	{
		//super.display_BankAccount();
		System.out.println("Add this interest with balance every month: " +monthly_InterestRate);
	}

} 