package constructor;

public class defaultconstructor {
	public static void main(String[] args) {
		Human obj1 = new Human();
		System.out.print(obj1.Name+" : "+ obj1.age);
	}
}
class Human{
	String Name;
	int age;
	public Human() {
		Name = "Shashank";
		age = 11;
	}
}
