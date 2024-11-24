package AdvanceJava;

public class functionalinterface {
	public static void main(String[] args) {
		ABC obj = new ABC() {
			public void show() {
				System.out.println("Showing...");
			}
		};
		obj.show();
	}
}

@FunctionalInterface
interface ABC{
	void show();
}