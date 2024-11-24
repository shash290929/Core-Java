package AdvanceJava;

public class advanceenum {
	public static void main(String[] args) {
//		Laptop1 lap =Laptop1.Macbook;
//		System.out.print(lap+" : "+lap.getPrice());
//		
		for(Laptop1 lap: Laptop1.values()) {
			System.out.println(lap+" : "+lap.getPrice());
		}
	}
}

enum Laptop1{
	Macbook(2000), XPS(2202), Surface, Thinkpad(1500);
	
	private int price;
	private Laptop1() {
		price = 500;
	}
	private Laptop1(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int new_price) {
		this.price=new_price;
	}
}
