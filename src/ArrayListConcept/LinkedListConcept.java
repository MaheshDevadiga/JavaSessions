package ArrayListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		
		//add
		l1.add("Mahesh");
		l1.add("Nagesh");
		l1.add("Devadiga");
		l1.add("Suresh");
		System.out.println("contents of linked list="+l1);
		l1.addFirst("Sumathi");
		l1.addLast("Bharatesh");
		System.out.println("contents of linked lists="+l1);
		
		//get
		System.out.println("O="+l1.get(0));
		System.out.println(l1.get(1));
		l1.set(0, "Satish");
		System.out.println("0="+l1.get(0));
		System.out.println("*******************************************");
		System.out.println("Linked List contents= "+l1);
		l1.removeLast();
		l1.removeFirst();
		System.out.println("Linked List contents=  "+l1);
		l1.remove(2);
		System.out.println("Linked List contents=  "+l1);
		//How to print - Using For Loop, Advanced For Loop, Iterator and While Loop
		System.out.println("Using for loop---------------");
		for(int i=0;i<l1.size();i++) {
			System.out.println("l1= "+l1.get(i));
		}
		System.out.println("Using advanced for loop");
		for(String str:l1) {
			System.out.println("Advanced For Loop= "+str);
		}
		System.out.println("Iterator**************************");
		Iterator<String> it=l1.iterator();
		while(it.hasNext()) {
			System.out.println("while= "+it.next());
		}
		System.out.println("Using While Loop");
		int num=0;
		while(l1.size()>num) {
			System.out.println(l1.get(num));
			num++;
		}
	}

}
