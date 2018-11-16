package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		//Dynamic Arrray => ArrayList
		//contain duplicate values
		//Maintains the insertion order
		//Not synchronized
		//random access to fetch any element because it stores the values on the basis of indexes
		//ar.size => array size and ar.get to fetch array values based on index
		ArrayList ar=new ArrayList();
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		System.out.println("Array List size="+ar.size());
		ar.add(40);//3
		ar.add(50);//4
		System.out.println("Array List size="+ar.size());
		ar.add(50);
		System.out.println("Array List size="+ar.size());
		ar.add(12.33);
		ar.add("Test");
		ar.add(true);
		ar.add('c');
		System.out.println("Array 4="+ar.get(4));
		for(int i=0;i<ar.size();i++) {
			System.out.println("Array Values= "+ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(12);
		ar1.add(13);
		//Non-generic vs generics
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Mahesh");
		ar2.add("Raj");
		ar2.add("Maya");
		
		System.out.println("Array 2 Size=  "+ar2.size());
		
		ArrayList<String> ar3=new ArrayList<String>();
		ar3.add("Selenium");
		ar3.add("WebDriver");
		
		System.out.println("Array 3 Size=  "+ar3.size());
		
		ar2.addAll(ar3);
		
		System.out.println("Array 3 added to Array 2 Size=  "+ar2.size());
		for(int i=0;i<ar2.size();i++) {
			System.out.println("Array List 2 Elements= "+ar2.get(i));
		}
		//removeall
		ar2.removeAll(ar3);
		System.out.println("Array 3 removed from Array 2 Size=  "+ar2.size());
		for(int i=0;i<ar2.size();i++) {
			System.out.println("Array List 2 Elements= "+ar2.get(i));
		}
		
		//RetainAll
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("Tiger");
		ar5.add("Lion");
		ar5.add("Giraffe");
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("Tiger");
		ar6.add("Deer");
		ar6.add("Jackal");
		
		ar5.retainAll(ar6);
		System.out.println("Array 5 Size="+ar5.size());
		for(int i=0;i<ar5.size();i++) {
			System.out.println("Array 5 Values="+ar5.get(i));
		}
		
		Employee e1=new Employee("Mahesh", 28, "Test");
		Employee e2=new Employee("Peter", 25, "Development");
		Employee e3=new Employee("Naveen", 30, "devOPs");
		
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		System.out.println("Iterator to traverse the values");
		Iterator<Employee> it=ar4.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//addAll() Method
	}

}
