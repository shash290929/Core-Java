package AdvanceJava;

public class RunnableInterface {
	public static void main(String[] args) {
		Runnable obj1 = () -> {       // using lambda expression
			for(int i=0;i<5;i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(10);
				}
				catch(Exception e) {
					System.out.print(e);
				}
			}
		};
		B87 obj2 = new B87();
		
		Thread t1 = new Thread(obj1);  // we can give input to Thread class constructor of Runnable thread
		Thread t2 = new Thread(obj2); //we can give input to Thread class constructor of Runnable thread
		
		t1.start();
		t2.start();
		
//		obj1.start();// Now we cant call using start as we are not extending to a thread class we are implemnting it to a runnable interface and it dont have any such method
//		obj2.start();
	}
}

//class A87 implements Runnable{
//	public void run() {
//		for(int i=0;i<5;i++) {
//			System.out.println("Hi");
//			try {
//				Thread.sleep(10);
//			}
//			catch(Exception e) {
//				System.out.print(e);
//			}
//		}
//	}
//}
class B87 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);
			}
			catch(Exception e) {
				System.out.print(e);
			}
		}
	}
}