package institution.interlink;

import java.util.ArrayList;

import person.Student;

public class Internship {
	private String name;
	private ArrayList <Student> studentList = new ArrayList <Student> ();
	
    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
    	studentList.add(student);
    }

    public ArrayList <Student> getStudents() {
        return studentList;
    }
    
    public String getName () {
    	return name;
    }
}