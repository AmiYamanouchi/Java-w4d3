package ca.java.composition;

public class Driver {

	public static void main(String[] args) {
		//Create Student Objects
		Student s1 = new Student("John", "Doe", 14.4);
		Student s2 = new Student("Sarah", "Green", 18.3);
		Student s3 = new Student("Ann", "McDonald", 12.8);
		//Create Course Object
		Course c1 = new Course("Java", 8);
		//Populate the list of students
		c1.addStudent(s1);
		c1.addStudent(s2);
		c1.addStudent(s3);
	}

}