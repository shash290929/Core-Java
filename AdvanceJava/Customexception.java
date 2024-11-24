package AdvanceJava;

public class Customexception {
	public static void main(String[] args) {
		int i=20;
		try {
			int j=18/i;
			if(j==0) 
				throw new ShashankException("want more than 0");
		}
		catch(ShashankException e) {
			System.out.print(e);
		}
	}
}

class ShashankException extends Exception{
	public ShashankException(String s) {
		super(s);
	}
}
