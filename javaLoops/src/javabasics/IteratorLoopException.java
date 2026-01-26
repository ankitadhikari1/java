package javabasics;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLoopException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			arr.add(Integer.valueOf(i));
		}
		
		Iterator itr = arr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			arr.add(10);
		}
	}

}
