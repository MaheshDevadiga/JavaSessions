package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println("Length="+ar.size());
		ar.add(400);
		ar.add(500);
		ar.add(600);
		System.out.println("Length="+ar.size());
		ar.remove(5);
		System.out.println("Length="+ar.size());
		ar.add("Mahesh");
		ar.add(12.34);
		ar.add('c');
		ar.add(true);
		System.out.println("Length="+ar.size());
		
		System.out.println(ar.get(8));
		System.out.println("Print all the values of array list");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println("Values="+ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Mahesh");
		ar2.add("Devadiga");
		
	}

}
