package SingletonDesign;


class Singleton1{
	private static Singleton1 instance = new Singleton1();
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		return instance;
	}
}



public class EagerLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton1 obj1 = Singleton1.getInstance();
		Singleton1 obj2 = Singleton1.getInstance();
		
		System.out.println(obj1.equals(obj2));

	}

}
