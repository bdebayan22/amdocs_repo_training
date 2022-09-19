package assignment2;

public class SavingAccount extends Account{
	public SavingAccount(int p,int t)
	{
		super(p,t);
	}
public void calInterest()
{
	double si=(super.getP()*5*super.getT())/100;
	System.out.println("Interest amount for saving account is "+si);
}
}
