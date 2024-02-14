package student;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
    ArrayList<Student> arr = new ArrayList<Student>();
    
    Student john = new Student(11, "John", 30);
    Student ken = new Student(3, "Ken", 53);
    Student joel = new Student(2, "Joel", 25);   
 
    
    
    
    arr.add(ken);
    arr.add(joel);
    arr.add(john);
    
    
    Collections.sort(arr);
    
    
    System.out.println("Students After Sorting....");
    arr.forEach(student -> System.out.println(student.getName()));

//    AgeComparator a1 = ;
    Collections.sort(arr, new AgeComparator());
    
    
    System.out.println("Students After Sorting Age....");
    arr.forEach(student -> System.out.println(student.getName()));
 
    
	}
	
	
	

}
