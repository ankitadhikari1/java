package generics;


class Student<T>{
	T value;
	

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}



public class GenericsLaunch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student<Integer> obj1 = new Student<>();
		obj1.setValue(1);
		System.out.println(obj1.getValue());
		
		Student<String> obj2 = new Student<>();
		obj2.setValue("Ankit");
		System.out.println(obj2.getValue());
		
		
		Student<Character> obj3 = new Student<>();
		obj3.setValue('A');
		System.out.println(obj3.getValue());
		
		Student<Boolean> obj4 = new Student<>();
		obj4.setValue(true);
		System.out.println(obj4.getValue());
		
		
		
	}

}
