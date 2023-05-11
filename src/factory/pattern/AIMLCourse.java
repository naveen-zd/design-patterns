package factory.pattern;

public class AIMLCourse extends Course {

	@Override
	public void createCourse() {
		// TODO Auto-generated method stub
		getModules().add(new ContentModule());
		getModules().add(new SummaryModule());
		getModules().add(new AssignmentModule());
		
		
	}

}
