package AdvanceJava;

public class LambdaFunction {
	public static void main(String[] args) {
		CBA obj = () -> System.out.println("Showing...");
		obj.show();
		
		//BCA obj1 = (int i) -> System.out.print("Running..."+i);  // all three same 
		//BCA obj1 = (i) -> System.out.print("Running..."+i);
		BCA obj1 = i -> System.out.println("Running..."+i);
		obj1.runing(5);
		
		CAB obj2 = (i,j) -> i+j;
		System.out.println(obj2.add(5,4));
	}
}

@FunctionalInterface
interface CBA{
	void show();
}

@FunctionalInterface
interface BCA{
	void runing(int i);
}

@FunctionalInterface
interface CAB{
	int add(int a,int b);
}