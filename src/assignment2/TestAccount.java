package assignment2;

public class TestAccount {

	public static void main(String[] args) {
		Account a1=new SavingAccount(5000,2);
		a1.calInterest();
		Account a2=new CheckingAccount(5000,2);
		a2.calInterest();

	}

}
