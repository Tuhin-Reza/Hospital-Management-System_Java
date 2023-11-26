public class Account
{
	protected String Acc_no;
	protected String  AccOwnerName;
	protected String AccountHolderName;
	
	Account(String Acc_no,String AccountHolderName)
	{
		this.Acc_no=Acc_no;
		this.AccountHolderName=AccountHolderName;
	}
	
	public String getAcc_no()
	{
		return  Acc_no;
	}
	public void setAcc_no( String Acc_no)
	{
	    this.Acc_no=Acc_no;
	}
	
	public String getAccountHolderName()
	{
		return AccountHolderName;
	}
	
	public void setAccountHolderName(String AccountHolderName)
	{
	   this.AccountHolderName=AccountHolderName;
	}
	
	public void Show_Details()
{
	System.out.println("Account Number: "+getAcc_no());
	System.out.println("Account Holder Name: "+getAccountHolderName());
}	
}