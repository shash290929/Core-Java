package AdvanceJava;
import java.util.*;

public class ComparatorandComparable {
	public static void main(String[] args) {
		
//		Comparator<Student> comp = new Comparator<>(){
//			public int compare(Student i,Student j) {
//				return i.age - j.age;
//			}
//		};
//		           OR
		
		Comparator<Student> comp = (i,j) -> i.age-j.age;
		
		List<Student> ar = new ArrayList<>();
		ar.add(new Student(23,"Shashank"));
		ar.add(new Student(33,"shank"));
		ar.add(new Student(21,"Shashank Raj"));
		ar.add(new Student(42,"Shash"));
		
		Collections.sort(ar);
		
		for(Student e:ar) {
			System.out.println(e.age+" "+e.Name);
		}
		
		
//		List<Integer> ar =new ArrayList<>();
//		ar.add(14);
//		ar.add(29);
//		ar.add(91);
//		ar.add(82);
//		Collections.sort(ar,comp);
//		for(int e:ar) {
//			System.out.print(e+" ");
//		}
	}
}

class Student implements Comparable<Student>{
	int age;
	String Name;
	public Student(int age,String Name) {
		this.age = age;
		this.Name=Name;
	}
	public int compareTo(Student obj) {
		return this.age-obj.age;
	}
}
