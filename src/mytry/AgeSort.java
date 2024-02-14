package mytry;
import java.util.Comparator;

import student.Student;


public class AgeSort implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
	if(s1.getAge() > s2.getAge()) {
		return 1;
	}if(s1.getAge() < s2.getAge()) {
		return -1;
	}else return 0 ;
	}

}


