package AdvanceJava;
import java.util.*;

public class trywithmultiplecatch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();
		int j =0;
		int[] ar = new int[5]; 
		try {
			j=18/i;
			System.out.print(ar[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("stay in your limit");
		}
		catch(ArithmeticException e) {
			System.out.println("Wrong input");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(j);
	}
}
