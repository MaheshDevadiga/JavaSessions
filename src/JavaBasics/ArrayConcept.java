package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array: To store similar data types values in array variable
		
		//Disadvantages of array : Size is fixed to overcome we use collections -ArrayList or HashTable
		//Similar Data Types : only one type can store- To overcome this problem Object array
		
		//1. Integer Array
		int i[]= new int[4];
		i[2]=30;
		i[0]=10;
		i[1]=2;
		i[3]=9;
		System.out.println(i[3]);
		System.out.println(i.length);
		for(int j=0;j<i.length;j++) {
			System.out.println("i[j]="+i[j]);
		}
		
		//2. Double Array
		double d[]=new double[3];
		d[0]=12.2;
		d[1]=3.8;
		d[2]=9.8;
		System.out.println(d[2]);
		
		//3. Char Array
		char c[]=new char[3];
		c[0]='a';
		c[1]='r';
		c[2]='@';
		
		//4.boolean 
		boolean b[]=new boolean[3];
		b[0]=true;
		b[1]=false;
		b[2]=true;
		
		//5.String 
		String s[]=new String[3];
		s[0]="Mahesh";
		s[1]="Nagesh";
		s[2]="Wordl";
		
		System.out.println("s"+s.length);
		System.out.println("s[1]"+s[1]);
		
		//Object Array: Object is a class Object array is used to store different data types values
		
		Object ob[]=new Object[7];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='M';
		ob[5]="London";
		ob[6]=true;
		System.out.println(ob[5]);
		System.out.println(ob[6]);
		System.out.println(ob.length);
		for(int ik=0;ik<ob.length;ik++) {
			System.out.println(ob[ik]);
		}
		
		
		
		
		
		
		
	}

}
