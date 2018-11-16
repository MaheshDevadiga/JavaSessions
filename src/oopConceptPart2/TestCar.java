package oopConceptPart2;

public class TestCar {
//Method Overriding- when same method exists in parent class and child class with same name and same number of arguments is called Method Overriding.
	
	public static void main(String[] args) {
		
		//static polymorphism or compile time polymorphism
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refill();
		b.theftSafety();
		b.Engine();
		
		System.out.println("Parent class");
		Car c=new Car();
		c.start();
		c.stop();
		c.refill();
		
		System.out.println("Dynamic");//Top Casting
		Car c1=new BMW();   //child class object can be refered by parent class reference variable is called dynamic or runtime polymorphism
		c1.start();
		c1.stop();
		c1.refill();
		//Downcasting is not possible it gives ClassCastException
	}

}
