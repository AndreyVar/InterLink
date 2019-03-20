package main;

import java.util.ArrayList;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
	private static ArrayList <University> universityList = new ArrayList <University> ();
	private static ArrayList <Internship> internshipList = new ArrayList <Internship> ();
	static University university;
	static Student student;
	static Knowledge knowledge;
	static final Knowledge KNOWLEDGE_MIDDLE_LEVEL = new Knowledge (2);
	static Internship internship;
    public static void main(String[] args) {
    	
    	university = new University("CH.U.I.");
    	student = new Student("Andrew Kostenko");
        knowledge = new Knowledge (4);
        student.setKnowledge(knowledge);
    	university.addStudent(student);
    	universityList.add(university);
    	
    	university = new University("MyUniversity");
    	student = new Student("Julia Veselkina");
        knowledge = new Knowledge (1);
        student.setKnowledge(knowledge);
    	university.addStudent(student);
    	student = new Student("Anna Veselkina");
        knowledge = new Knowledge (3);
        student.setKnowledge(knowledge);
    	university.addStudent(student);
    	student = new Student("Julia Perechrest");
        knowledge = new Knowledge (4);
        student.setKnowledge(knowledge);
    	university.addStudent(student);
    	universityList.add(university);
    	
    	university = new University("LPNU");
    	student = new Student("Maria Perechrest");
        knowledge = new Knowledge (3);
        student.setKnowledge(knowledge);
    	university.addStudent(student);
    	student = new Student("Anna Perechrest");
        knowledge = new Knowledge (5);
        student.setKnowledge(knowledge);
    	university.addStudent(student);
    	universityList.add(university);
    	
    	for (University u: universityList) {
    		internship = new Internship (u.getName()); 
    		for (Student s: u.getStudentList()) {
    			if (s.getStudentKnowledge().getKnowledge() > 
    			KNOWLEDGE_MIDDLE_LEVEL.getKnowledge() ) {
    				internship.setStudent(s);
    			}
    		}
    		internshipList.add(internship);
    	}
    	
    	System.out.println("List of internship's students:\n");
    	
    	for (Internship i: internshipList) {
    		System.out.print(i.getName() + ":\n");
    		for (Student s: i.getStudents()) {
    			System.out.print(s.getName() + ", " + s.getStudentKnowledge().getKnowledge() + 
    					" (" + s.getStudentKnowledge().getKnowledgeString() + ")" + "\n");
    		}
    		System.out.println();
    	}
    }
}