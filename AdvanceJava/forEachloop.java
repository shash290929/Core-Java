package AdvanceJava;

import java.util.*;
import java.util.function.Consumer;

public class forEachloop {
	public static void main(String[] args) {
		List<Integer> ar = Arrays.asList(1,2,3,4,5);
		
		//M-1 for getting all the element
		for(int i=0;i<ar.size();i++) {
			System.out.print(ar.get(i)+" ");
		}
		
		System.out.println("New method");
		
		//M-2
		for(int n:ar) {
			System.out.print(n+" ");
		}
		
		System.out.println("New method");
		
		//M-3
		ar.forEach(n-> System.out.print(n+" "));
		
		
		//Understanding how forEach works
		
		Consumer<Integer> con = new Consumer<>() {
			public void accept(Integer n) {
				System.out.print(n);
			}
		};
		
		        //OR since it is a functional interface we can use lambda
		
		Consumer<Integer> con1 = n -> System.out.print(n);
		
		ar.forEach(con1); // for Each takes a Consumer interface as a input which is FunctionalInterface
		
		//or
		
		ar.forEach(n -> System.out.print(n));  // if you see line 25 and this line is same 
		
	}
}
