package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsLaunch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Ankit");
		arr.add("Deepak");
		arr.add("Lokesh");
		arr.add("Rohit");
		arr.add("Vibha");
		/*
		 * arr.add(1);
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
			at generics.GenericsLaunch2.main(GenericsLaunch2.java:16)
		 */
		
		
System.out.println(arr);
		
		Iterator itr = arr.iterator();
		
		while(itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str);
		}
		

	}

}
