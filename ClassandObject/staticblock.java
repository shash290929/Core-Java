package ClassandObject;

public class staticblock {
	public static void main(String[] args) throws ClassNotFoundException {
		Mobile m1 = new Mobile();
		Mobile m2 = new Mobile();
		//Class.forName("Mobile");
	}
}

class Mobile{
	String color;
	int price;
	static String name;
	static { // only initializing the 
		System.out.println("inside static block");
		name="phone";
	}
	public Mobile() {
		System.out.println("inside constructor");
		price=200;
		color="";
	}
}