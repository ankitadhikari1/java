
public class StringClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ankit";
		String str1 = "Ankit";
		
		/* these strings will be made in SCP
		 * SCP means string constant pool
		 * when String class object is directly assigned 
		 * using string literal its formed in SCP if already present
		 * reference to that object will be returned
		 */
		
		System.out.println(str1 == str);
		System.out.println(str1.equals(str));
		System.out.println(str1.equalsIgnoreCase(str));
		System.out.println(str1.compareTo(str));
		
		
		
		System.out.println(".........................");
		String str2 = "Ankit";
		String str3 = "ankit";
		
		
		
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(str2.compareTo(str3));
		
		

	}

}
