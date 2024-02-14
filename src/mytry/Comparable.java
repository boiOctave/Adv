package mytry;

import java.util.ArrayList;
import java.util.Collections;

import student.Student;

public class Comparable {

	public static void main(String[] args) {
		ArrayList<Student> arr = new ArrayList<Student>();
		
		
		arr.add(new Student(1, "Derriik", 24));
		arr.add(new Student(2, "Sere", 27));
		arr.add(new Student(9, "Goliy", 34));
		arr.add(new Student(4, "Derriik2", 14));
		arr.add(new Student(50, "Froliik", 40));
		arr.add(new Student(26, "Dennad", 54));
		
		Collections.sort(arr);
		
		arr.forEach(student -> System.out.println(student.getName()));
		
		System.out.println();
		System.out.println();
		
		Collections.sort(arr, new AgeSort());
		arr.forEach(student -> System.out.println(student.getName()));
		
		

	}

}
