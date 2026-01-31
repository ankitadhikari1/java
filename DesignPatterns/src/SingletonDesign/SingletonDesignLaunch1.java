package SingletonDesign;

class Singleton{
	
	private static Singleton instance;
	 static int cnt ;
	
	private Singleton() {
		cnt = 0;
	}
	
	public static Singleton getInstance() {
		if(instance != null) {
			return instance;
		}
		instance = new Singleton();
		return instance;
	}
	
	public void increaseCount() {
		cnt++;
	}
	
}


public class SingletonDesignLaunch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj1);
		
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj2);

	}

}
