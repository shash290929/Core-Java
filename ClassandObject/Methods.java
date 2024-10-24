package ClassandObject;

public class Methods {
	public static void main(String[] args) {
		computer comp = new computer();
		comp.playmusic();
		String obj1 = comp.getapen(12);
		String obj2 = comp.getapen(2);
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

class computer{
	public void playmusic() {
		System.out.println("Play Music.....");
	}
	public String getapen(int cost) {
		if(cost>10) {
			return "Pen";
		}
		return "Nothing";
	}
}
