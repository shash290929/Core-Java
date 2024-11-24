package Inheritance;

public class wrapperclasses {
	public static void main(String[] args) {
		int num =7;
		Integer num1 = new Integer(num); //boxing
		Integer num2 = num; //boxing
		
		int num3 = num1.intValue(); //unboxing
		int num4 =num1; //auto-unboxing
		
		String str ="12";
		int num5 = Integer.parseInt(str);
		
		
	}
}
