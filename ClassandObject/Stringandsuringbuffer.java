package ClassandObject;

public class Stringandsuringbuffer {
	public static void main(String[] args) {
		String s1 = "Shashank";
		System.out.println(s1);
//		s1.concat("Raj");
//		System.out.print(s1);
		
		StringBuffer sb = new StringBuffer("Shashank");
		sb.append("Raj");
		System.out.println(sb);
	}
}
