package AdvanceJava;
import java.util.*;

public class trycatchexceptionhandling {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i= sc.nextInt();
		int j=0;
		try {
			j=18/i;
		}
		catch(Exception e) {
			System.out.println("Wrong input");
		}
		System.out.println(j);
		System.out.println("key");
	}
}
