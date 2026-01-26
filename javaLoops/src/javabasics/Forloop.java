package javabasics;
import java.util.ArrayList;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			arr.add(Integer.valueOf(i));
		}
		
		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		
	}

}
