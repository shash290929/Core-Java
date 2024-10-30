package Inheritance;

public class Inheritance {
	public static void main(String[] args) {
		extradvncalc obj =new extradvncalc();
		int sum = obj.add(3,4);
		int diff = obj.sub(5,1);
		int mul = obj.multiply(2,3);
		int div = obj.division(4,2);
		double pow = obj.power(4,2);
		System.out.print(sum+" "+diff+" "+mul+" "+div+" "+pow);
	}
}
