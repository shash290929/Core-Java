package AdvanceJava;

public class needofinterface {
	public static void main(String[] args) {
		developer Shashank = new developer();
		Computer desk = new desktop();
		Computer lap = new laptop();
		Shashank.code(desk);
		Shashank.code(lap);
	}
}

class developer{
	public void code(Computer comp) {
		comp.code();
	}
}

interface Computer{
	void code();
}

class laptop implements Computer{
	public void code() {
		System.out.println("Coding in laptop");
	}
}
class desktop implements Computer{
	public void code() {
		System.out.println("Coding in Desktop");
	}
}