package assignment2;

public class CheckingAccount extends Account{
 public CheckingAccount(int p,int t)
 {
	 super(p,t);
 }
 public void calInterest()
 {
	 double si=(super.getP()*10*super.getT())/100;
	 System.out.println("Interest amount for checking account is "+si);
 }
}
