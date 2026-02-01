
enum Result{
	PASS,FAIL;
	
	// public static final Result PASS = new Result();
	// public static final Result FAIL = new Result();
	
	
	
	private int marks;
	
	Result(){
		System.out.println("this is enum constructor");
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void getMarks() {
		System.out.println(marks);
	}
	
}



public class EnumLaunch2 {

	public static void main(String[] args) {
		
		Result res1 = Result.PASS;
		Result res2 = Result.FAIL;
		
		res1.getMarks();
		res2.getMarks();
		
		res1.setMarks(10);
		res2.setMarks(20);
		
		res1.getMarks();
		res2.getMarks();

	}

}
