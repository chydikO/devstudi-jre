package net.devstudi.jre.lection02_inheritance_polymorph;

import net.devstudi.jre.lexion01_classies_objects.Student;

public class ForeignStudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new ForeignStudent("Jack", "Smith", 25, "english");
		System.out.println(s.getFullName());
	}

}
