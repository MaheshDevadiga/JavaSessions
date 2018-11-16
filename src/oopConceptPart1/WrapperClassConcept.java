package oopConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+200);
		
		//Data Conversion String to Integer
		int i=Integer.parseInt(x);
		System.out.println(i+200);
		
		//Integer, Double,Char and Boolean
		String s="12.44";
		double d=Double.parseDouble(s);
		System.out.println(d+10);
		
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to string
		int j=200;
		System.out.println(j+20);
		String p=String.valueOf(j);
		System.out.println(p+20);
		
		String u="100a";
		int g=Integer.parseInt(u);
		System.out.println(g);
	}

}
