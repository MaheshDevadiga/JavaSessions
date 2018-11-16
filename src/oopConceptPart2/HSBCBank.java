package oopConceptPart2;

public class HSBCBank implements USBank, BrazilBank{//multiple inheritance
	//overridden Is - a Relationship -Interface, Has-a Relationship extends class
	public void credit() {
		System.out.println("HSBC Credit");
	}
	
	public void debit() {
		System.out.println("HSBC Debit");
	}
	
	public void transferMoney() {
		System.out.println("HSBC - Transfer Money");
	}
	//hsbc
	public void educationLoan() {
		System.out.println("HSBC - Education Loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC - Car Loan");
	}
	//overridden
	public void mutualFund() {
		System.out.println("HSBC - Mutual Fund");
	}
}
