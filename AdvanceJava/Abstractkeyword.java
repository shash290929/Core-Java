package AdvanceJava;

public class Abstractkeyword {
	public static void main(String[] args) {
//		Car obj =new Car(); // we cannot create an object of abstract class but we can use as a reference
//		Car obj = new WagonR(); // since we have made WagonR also abstarct we can create object of WagonR
		Car obj = new advanceWagonR();
		obj.fly();
	}
}

abstract class Car{
	public abstract void drive();
	public abstract void fly();
	public void playmusic() {
		System.out.println("play music..");
	}
}

abstract class WagonR extends Car{
	public void drive(){
		System.out.println("Driving...");
	}
}

class advanceWagonR extends WagonR{
	public void fly() {
		System.out.print("flying...");
	}
}