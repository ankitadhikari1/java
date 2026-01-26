package javabasics;

import java.util.ArrayList;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			arr.add(Integer.valueOf(i));
		}
		int i=0;
		while(i++<arr.size()) {
			System.out.print(arr.get(i)+" ");
		}

	}

}
