package oopConceptPart1;

public class Car {
	
	//Class variables
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		//new Car() This is object of car class
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		a.mod=2015;
		a.wheel=4;
		b.mod=2014;
		b.wheel=4;
		c.mod=2013;
		c.wheel=4;
		System.out.println("Before Assigning the references");
		System.out.println("a.mod"+a.mod);
		System.out.println("a.wheel"+a.wheel);
		System.out.println("b.mod"+b.mod);
		System.out.println("b.wheel"+b.wheel);
		System.out.println("c.mod"+c.mod);
		System.out.println("c.wheel"+c.wheel);
		System.out.println("After shifting the references");
		a=b;
		b=c;
		c=a;
		a.mod=10;
		System.out.println("a.mod"+a.mod);
		System.out.println("c.mod"+c.mod);
		c.mod=20;
		System.out.println("c.mod"+c.mod);
		System.out.println("a.mod"+a.mod);
		
	}

}
