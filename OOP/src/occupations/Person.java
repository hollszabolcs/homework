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
        System.out.printf("Hi, my name is %s  I am %s I am a %s", name, age, gender);
        System.out.println("");
    }

    public void printGoal() {
        System.out.println("My goal is to be happy in the future");
    }

}
