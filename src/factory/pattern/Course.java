package factory.pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
	
	List<CourseModule> modules = new ArrayList<>();
	
	public Course() {
		// TODO Auto-generated constructor stub
		this.createCourse();
	}
	
	public List<CourseModule> getModules(){
		return modules;
	}
	
	public abstract void createCourse();

}
