import java.lang.*;

public class Customer
{
	private String phnNumber;
	Account[] account;
	
	public Customer()
	{
		System.out.println("Empty Customer");
	}
	public Customer(String phnNumber,int sizeofArray)
	{
		//System.out.println("Para Customer");
		this.phnNumber = phnNumber;
		account = new Account[sizeofArray];
	}
	public void setPhnNumber(String phnNumber)
	{
		this.phnNumber = phnNumber;
	}
	
	public void create(Account a)
	{
		for(int i=0;i<3;i++)
		{
			if(account[i] == null)
			{
				account[i]=a;
				break;
			}
			else
			{
				//System.out.println("Can Not Find Any New Account");
			}
		}
		
	}
	
	public void showDetails()
	{
		for(int i=0;i<3;i++)
		{
			if(account[i] != null)
			{
		
		        System.out.println("Customer Phn Number: "+phnNumber);
		        /*System.out.println("Customer Account Number: "+account.getAccountNumber());
		        System.out.println("Customer Account Holder Name: "+account.getAccountHolderName());
		        System.out.println("Customer Account Balance: "+account.getBalance());*/
		        account[i].showDetails();
				System.out.println("-----------------------------------");
	
			}
			else
			{
				System.out.println("Can Not Find Any Account Object");
			}
		}
		
	}
	public String getPhnNumber(){return phnNumber;}
}