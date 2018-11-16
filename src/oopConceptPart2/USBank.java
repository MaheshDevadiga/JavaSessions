package oopConceptPart2;

public interface USBank {
	
	//Only Method prototype/declaration
	//variables are by default static, cannot change the value of variable.
	//no static method are allowed in interface
	//no main method in interface, we cannot create the object of interface, interface are abstract in nature
	public void credit();
	public void debit();
	public void transferMoney();
	int min_bal=100;//default final and static
}
