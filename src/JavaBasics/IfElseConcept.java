package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30,b=20;
		if(b>a){
			System.out.println("b"+b);
		} else {
			System.out.println("a"+a);
		}
		
		//comparison operators
		int c=50,d=40;
		if(c==d){
			System.out.println("c and d is equal");
		} else {
			System.out.println("c and d is not equal");
		}
		int a1=400,b1=600,c1=300;
		if (a1>b1 && a1>c1) {
			System.out.println("a1"+a1);
		} else if(b1>c1) {
			System.out.println(b1);
		} else {
			System.out.println(c1);
		}
	}

}
