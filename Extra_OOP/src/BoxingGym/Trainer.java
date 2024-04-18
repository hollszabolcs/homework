package BoxingGym;

public class Trainer {
    String name;
    int age;
    int experience;

    public Trainer(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    void doGym(Boxer boxer){
        boxer.power*=experience;
    }
    void doHealing(Boxer boxer){
        boxer.hitPoints*=20;
    }
}
