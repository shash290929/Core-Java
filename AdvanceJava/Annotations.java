package AdvanceJava;

public class Annotations {
	public static void main(String[] args) {
		B41 obj = new B41();
		obj.showthemessagesintheclass();
	}
}
class A41{
	public void showthemessagesintheclass() {
		System.out.println("in A");
	}
}
class B41 extends A41{
	@Override
	public void showthemessagesintheclass() {
		System.out.println("in B");
	}
}