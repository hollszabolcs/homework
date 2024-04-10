package TicketingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketSystem ticketSystem = new TicketSystem();
        ticketSystem.tickets.add(new Ticket(Type.SEAT, 10));
        ticketSystem.tickets.add(new Ticket(Type.VIP, 100, Status.RESERVED));
        ticketSystem.tickets.add(new Ticket(Type.STANDING_TICKET, 10, Status.SOLD));
        ticketSystem.tickets.add(new Ticket(Type.STANDING_TICKET, 10000, Status.SOLD));
        ticketSystem.customers.add(new Customer("Hollo_Szabolcs", 189));
        ticketSystem.customers.add(new Customer("Toth_Erezeus", 666));
        ticketSystem.customers.add(new Customer("Szende_Emese", 434));
        System.out.printf("Please set the number of the process would you like to run: \n" +
                "1 add ticket\n2 delete ticket\n3 add customer\n4 remove customer\n5 buy/reserve ticket\n");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                ticketSystem.addTicket();
                break;
            case 2:
                ticketSystem.removeTicket();
                break;
            case 3:
                ticketSystem.addCustomer();
                break;
            case 4:
                ticketSystem.removeCustomer();
            case 5:
                ticketSystem.useCustomer();
                break;
        }
    }
}
