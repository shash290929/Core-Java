package AdvanceJava;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> ar = Arrays.asList(1,2,3,4,5,6);
		
		Stream<Integer> s1 = ar.stream();
		Stream<Integer> s2 = s1.filter(n -> n%2==0);
//		s1.forEach(n -> System.out.print(n+" "));
//		s2.forEach(n -> System.out.print(n+" "));
		Stream<Integer> s3 = s2.map(n-> n*2);
//		s3.forEach(n -> System.out.print(n+" "));
		
		int result = s3.reduce(0,(c,e)->c+e);
		System.out.println(result);
		
		// we can write all this in 1 line
		
		int res = ar.stream().filter(n -> n%2==0).map(n-> n*2).reduce(0,(c,e)->c+e);
		System.out.print(res);
		
	}
}
