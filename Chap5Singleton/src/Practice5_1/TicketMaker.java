package Practice5_1;

/**
 * @author ryanw
 */
public class TicketMaker {
    private int ticket = 1000;

    public static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
        System.out.println("生成一个实例");
    }

    public TicketMaker getInstance() {
        return ticketMaker;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }
}
