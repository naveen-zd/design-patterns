package facade.pattern;

public class TicketSystem {
	
	private int ticketNumber;
	
	
	public boolean ticketAvailability(String movie) {
		return true;
	}
	
	public void createTicket(int ticketNumber,User user, String movie) {
		
	}
	
	public int getTicketNumber() {
		return ticketNumber;
	}

}
