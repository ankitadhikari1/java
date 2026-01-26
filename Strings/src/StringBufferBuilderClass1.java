
public class StringBufferBuilderClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str1 = new StringBuilder();
		System.out.println(str1.capacity());
		
		str1.append("Ankit");
		str1.append(" Adhikari");
		
		System.out.println(str1);
		System.out.println(str1.capacity());
		System.out.println(str1.length());
		
		
		
		StringBuffer str2 = new StringBuffer();
		System.out.println(str2.capacity());
		
		str2.append("Ankit");
		str2.append(" Adhikari computer science");
		
		System.out.println(str2);
		System.out.println(str2.capacity());
		System.out.println(str2.length());
		
		
		str2.setCharAt(0,'a');
		str2.setCharAt(6,'a');
		for(int i=0;i<str2.length();i++) {
			System.out.print(str2.charAt(i));
		}

	}

}
