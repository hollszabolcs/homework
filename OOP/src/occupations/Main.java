package occupations;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(42,"Gabor",Gender.MAN);
        person.introduce();
         Chef chef = new Chef(42,"Gabor",Gender.MAN);
         chef.introduce();
        chef.cook("brocccoli");
    }
}
