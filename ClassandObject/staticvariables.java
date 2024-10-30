package ClassandObject;

public class staticvariables {
	public static void main(String[] args) {
		vehicle vcl1 = new vehicle();
		vehicle vcl2 = new vehicle();
		vcl1.Color = "Red";
		vcl2.Color = "Black";
//		vcl1.type="Car";
		vcl2.type="Car";
		vcl1.wheels=4;
		vcl2.wheels=4;
		vcl1.type="truck";
		vehicle.type="ship";
		vcl1.show();
		vcl2.show();
	}
}
class vehicle{
	String Color;
	static String type;
	int wheels;
	public void show() {
		System.out.println(Color+" "+type+" "+wheels);
	}
}
