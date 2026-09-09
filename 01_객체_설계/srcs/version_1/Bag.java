public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

// == 생성자(Constructor) ==============
    public Bag(long amount) {
        // 생성자 위임(Constructor Delegation)
        this(null, amount);
        // Bag(null, amount) 생성자 호출
    }

    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

// == 메서드(Method) ==============
    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
