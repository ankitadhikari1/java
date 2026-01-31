class Notification{
	public void sendNotification() {
		System.out.println("notification sent");
	}
}

class EmailNotification extends Notification{
	@Override
	public void sendNotification() {
		System.out.println("notification sent via email");
	}
	
}

class MessageNotification extends Notification{
	@Override
	public void sendNotification() {
		System.out.println("notification sent via message");
	}
	
}



public class LiskovSubstituionPrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Notification noti = new EmailNotification();
		noti.sendNotification();
		
		Notification noti2 = new MessageNotification();
		noti2.sendNotification();
		
		
	}

}
