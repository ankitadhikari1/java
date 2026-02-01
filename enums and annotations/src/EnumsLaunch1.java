
enum Week{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}





public class EnumsLaunch1 {

	public static void main(String[] args) {
		
		Week day = Week.MONDAY;
		System.out.println(day);
		
		System.out.println("................................");
		
		Week []days = Week.values();
		for(Week it : days) {
			System.out.println(it);
		}
		
		System.out.println("................................");
		
		int index = Week.THURSDAY.ordinal();
		System.out.println(index);

	}

}
