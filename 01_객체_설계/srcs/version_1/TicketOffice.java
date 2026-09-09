import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

// == 생성자(Constructor) ==============
    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;

        // Arrays.asList()는 배열을 List 형태로 변환해주는 메서드
        this.tickets.addAll(Arrays.asList(tickets));
        // for (Ticket ticket : tickets) {
        //     this.tickets.add(ticket);
        // }
    }

// == 메서드(Method) ==============
    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
