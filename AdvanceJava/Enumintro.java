package AdvanceJava;

public class Enumintro {
	public static void main(String[] args) {
		Status s = Status.Running;
		
		System.out.println(s);
		
		Status[] ss = Status.values();
		for(Status e: ss) {
			System.out.println(e+" : "+e.ordinal());
		}
		
	}
}
enum Status{
	Running, Failed, Successful,Aborted;
}
