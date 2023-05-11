package facade.pattern;

public class BookingFacade {
	
	public void createBooking(User user) {
		TicketSystem ts  = new TicketSystem();
		PaymentSystem ps = new PaymentSystem();
		NotificationSystem ns = new NotificationSystem();
		
		boolean isBookingAvailable = ts.ticketAvailability("PS-2");
		if(isBookingAvailable) {
			ts.createTicket(120, user, "PS-2");
			ps.makeCardPayment();
			ns.sendEmail(user, 120);
			ns.sendSms(user, 120);
		}
	}

}
