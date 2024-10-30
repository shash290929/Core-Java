package Inheritance;

public class DynamicMethoddispatch {
	public static void main(String[] args) {
		A11 obj = new A11();
		obj.show();
		
		obj =new B11();
		obj.show();
		
		obj =  new C11();
		obj.show();
	}
}

class A11{
	public void show(){
		System.out.println("in A");
	}
}

class B11 extends A11{
	public void show() {
		System.out.println("in B");
	}
}

class C11 extends B11{
	public void show() {
		System.out.println("in C");
	}
}