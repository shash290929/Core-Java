package Inheritance;

public class upcastinganddowncasting {
	public static void main(String[] args) {
		A13 obj = new B13(); //upcasting
		obj.show1();
//		obj.show2();// it will give error because the obj is referenced to A and A doesnot know B exists
		
//		B obj1 = obj;// it will give error because you are referecing a superclass referenced object to a subclass reference and
//						and there can be data loss
		
		B13 obj1 = (B13) obj; //downcasting
		obj1.show2();
		
	}
}

class A13{
	public void show1() {
		System.out.println("in A");
	}
}

class B13 extends A13{
	public void show2() {
		System.out.println("in B");
	}
}