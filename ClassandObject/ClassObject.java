package ClassandObject;

public class ClassObject {
	public static void main(String[] args) {
		int num1=4;
		int num2=5;
		Calc calc = new Calc();
		int res = calc.add(num1, num2);
		System.out.print(res);
	}
}

class Calc{
	public int add(int n1,int n2) {
		int r=n1+n2;
		return r;
	}
}
