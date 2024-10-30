package encapsulation;

public class encapsulationintro {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.setage(12);
		h1.setname("Shash");
		System.out.print(h1.getage()+" "+h1.getName());
	}
}

class Human{
	private int age;
	private String name;
	public void setage(int a) {
		age=a;
	}
	public void setname(String n) {
		name=n;
	}
	public int getage() {
		return age;
	}
	public String getName() {
		return name;
	}
}