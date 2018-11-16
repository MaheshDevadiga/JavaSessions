package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		//1. While Loop
		int i=0;//initialization
		while(i<1) {//conditional
			System.out.println(i);
			i++;//incremental or decremental 
		}//Disadvantage - Generates infinite loop 
		System.out.println("*****************");
		//2.For Loop
		for(int j=1;j<=1;j++) {//initialization;conditional;incremental
			System.out.println(j);
		}
		//print 10 to 1
		for(int k=10;k>=-10;k--){
			System.out.println(k);
		}
	}

}
