package javabasics;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorLoopExceptionSolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteArrayList<Integer> arr = new CopyOnWriteArrayList<>();
		for(int i=1;i<=10;i++) {
			arr.add(Integer.valueOf(i));
		}
		
		Iterator itr = arr.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			arr.add(10);
		}
		
		System.out.println("...................................");
		
		itr = arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
