package person;

import person.consciousness.Knowledge;

public class Student {
	private Knowledge knowledge;
	private String name;
	
    public Student(String name) {
    	this.name = name;
    }

    public void setKnowledge(Knowledge knowledge) {
    	this.knowledge = knowledge;
    }
    
    public Knowledge getStudentKnowledge () {
    	return knowledge;
    }
    
    public String getName () {
    	return name;
    }
}