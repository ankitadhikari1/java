package SingletonDesign;


class Singleton4{
	
	private static Singleton4 instance;
	 static int cnt ;
	
	private Singleton4() {
		cnt = 0;
	}
	
	public static Singleton4 getInstance() {
		if(instance == null) {
			synchronized(Singleton4.class){
				if(instance==null) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}
	
	public void increaseCount() {
		cnt++;
	}
	
}



public class LazyLoadingSynchronizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton4 obj1 = Singleton4.getInstance();
		System.out.println(obj1);
		
		Singleton4 obj2 = Singleton4.getInstance();
		System.out.println(obj2);

	}

}
