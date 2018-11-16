package oopConceptPart1;

public class StaticAndNonStaticConcept {
	//scope of global variables will be available across all the function with some conditions - static or non-static
	String name="Mahesh";//non-static global variable
	static int age=25;//static global variable
	
	public static void main(String[] args) {
		//Call static methods and variables
		sent();//direct
		StaticAndNonStaticConcept.sent();//through class name
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		System.out.println(obj.name);;
		obj.sentMail();
		System.out.println("*******");
		obj.sent();
	}
	
	public void sentMail() {
		System.out.println("Sent mail method");
	}
	
	public static void sent() {
		System.out.println("sent method");
	}

}
