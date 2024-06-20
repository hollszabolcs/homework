package TicketingSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketSystem {
    List<Ticket> tickets = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();
    Customer customer = new Customer();
    Scanner scanner = new Scanner(System.in);
    String[] ticketProcess = {" Delete", " Buy", " Reserve"};
    int ticketProcessSet;


    private int getTicket() {
        int counter = 1;
        System.out.printf("What type of ticket want you" + ticketProcess[ticketProcessSet] + "?\n" +
                "the following tickets are on the List:\n");
        for (Ticket ticket : tickets) {
            System.out.printf("\nticket number: " + counter + "\n" + ticket);
            counter++;
        }
        System.out.print("Please type the number: ");
        int userInput = scanner.nextInt();
        while (userInput > counter) {
            System.err.println("That ticket number does not exist," +
                    "please enter a valid ticket number");
            userInput = scanner.nextInt();
        }
        return userInput - 1;
    }

    void addTicket() {
        System.out.println("Enter ticket type (SEAT, VIP, STANDING_TICKET):");
        Type type = Type.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Enter ticket price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter ticket status (AVAILABlE,RESERVED,SOLD):");
        Status status = Status.valueOf(scanner.nextLine().toUpperCase());
        Ticket newTicket = new Ticket(type, price, status);
        tickets.add(newTicket);
        System.out.println("New ticket has been added:\n" + newTicket);
        System.out.println(tickets);
    }

    void removeTicket() {
        ticketProcessSet = 0;
        int userInput = getTicket();
        Ticket remove = tickets.remove(userInput - 1);
        System.out.printf("++Ticket removed successfully++\n");
        System.out.println(tickets);
    }

    void buyTicket() {
        ticketProcessSet = 1;
        int userInput = getTicket();
        if (tickets.get(userInput).status == Status.SOLD
                || tickets.get(userInput).status == Status.RESERVED) {
            System.err.println("You cannot buy this ticket");
        } else {
            customer.buyTicket(tickets.get(userInput));
            for (Ticket ticket : tickets) {
                System.out.println(ticket);
            }

        }
    }

    void reserveTicket() {
        ticketProcessSet = 2;
        int userInput = getTicket();
        if (tickets.get(userInput).status == Status.SOLD) {
            System.err.println("You cannot reserve this ticket");
        } else {
            customer.reserveTicket(tickets.get(userInput));
            for (Ticket ticket : tickets) {
                System.out.println(ticket);
            }
        }

    }


    void addCustomer() {
        System.out.printf("Please enter the name " +
                "\n(please use '_' character to separate first and last name\n");
        String name = scanner.nextLine();
        while (!name.contains("_")) {
            System.err.println("The  customer name does not contains " +
                    "'_' type again");
            name = scanner.nextLine();
        }
        System.out.println("Please add an account number");
        int accNumber = scanner.nextInt();
        Customer newcustomer = new Customer(name, accNumber);
        customers.add(newcustomer);
        System.out.println(customers);
    }

    void removeCustomer() {
        int counter = 1;
        System.out.printf("Which customer want you delete?\n" +
                "the following tickets are on the List:\n");
        for (Customer customer : customers) {
            System.out.printf("\ncustomer number: " + counter + "\n" + customer);
            counter++;
        }
        System.out.print("Please type the number: ");
        int userInput = scanner.nextInt();
        while (userInput > counter) {
            System.err.println("That customer number does not exist," +
                    "please enter a valid ticket number");
            userInput = scanner.nextInt();
        }
        Customer remove = customers.remove(userInput - 1);
        System.out.printf("++Customer removed successfully++\n");
        System.out.println(customers);
    }

    void selectCustomer() {
        int counter = 1;
        System.out.printf("Which customer want you select?\n");
        for (Customer customer : customers) {
            System.out.printf("\ncustomer number: " + counter + "\n" + customer);
            counter++;
        }
        System.out.printf("\nPlease type the number: ");
        int userInput = scanner.nextInt();
        while (userInput > counter) {
            System.err.println("That customer number does not exist," +
                    "please select a valid customer");
            userInput = scanner.nextInt();
            System.out.println(customers.get(userInput - 1) + "Has been selected");
        }
    }

    void useCustomer() {
        selectCustomer();
        System.out.println("Do you want buy(1) or reserve(2) ticket");
        int userInput = scanner.nextInt();
        if (userInput == 1) {
            buyTicket();
        } else if (userInput == 2) {
            reserveTicket();
        }
    }
}
