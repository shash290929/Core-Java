package AdvanceJava;
import java.util.*;
import java.util.stream.Stream;


public class ParallelStream {
	public static void main(String[] args) {
		int size=10000;
		List<Integer> ar = new ArrayList<>(size);
		Random ran = new Random();
		
		for(int i=0;i<size;i++) {
			ar.add(ran.nextInt(100));
		}

//		System.out.print(ar);
		
//		int res1 = ar.stream().map(n -> n*2).reduce(0,(c,e)->c+e);
		
		
		long startSeq = System.currentTimeMillis();
		int res1 = ar.stream().map(n -> {
						try {
							Thread.sleep(1);
						}
						catch(Exception e) {
							System.out.print(e);
						}
						return n*2;}).
						mapToInt(n -> n).sum();
		
		long endSeq = System.currentTimeMillis();
		
		long startPara = System.currentTimeMillis();
		int res2 = ar.parallelStream().map(n -> {
						try {
							Thread.sleep(1);
						}
						catch(Exception e) {
							System.out.print(e);
						}
						return n*2;}).
						mapToInt(n->n).sum();
		long endPara = System.currentTimeMillis();
		
		System.out.println(res1+" "+res2);
		
		System.out.println("Seq: "+ (endSeq-startSeq));
		System.out.println("Para: "+ (endPara-startPara));
		
	}
}
