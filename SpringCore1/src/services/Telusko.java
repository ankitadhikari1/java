package services;

public class Telusko {
	
	private ICourse course;
	
	

	public void setCourse(ICourse course) {
		this.course = course;
	}



	public Boolean buyTheCourse(Double Amount){
		return course.getTheCourse(Amount);
	}
	
}
