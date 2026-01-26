
public class StringClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ankit Adhikari";
		String str1 = "Ankit";
		//by this output is allocated in heap
		String output = str1 + " Adhikari";
		
		System.out.println(str == output);
		System.out.println(output.equals(str));
		System.out.println(output.equalsIgnoreCase(str));
		System.out.println(output.compareTo(str));
		
/*
		 	false
			true
			true
			0
*/
	}

}
