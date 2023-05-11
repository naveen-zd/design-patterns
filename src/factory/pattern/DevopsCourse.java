package factory.pattern;

public class DevopsCourse extends Course {

	@Override
	public void createCourse() {
		// TODO Auto-generated method stub
		getModules().add(new ContentModule());
		getModules().add(new SummaryModule());
		 

	}

}
