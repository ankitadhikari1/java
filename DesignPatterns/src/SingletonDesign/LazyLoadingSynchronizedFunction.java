package SingletonDesign;

class Singleton3{
	
	private static Singleton3 instance;
	 static int cnt ;
	
	private Singleton3() {
		cnt = 0;
	}
	
	public static synchronized Singleton3 getInstance() {
		if(instance != null) {
			return instance;
		}
		instance = new Singleton3();
		return instance;
	}
	
	public void increaseCount() {
		cnt++;
	}
	
}



public class LazyLoadingSynchronizedFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton3 obj1 = Singleton3.getInstance();
		System.out.println(obj1);
		
		Singleton3 obj2 = Singleton3.getInstance();
		System.out.println(obj2);

	}

}
