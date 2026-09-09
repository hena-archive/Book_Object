public class TicketSeller {
    private TicketOffice ticketOffice;

// == 생성자(Constructor) ==============
    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

// == 메서드(Method) ==============
    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}
