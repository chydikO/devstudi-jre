package net.devstudi.jre.lection02_inheritance_polymorph;

import java.util.Objects;

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

	@Override
	public String toString() {
		return super.toString() + "ForeignStudent [language=" + language + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(language);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ForeignStudent other = (ForeignStudent) obj;
		return Objects.equals(language, other.language);
	}
	
	
}
