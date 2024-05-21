package ClubMembersSortedCF.members.v1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Members members = AddTenMembers.addMembers();
        Person person = new Person();
        System.out.printf("Please choose an option:\n" +
                "1:Add a new member\n" +
                "2:Remove a member\n" +
                "3:Check the if the member is already added\n" +
                "4:Check the members list size\n" +
                "5: Clear the members list\n" +
                "6: Check is the members list is empty\n" +
                "7: Quit\n");
        int userInput = scanner.nextInt();
        while (userInput != 666) {
            switch (userInput) {
                case 1:
                    System.out.println(members.personSortedSet);
                    members.addPerson(person);
                    System.out.println(members.personSortedSet);
                    break;
                case 2:
                    System.out.println(members.personSortedSet);
                    members.removePerson(person);
                    System.out.println(members.personSortedSet);
                    break;
                case 3:
                    System.out.println(members.contains(person));
                    break;
                case 4:
                    System.out.println(members.size());
                    break;
                case 5:
                    members.clear();
                    break;
                case 6:
                    System.out.println(members.isEmpty());
                    break;
                case 7:
                    System.err.println("Application will quit");
                    System.exit(0);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + userInput);
            }
            userInput = scanner.nextInt();
        }
    }
}