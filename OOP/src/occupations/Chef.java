package occupations;

public class Chef extends Person {
    public Chef() {
    }

    public Chef(int age, String name, Gender gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s  I am %s I am a %s and a chef %n", this.name, this.age, this.gender);
    }

    void cook(String food) {
        System.out.println(name + " has cooked some " + food);
    }
}
