package oopConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		//If a class is implementing any interface then it is mandatory to define and overwrite all the methods of interface
		HSBCBank hs=new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		System.out.println("Minimum balance="+USBank.min_bal);
		System.out.println("Dynamic Polymorphism");
		//Dynamic Polymorphism - Child class object is referred by Parent class reference variable
		USBank us=new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();
		
	}

}
