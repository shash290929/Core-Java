package ClassandObject;

public class methodoverloading {
	public static void main(String[] args) {
		calculator calc = new calculator();
		int sum1 = calc.add(1,2,3);
		int sum2 = calc.add(1,2);
		double sum3 = calc.add(1,2);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}
}

class calculator{
	public int add(int a1,int a2,int a3) {
		return a1+a2+a3;
	}
	public int add(int a1,int a2) {
		return a1+a2;
	}
	public double add(double a1, double a2) {
		return a1+a2;
	}
}
