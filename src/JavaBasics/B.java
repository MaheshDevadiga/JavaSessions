package JavaBasics;

public class B extends A {
	
	public B() {
		super();
		System.out.println("Child class constructor");
	}
	
	public B(int i) {
		super(i);
		System.out.println("Child class constructor");
	}
	
	public B(int i,int j) {
		super(i,j);
		System.out.println("Child class constructor");
	}
	public static void main(String args[]) {
		B obj=new B();
		B obj1=new B(10);
		B obj2=new B(2,3);
	}

}
