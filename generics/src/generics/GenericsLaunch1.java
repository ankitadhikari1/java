package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsLaunch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList arr= new ArrayList();
		arr.add("Ankit");
		arr.add("Deepak");
		arr.add("Lokesh");
		arr.add("Rohit");
		arr.add("Vibha");
		arr.add(1);
		
		System.out.println(arr);
		
		Iterator itr = arr.iterator();
		
		while(itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str);
		}
		
//		java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//		at generics.GenericsLaunch1.main(GenericsLaunch1.java:25)
		
		
		

	}

}
