package services;

public class Java implements ICourse{
	
	
	public Java() {
		System.out.println("java bean is created");
	}
	

	@Override
	public Boolean getTheCourse(Double amount) {
		System.out.println("Java course is purchased and fees paid is "+amount);
		return true;
	}

}
