package Inheritance;

public class finalkeyword {
	public static void main(String[] args) {
		final int a =5;
//		a=10; we cannot change the value of final variable
		
		
	}
}

//final class A{
class A12{
//	public final void show() { // if we give final in method we will not able to to override it in class B
	public void show() {
		System.out.println("in A");
	}
}

class B12 extends A12{ /// if i make class A as final class A we will not able to extend B to A
	public void show() {
		System.out.println("in B");
	}
}