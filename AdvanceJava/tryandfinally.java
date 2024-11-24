package AdvanceJava;

public class tryandfinally {
	public static void main(String[] args) {
		int i=0;
		// we need to print bye at the end of this 
		try {
			int j=18/i;
//			System.out.print("Bye"); // if we add it here then if the above line throws exception it will not print Bye.
		}
		catch (Exception e) {
			System.out.println("Something is wrong"+ e);
//			System.out.print("Bye"); // if we add it here then if line 8 doesnot throw exception this will not print Bye
		}
		finally {
			System.out.print("Bye");
		}
	}
	
}
