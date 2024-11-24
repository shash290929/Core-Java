package AdvanceJava;

public class MoreonInterface {
	public static void main(String[] args) {
		X obj1 = new Z();
		obj1.fly();
//		obj1.run();// obj1 doesnot have any method run because it is referenced to X
		Y obj2 = new Z();
		obj2.run();
		E obj3= new E();
		obj3.run();
	}
}

interface X{
	void fly();
}
interface Y{
	void run();
}
class Z implements X,Y{
	public void fly() {
		System.out.println("flying...");
	}
	public void run() {
		System.out.println("running...");
	}
}
interface D extends Y{
	
}

class E implements D{ // even D doesnot have any method inside it but since it extends Y we need to have the methods of Y while implementing D
	public void run() {
		System.out.println("running...");
	}
}