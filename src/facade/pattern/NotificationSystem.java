package facade.pattern;

public class NotificationSystem {
	
	
	public void sendEmail(User user, int ticketNumber) {
		System.out.println("Emailed ticket "+ ticketNumber +" to "+user.getName());
	}
	
	public void sendSms(User user, int ticketNumber) {
		System.out.println("SMS ticket "+ ticketNumber +" to "+user.getName());
	}


}
