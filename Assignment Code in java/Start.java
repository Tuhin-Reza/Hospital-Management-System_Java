public class Start
{
	public static void main(String[] args)
	{
	 SavingAccount a2=new SavingAccount("SA111","BBA_AIUB",0.05,3500.0);
	a2.Show_Details();
	
	a2.deposit(5000.0);
	System.out.println("Balance of Saving Account After Deposit: " +a2.getbalance());
	
	a2.withdraw(3000.0);
	System.out.println("Balance of Saving Account After Withdraw: " +a2.getbalance());
	
	SalaryAccount a1=new SalaryAccount("SA222","CS_AIUB",0.03,5000.0);
	a1.Show_Details();
	
	a1.deposit(3000.0);
	System.out.println("Balance of Salary Account After Deposit: " +a1.getbalance());
	
	a1.withdraw(1500.0);
	System.out.println("Balance of Salary Account After Withdraw: " +a1.getbalance());
	
	a1.setSalary(25000.0);
	System.out.println("Balance of Salary Account After Salary Deposit: " +a1.calcBalancewithSalarydeposit());
	
	
	
	
	
	
	
	}
}