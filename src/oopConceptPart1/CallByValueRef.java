package oopConceptPart1;

public class CallByValueRef {
	int p,q;

	public static void main(String[] args) {
		CallByValueRef obj=new CallByValueRef();
		int x=10,y=20;
		int a=obj.testSum(x, y);//Call by Value or Pass By Value
		System.out.println("a="+a);
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		System.out.println("Obj.p="+obj.p+"   Obj.q="+obj.q);
	}
	
	public int  testSum(int a,int b) {
		a=30;
		b=40;
		int c= a+b;
		return c;
	}
	
	public void swap(CallByValueRef t) {
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
	}

}
