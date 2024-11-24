package AdvanceJava;
import java.util.*;

public class OptionalClass {
	public static void main(String[] args) {
		List<String> ar = Arrays.asList("Shash","Laxmi","John");
		
//		Optional<String> s = ar.stream().filter(str -> str.contains("x")).findFirst();
		
//		String res = s.get();
		
//		String res = s.orElse("Not found");
		
		String res = ar.stream().filter(str -> str.contains("x")).findFirst().orElse("Not found");
		
		System.out.print(res);
	}
}
