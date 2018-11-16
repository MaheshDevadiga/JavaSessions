package oopConceptPart1;

public class LocalVersusGlobal {
	//Global Variables or class variables
	String name="Mahesh";
	int age=28;

	public static void main(String[] args) {
		int i=10;//local variables for main method
		System.out.println("i="+i);
		LocalVersusGlobal obj=new LocalVersusGlobal();
		System.out.println("name="+obj.name);
		System.out.println("age="+obj.age);
	}
	
	public void sum() {
		int i=15;//local variables for sum method
		int j=20;
		int age=25;
	}

}
