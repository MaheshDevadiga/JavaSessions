package JavaBasics;

public class StringConcatenation {
	
	public static void main(String args[]) {
		//println = Top print on a console in new line
		//print  = To print on a console
		int a=100,b=200;
		String x="Hello", y="World";
		double c = 12.33;
		double d=10.33;
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		System.out.println(c+d);
		System.out.println(x+y+c+d);
		System.out.println(a);
		System.out.println("The value of a is="+a);
		System.out.println("The value of b is="+b);
		System.out.println("Addition of a and b is="+(a+b));
		System.out.print("He");
		System.out.println("llo");
		
	}

}
