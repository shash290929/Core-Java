package Inheritance;

import java.util.Objects;

public class Stringhashcode {
	public static void main(String[] args) {
		Laptop lap =new Laptop();
		lap.Name ="Lenovo";
		lap.price = 1000;
		System.out.println(lap);
		Laptop lap1 =new Laptop();
		lap1.Name ="Lenovo";
		lap1.price = 1000;
		System.out.println(lap.equals(lap1));
		System.out.println(lap);
//		System.out.print(lap.toString());
	}
}

class Laptop{
	String Name;
	int price;
	@Override
	public int hashCode() {
		return Objects.hash(Name, price);
	}
	
}

