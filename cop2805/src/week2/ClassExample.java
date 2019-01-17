package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ClassExample {
	
	//airline names list
	//add 5 airlines to the list
	//output by alphabetical order
	public static void main(Student args) {
		
//		List<String> airlines = new ArrayList<>();
//		airlines.add("JetFly");
//		airlines.add("Delta");
//		airlines.add("United");
//		airlines.add("Southwest");
//		airlines.add("Spirit");
//		
//		airlines.sort(null);
//		
//		for(int i = 0; i< airlines.size(); i++) {
//			System.out.print(airlines.get(i) + " ");
//		}
		
//		Collections.sort(airlines);
		
		List<Student> students = new ArrayList<>();
		students.add("JetFly");
		students.add("Delta");
		students.add("United");
		students.add("Southwest");
		students.add("Spirit");
		
		students.sort(null);
		
		for(int i = 0; i< students.size(); i++) {
			System.out.print(students.get(i) + " ");
		}
		
		
	}
	
	class Student implements Comparable {
		
		private String lastname;
		private String firstname;
		private int studentNumber;

		public Student(int studentNumber, String firstname, String lastname) {
			setStudentNumber(studentNumber);
			setFirstname(firstname);
			setLastname(lastname);
		}

		private void setLastname(String lastname) {
			// TODO Auto-generated method stub
			this.lastname = lastname;
		}

		private void setFirstname(String firstname) {
			// TODO Auto-generated method stub
			this.firstname = firstname;
			
		}

		private void setStudentNumber(int studentNumber) {
			// TODO Auto-generated method stub
			this.studentNumber = studentNumber;
			
		}
		
		@Override
		public String toString() {
			System.out.print(this.firstname + ", "+this.lastname +", " + this.studentNumber);
			return this.firstname + ", "+this.lastname +", " + this.studentNumber;
		}
		
//		@Override
//		public int compareTo(Student otherStudent) {
//			 
//		}

		@Override
		public int compareTo(Object arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	

}
