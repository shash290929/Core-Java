package AdvanceJava;

public class anonymousinnerclass {
	public static void main(String[] args) {
		A21 obj1 = new A21();
		A21 obj2 = new A21() {
			public void show() {
				System.out.println("in new Class");
			}
		};
		obj1.show();
		obj2.show();
		B21 obj3 = new B21() {
			public void show() {
				System.out.println("in B");
			}
			public void fly() {
				System.out.println("flying..");
			}
		};
		obj3.show();
		obj3.fly();
		
	}
}

class A21{
	public void show() {
		System.out.println("in A");
	}
}

abstract class B21{
	public abstract void show();
	public abstract void fly();
}
