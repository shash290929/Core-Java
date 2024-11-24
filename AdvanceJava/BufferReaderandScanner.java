package AdvanceJava;

import java.io.*;
import java.util.*;

public class BufferReaderandScanner {
	public static void main(String[] args) throws IOException {
		System.out.println("sh");
//		int k = System.in.read();  //gives the output as ASCII value
//		
//		System.out.print(k);
		
//		InputStreamReader i = new InputStreamReader(System.in);
//		BufferedReader bf = new BufferedReader(i);
//		
//		int num = Integer.parseInt(bf.readLine());
//		
//		System.out.print(num);
		
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		System.out.print(k);
		
	}
}
