package oopConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj=new FunctionsInJava();//obj is a reference variable; new functions in java is a object
		//after creating the object, the copy of all non-static methods is given to this object
		
		obj.test();
		int a=obj.test1();
		System.out.println("test1 method="+a);

		String s=obj.test2();
		System.out.println("test2 method="+s);
		
		int d=obj.division(40, 20);
		System.out.println("Division Method="+d);
		
		//main method is void never returns a value
	    
	}
	//Non-static methods
	public void test() {//void does not return any value
		System.out.println("Test Method");
	}
	
	public int test1() {//return type integer
		System.out.println("test1 method");
		int a=10;
		int b=20;
		int c=30;
		return c;
	}
	
	public String test2() {//return type string
		System.out.println("Test2 Method");
		String s="Mahesh";
		return s;
	}
	
	public int division(int x,int y) {
		System.out.println("Division Method");
		int d=x/y;
		return d;
	}
}
