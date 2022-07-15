package net.devstudi.jre.lexion01_classies_objects;
public class Test3 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setFirstName("Ivan");
		s1.setLastName("Ivanov");
		s1.setAge(22);
		Student s2 = new Student("Petr", "Petrov", 21);
		Student s3 = new Student("Sergey", "Sergeev", 51);
		s3.setAge(19);
	}
}
