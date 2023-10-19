package occupations;

public class Person {
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    private int age;
    private String name ;
    private Gender gender;

    public Person(){}

    public Person(int age, String name, Gender gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void introduce() {
        System.out.printf("Hi, my name is %s  I am %d I am a %s %n", name, age, gender);
    }

    public void printGoal() {
        System.out.println("My goal is to be happy in the future");
    }

}
