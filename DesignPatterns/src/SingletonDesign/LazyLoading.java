package SingletonDesign;


class Singleton2{
	
	private static Singleton2 instance;
	 static int cnt ;
	
	private Singleton2() {
		cnt = 0;
	}
	
	public static Singleton2 getInstance() {
		if(instance != null) {
			return instance;
		}
		instance = new Singleton2();
		return instance;
	}
	
	public void increaseCount() {
		cnt++;
	}
	
}



public class LazyLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Singleton2 obj1 = Singleton2.getInstance();
		System.out.println(obj1);
		
		Singleton2 obj2 = Singleton2.getInstance();
		System.out.println(obj2);

	}

}
