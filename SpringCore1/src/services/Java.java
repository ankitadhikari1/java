package services;

public class Java implements ICourse{

	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println("Java course is purchased and fees paid is "+amount);
		return true;
	}

}
