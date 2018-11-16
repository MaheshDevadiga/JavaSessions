package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {
//Hash Table => Key Value
	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put("A", "Test");
		h.put("B", "World");
		h.put("C", "World");
		System.out.println("Hsize="+h.size());
		h.put(1, 100);
		h.put(2, 200);
		h.put(3, 300);
		System.out.println("Hsize="+h.size());
		System.out.println(h.get(1));
		h.put(1, "Jai");
		System.out.println(h.get(1));
		
		Hashtable<Integer, Integer> ht=new Hashtable<Integer,Integer>();
		ht.put(1, 100);
		ht.put(2, 200);
		ht.put(3, 300);
		ht.put(4, 400);
		ht.put(5, 500);
		ht.put(6, 600);
		ht.remove(1);
		ht.remove(4, 400);
		for(int i=1;i<=6;i++) {
			System.out.println(ht.get(i));
		}
		Hashtable<Integer, String> hs=new Hashtable<Integer,String>();
		hs.put(1, "Mahesh");
		
	}

}
