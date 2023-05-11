package factory.pattern;

public  class CourseFactory {
	
	
	
	public static Course getCourse(String courseType) {
		
		switch (courseType) {
		case "AIML": {
			
			return new AIMLCourse();
		}
		case "DEVOPS":{
			return new AIMLCourse();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + courseType);
		}
		
	}

}
