package TicketingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    String name;
    int accountNumber;
    
    public Customer(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public Customer() {
    }


    void buyTicket(Ticket ticket) {
        ticket.setStatus(Status.SOLD);

    }

    void reserveTicket(Ticket ticket) {
        ticket.setStatus(Status.RESERVED);
    }

    @Override
    public String toString() {
        return
                "-".repeat(25) +
                        "\n| name= " + name +
                        "\n| Account no= " + accountNumber + "\n" +
                        "-".repeat(25) + "\n";
    }
}
