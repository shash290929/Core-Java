package constructor;

public class parameterizedconstructor {
	public static void main(String[] args) {
		Human_new obj1 = new Human_new("Shashank",12);
		System.out.print(obj1.Name+" "+obj1.age);
	}
}
class Human_new{
	String Name;
	int age;
	public Human_new(String Name, int age) {
		this.Name = Name;
		this.age = age;
	}
}
