package Inheritance;

public class overriding {
	public static void main(String[] args) {
		advcalculator obj1 = new advcalculator();
		System.out.print(obj1.add(3,4));
	}
}

class calculator{
	public int add(int a,int b) {
		return a+b;
	}
}
class advcalculator extends calculator{
	public int add(int a,int b) {
		return a+b+1;
	}
}