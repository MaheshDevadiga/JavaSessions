package JavaBasics;

public class A {
	
	public A() {
		System.out.println("Parent Class A");
	}

	public A(int i) {
		System.out.println("parent class constructor with i="+i);
	}
	
	public A(int i,int j) {
		System.out.println("parent class constructor with i="+i);
		System.out.println("parent class constructor with j="+j);
	}
}
