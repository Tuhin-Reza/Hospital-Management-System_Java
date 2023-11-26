public class SalaryAccount extends Account
{
	
	private double InterestRate;
	private double balance;
	private double Salary;
	
	SalaryAccount(String Acc_no,String AccountHolderName,double InterestRate, double balance)
	{
		super(Acc_no,AccountHolderName);
		this. InterestRate= InterestRate;
		this. balance= balance;
	}
	
	public double getInterestRate()
	{
		return  InterestRate;
	}
	public void seInterestRate(double InterestRate)
	{
	    this. InterestRate= InterestRate;
	}
	
	public  double getbalance()
	{
		return  balance;
	}
	public void setbalance( double balance )
	{
	    this. balance= balance;
	}
	
	public  double getSalary()
	{
		return  Salary;
	}
	
	public void setSalary( double Salary)
	{
	    this. Salary= Salary;
	}
	
	
	public double calcInterest()
	{
	 double monthly_InterestRate = (InterestRate*balance);
	 return monthly_InterestRate;
	}
	public   double calcBalanceWithInterest()
	{
		balance=balance+calcInterest();
		return balance;
	}
	
	public  double deposit( double anAmount)
	{
		if (anAmount>0.0)
		balance = balance + anAmount;
		return balance ;
	}
	
	public  double withdraw( double anAmount)
	{
		if ((anAmount>0.0) && (balance>anAmount))
			balance = balance - anAmount;
		return balance ;
	}
	public double calcBalancewithSalarydeposit()
	{
		balance = balance +getSalary();
		return  balance ;
	}

	
public void Show_Details()
	{
		super.Show_Details();
		
		System.out.println("Total Interset: " +calcInterest());
		System.out.println("Interest with Balance: " +calcBalanceWithInterest());	
	}
	

}
