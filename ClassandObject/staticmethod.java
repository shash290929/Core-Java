package ClassandObject;

public class staticmethod {
	public static void main(String[] args) {
		phone p1 = new phone();
		phone p2 = new phone();
		p1.color="Red";
		p1.type="Smart";
		p2.color="Black";
		p2.type="Old";
		phone.show1(p1);
		phone.show1(p2);
	}
}

class phone{
	String color;
	String type;
	static int price;
	public void show() {
		System.out.println(color+" "+type+" ");
	}
	public static void show1(phone p) {
		System.out.println(p.color+" "+p.type+" "+price);
	}
}