
public class StringClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Ankit");
		String str2 = new String("Ankit");
		
		/*
		 * using new keyword memory of object is allocated in heap
		 * 
		 * */
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		
		
		String str3 = new String("Ankit");
		String str4 = new String("ankit");
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));
		System.out.println(str3.compareTo(str4));
		
		
		for(int i=0;i<str1.length();i++) {
			System.out.print(str1.charAt(i));
		}
		
		
	}

}
