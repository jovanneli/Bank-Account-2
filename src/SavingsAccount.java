
public class SavingsAccount extends BankAccount
{
	//fields
	public final double INT_RATE = 0.25;
	
	//methods
	public void addInterest()
	{
		deposit (INT_RATE * getBalance());
	}
}
