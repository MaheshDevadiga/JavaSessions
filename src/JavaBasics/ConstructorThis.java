package JavaBasics;

public class ConstructorThis {
	//class variables or global variables
	String name;
	int age;
	
	public ConstructorThis(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("name="+this.name);
		System.out.println("age="+this.age);
	}

	public static void main(String[] args) {
		ConstructorThis obj=new ConstructorThis("Tom", 30);
		
	}

}
