package services;

public class Telusko {
	
	private ICourse course;
	
	public Telusko() {
		super();
		System.out.println("telusko bean created");
	}
	
	public Telusko(ICourse course) {
		
		super();
		System.out.println("this is constructor injection");
		this.course = course;
	}
	

	public void setCourse(ICourse course) {
		System.out.println("this is setter injection");
		this.course = course;
	}



	public Boolean buyTheCourse(Double Amount){
		return course.getTheCourse(Amount);
	}
	
}
