package AdvanceJava;

public class Innerclass {
	public static void main(String[] args) {
		A obj = new A();
		obj.show();
		A.B obj1 = obj.new B(); // we have to use the object of A as this is a inner class it is inside A class and we cant directly access B class
		A.C obj2 = new A.C(); // we can access C like this because C is a static class and can be refer using the outer class without creating object
		
		obj1.show();
		obj2.show();
	}
}

class A{
	public void show() {
		System.out.println("in A");
	}
	class B{
		public void show() {
			System.out.println("in B");
		}
	}
	static class C{
		public static void show() {
			System.out.println("in C");
		}
	}
}