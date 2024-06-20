package TicketingSystem;

public class Ticket {
    Type type;
    Status status;
    int price;

    public Ticket(Type type, int price, Status status) {
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public Ticket(Type type, int price) {
        this(type, price, Status.AVAILABlE);
    }

    public Ticket() {

    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return
                "-".repeat(25) +
                        "\n| type=" + " ".repeat(2) + type +
                        "\n| status=" + " ".repeat(2) + status +
                        "\n| price=" + " ".repeat(2) + price +
                        "\n| status=" + " ".repeat(2) + status + "\n" +
                        "-".repeat(25) + "\n";
    }
}
