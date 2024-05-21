package ClubMembersSortedCF.members.v1;

import java.time.LocalDate;

public class AddTenMembers {
    static Members addMembers() {
        Members members = new Members();
        var person1 = new Person.PersonBuilder("Szabolcs", "Hollo")
                .birth(LocalDate.of(1991, 12, 8))
                .residence(new Residence(2183, "Galgamcsa", "Vaci ut1"))
                .joinDate(LocalDate.of(2020, 12, 24))
                .grade(Grade.PROFICIENT)
                .build();
        members.personSortedSet.add(person1);
        var person2 = new Person.PersonBuilder("Timosenko", "Sebastian")
                .birth(LocalDate.of(1983, 2, 28))
                .residence(new Residence(3456, "Bogyopuszta", "bogyo utca 15"))
                .joinDate(LocalDate.of(2019, 8, 7))
                .grade(Grade.MASTER)
                .build();
        members.personSortedSet.add(person2);
        var person3 = new Person.PersonBuilder("Greg", "Crow")
                .birth(LocalDate.of(1984, 5, 21))
                .joinDate(LocalDate.of(2012, 10, 17))
                .grade(Grade.NOVICE)
                .build();
        members.personSortedSet.add(person3);
        var person4 = new Person.PersonBuilder("Elisabeth", "Klein")
                .birth(LocalDate.of(1963, 3, 18))
                .residence(new Residence(2045, "Acsa", "Groove Street"))
                .grade(Grade.INTERMEDIATE)
                .build();
        members.personSortedSet.add(person4);
        var person5 = new Person.PersonBuilder("Beata", "Wamzer")
                .birth(LocalDate.of(1993, 2, 11))
                .residence(new Residence(2145, "APC", "Groove Street"))
                .build();
        members.personSortedSet.add(person5);
        var person6 = new Person.PersonBuilder("Mihaly", "Master")
                .grade(Grade.MASTER)
                .build();
        members.personSortedSet.add(person6);
        var person7 = new Person.PersonBuilder("Tamas", "Sas")
                .grade(Grade.INTERMEDIATE)
                .build();
        members.personSortedSet.add(person7);
        var person8 = new Person.PersonBuilder("Zozo", "Crab")
                .grade(Grade.PROFICIENT)
                .build();
        members.personSortedSet.add(person8);
        var person9 = new Person.PersonBuilder("Pista", "Eros")
                .grade(Grade.INTERMEDIATE)
                .build();
        members.personSortedSet.add(person9);
        var person10 = new Person.PersonBuilder("Barna", "Béta")
                .grade(Grade.NOVICE)
                .build();
        members.personSortedSet.add(person10);
        return members;
    }
}
