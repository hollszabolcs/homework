package ClubMembersSortedCF.members.v1;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String firstName;
    private String secondName;
    private LocalDate birth;
    private Residence residence;
    private LocalDate joinDate;
    private Grade grade;

    private Person(PersonBuilder personBuilder) {
        this.firstName = personBuilder.firstName;
        this.secondName = personBuilder.secondName;
        this.birth = personBuilder.birth;
        this.residence = personBuilder.residence;
        this.joinDate = personBuilder.joinDate;
        this.grade = personBuilder.grade;
        if (firstName == null || secondName == null) {
            throw new IllegalArgumentException("First name and Second name must be not null");
        }
    }

    public Person() {
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(secondName, person.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, birth, residence, joinDate, grade);
    }

    @Override
    public String toString() {
        return
                "\nVezetéknév='" + secondName + '\'' +
                        "\nKeresztnév='" + firstName + '\'' +
                        "\nSzületési dátum=" + birth +
                        "\nLakhely=" + residence +
                        "\nCsatlakozás dátuma=" + joinDate +
                        "\nFokozat=" + grade +
                        "\n";
    }

    public static class PersonBuilder {
        String firstName;
        String secondName;
        LocalDate birth;
        Residence residence;
        LocalDate joinDate;
        Grade grade;

        public PersonBuilder(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public PersonBuilder birth(LocalDate birth) {
            this.birth = birth;
            return this;
        }

        public PersonBuilder residence(Residence residence) {
            this.residence = residence;
            return this;
        }

        public PersonBuilder joinDate(LocalDate joinDate) {
            this.joinDate = joinDate;
            return this;
        }

        public PersonBuilder grade(Grade grade) {
            this.grade = grade;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
