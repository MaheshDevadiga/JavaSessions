package oopConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(20);
		obj.sum(20, 15);
		
	}
	
	public static void main(int p) {
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(30);
		obj.sum(30, 15);
	}
	
	public static void main(int p,int q){
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 15);
	}
	public void sum() {
		System.out.println("SUM Method");
	}
	
	public void sum(int i) {//one input parameter
		System.out.print("SUM Method one");
		System.out.println(i);
	}
	
	public void sum(int k, int n) {//two input parameter
		System.out.print("SUM Methid two parameter");
		System.out.println(k+" "+n);
	}
	
	public void sum(double d) {
		System.out.println(d);
	}
//Duplicate Method and nested method is not allowed
}
