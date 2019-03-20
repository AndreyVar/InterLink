package institution;

import java.util.ArrayList;

import person.Student;

public class University {
	private String name;
	private Student student;
	private ArrayList <Student> studentList = new ArrayList <Student> ();
	
    public University(String name) {
    	this.name = name;
    }

    public void setStudent(Student student) {
    	this.student = student;
    }

    public void addStudent(Student student) {
    	studentList.add(student);
    }
    
    public String getName () {
    	return name;
    }
    
    public ArrayList<Student> getStudentList () {
    	return studentList;
    }
    
    public Student getStudent () {
    	return student;
    }
}