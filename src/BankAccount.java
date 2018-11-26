
public class BankAccount 
{
	//fields
	protected double balance;
	
	//constructors
	public BankAccount()
	{
		balance = 0;
	}
	
	//methods
	public void deposit(double amt)
	{
		balance += amt;
	}
	
	public void withdraw(double amt)
	{
		balance -= amt;
	}
	
	public double getBalance()
	{
		return balance;
	}
}
