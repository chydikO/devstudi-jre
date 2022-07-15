package net.devstudi.jre.lection02_inheritance_polymorph;

import net.devstudi.jre.lexion01_classies_objects.Student;

public class ForeignStudent extends Student {
	private String language;

	public ForeignStudent(String firstName, String lastName, int age, String language) {
		super(firstName, lastName, age);
		setLanguage(language);
	}

	public ForeignStudent() {
		super();
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}
	
	@Override
	public String getFullName() {
	return getFirstName() + " " + getLastName();
	}
}
