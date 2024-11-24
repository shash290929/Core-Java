package AdvanceJava;

public class Threadsafe {
	public static void main(String[] args) {
		count c =  new count();
		
		Runnable obj1 = () ->{
			for(int i=0;i<20000;i++) {
				c.increment();
			}
		};
		
		Runnable obj2 = () ->{
			for(int i=0;i<20000;i++) {
				c.increment();
			}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
		System.out.print(c.counter);
	}
}

class count{
	int counter;
	public synchronized void increment() {
		counter++;
	}
}