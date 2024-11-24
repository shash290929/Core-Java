package AdvanceJava;

public class Interface {
	public static void main(String[] args) {
		A13 obj = new B13();
		obj.show();
		obj.fly();
		
		System.out.println(A13.name+" : "+A13.age);
	}
}
interface A13{
	String name = "Shashank Raj"; // in interface the variables are by default static and final
	int age = 25;
	void show(); // in interface methods are public and abstract by default
	void fly();
}

class B13 implements A13{
	public void show() {
		System.out.println("Show...");
	}
	public void fly() {
		System.out.println("fly...");
	}
}