package ClubMembersSortedCF.members.v1;


import java.time.LocalDate;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Members {

    SortedSet<Person> personSortedSet = new TreeSet<>(new nameComparator());
    Scanner scanner = new Scanner(System.in);

    public Members() {
    }

    private Grade getGrade(String scanner) {
        try {
            return Grade.valueOf(scanner.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("invalid grade");
        }
        return Grade.UNKNOWN;
    }

    Person personBuilder(Person p, Scanner scanner) {
        System.out.println("Please enter first name and last name");
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        System.out.println("Please enter the birth date(yyyy,mm,dd)");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter the residence (Postal code, city,address(please separate with '_' characters)");
        String postalCode = scanner.next();
        String city = scanner.next();
        String address = scanner.next();
        System.out.println("please enter the join date");
        year = Integer.parseInt(scanner.next());
        month = Integer.parseInt(scanner.next());
        day = Integer.parseInt(scanner.next());
        scanner.nextLine();
        System.out.println("please add the grade (master,proficient,intermediate,novice)");
        String grade = scanner.nextLine();
        p = new Person.PersonBuilder(firstName, secondName)
                .birth(LocalDate.of(year, month, day))
                .residence(new Residence(Integer.parseInt(postalCode), city, address))
                .joinDate(LocalDate.of(year, month, day))
                .grade((getGrade(grade)))
                .build();
        personSortedSet.add(p);
        return p;
    }

    Person addPerson(Person p) {
        return personBuilder(p, scanner);
    }

    boolean removePerson(Person p) {
        System.out.println("Please enter first name and last name");
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        p = new Person.PersonBuilder(firstName, secondName).build();
        for (Person person : personSortedSet) {
            if (person.equals(p)) {
                return personSortedSet.remove(p);
            }
        }
        return false;
    }

    boolean contains(Person p) {
        System.out.println("Please enter first name and second name");
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        p = new Person.PersonBuilder(firstName, secondName).build();
        for (Person person : personSortedSet) {
            if (person.equals(p)) {
                return personSortedSet.contains(p);
            }
        }
        return false;
    }

    int size() {
        return personSortedSet.size();
    }

    boolean isEmpty() {
        return personSortedSet.isEmpty();
    }

    void clear() {
        personSortedSet.clear();
    }

    @Override
    public String toString() {
        return "personSortedSet=" + personSortedSet +
                "\n";
    }
}
