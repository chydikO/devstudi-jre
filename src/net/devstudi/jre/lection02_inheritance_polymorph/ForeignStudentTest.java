package net.devstudi.jre.lection02_inheritance_polymorph;

import net.devstudi.jre.lexion01_classies_objects.Student;

public class ForeignStudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new ForeignStudent("Jack", "Smith", 25, "english");
		System.out.println(s.getFullName());
		
		Student s1 = new ForeignStudent("Jack", "Smith", 25, "english");
		ForeignStudent s2 = new ForeignStudent("Jack", "Smith", 25, "english");
		Student s3 = s2;
		System.out.println("s1 == s2 " + (s1 == s2));
		System.out.println("s1.equals(s2) ->" + s1.equals(s2));
		System.out.println("s3 == s2 ->" + (s3 == s2));
		System.out.println("s3.equals(s2) ->" + s3.equals(s2));
		System.out.println("s1 ->" + s1);
		System.out.println("s2 ->"+ s2);
		System.out.println("s3 ->"+ s3);
	}

}
