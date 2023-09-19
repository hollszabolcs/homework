package occupations;

import com.sun.security.jgss.GSSUtil;

public class Person {
    int age;
    String name ;
    Gender gender;

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
