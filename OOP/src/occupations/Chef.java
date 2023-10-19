package occupations;

public class Chef extends Person {
    public Chef() {
    }

    public Chef(int age, String name, Gender gender) {
      super(age,name,gender);
    }

    @Override
    public void introduce() {
        System.out.printf("Hi, my name is %s  I am %s I am a %s and a chef %n", getName(), getAge(), getGender());
    }

    void cook(String food) {
        System.out.println(getName()+ " has cooked some " + food);
    }
}
