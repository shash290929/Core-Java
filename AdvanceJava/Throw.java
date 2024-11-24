package AdvanceJava;

public class Throw {
	public static void main(String[] args) {
		int j =0;
		int i=20;
		try {
			j=18/i;
			System.out.println(j);
			if(j==0){
				throw new ArithmeticException("I dont want to print 0");
			}
		}
		catch(ArithmeticException e) {
			j=18/1;
			System.out.println(j+" : "+"Default Value "+ e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.print("key");
	}
}
