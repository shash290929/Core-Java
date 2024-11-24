package AdvanceJava;

public class MultipleThreads {
	public static void main(String[] args) {
		A89 obj1 = new A89();
		B89 obj2 = new B89();
		
		System.out.println(obj1.getPriority());
		
		obj2.setPriority(Thread.MAX_PRIORITY); // this will suggest the scheduler, it still depends on scheduler to run which thread first
		
		obj1.start();
		try {
			Thread.sleep(10);                // it is a checked exception
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		obj2.start();
	}
}

class A89 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("hi");
			try {
				Thread.sleep(10);                // it is a checked exception
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}

class B89 extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("hello");
			try {
				Thread.sleep(10);                // it is a checked exception
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
}