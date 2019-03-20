package person.consciousness;

public class Knowledge {
	private String knowledgeString;
	private int knowledge;
	
    public Knowledge(int level) {
    	switch (level) {
    	case 0:
    		knowledgeString = "Poor";
    		break;
    	case 1:
    		knowledgeString = "Satisfactorily";
    		break;
    	case 2:
    		knowledgeString = "Fair";
    		break;
    	case 3:
    		knowledgeString = "Good";
    		break;
    	case 4:
    		knowledgeString = "Excellent";
    		break;
    	case 5:
    		knowledgeString = "Perfect";
    		break;
    	default:
    		knowledgeString = "Unknown";
    		break;
    	}
    	knowledge = level;
    }

    public String getKnowledgeString () {
    	return knowledgeString;
    }

    public int getKnowledge () {
    	return knowledge;
    }
}