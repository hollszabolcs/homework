package BoxingGym;

public class Boxer {
    String name;
    int age;
    int hitPoints;
    int power;

    public int getWins() {
        return wins;
    }

    int wins;

    public Boxer(String name, int age, int hitPoints, int power, int wins) {
        this.name = name;
        this.age = age;
        this.hitPoints = hitPoints;
        this.power = power;
        this.wins = wins;
    }

    public Boxer(String name, int age, int hitPoints, int power) {
        this(name, age, hitPoints, power, 0);
    }

    private void getHit(Boxer boxer) {
        this.hitPoints -= boxer.power;
        System.out.printf("%s named boxer hit with %d power the %s named boxer, " +
                "then he left %d lifepoints %n", boxer.name, boxer.power, this.name, this.hitPoints);
    }

    void getFight(Boxer boxer) {
        if (boxer.hitPoints > 0) {
            do {
                getHit(boxer);
                getHitBack(boxer);
            } while (boxer.hitPoints > 0 && this.hitPoints > 0);
            if (this.hitPoints > 0) {
                System.out.printf("And the winner iiis: %s and the loser iiss: %s", this.name, boxer.name);
                this.wins += 1;
            }
            if (boxer.hitPoints > 0) {
                System.out.printf("And the winner iiis: %s and the loser iiss: %s", boxer.name, this.name);
                boxer.wins += 1;
            }
        } else {
            System.out.println("The boxer is dead so obviously he can't fight");
        }

    }

   private void getHitBack(Boxer boxer) {
        boxer.hitPoints -= this.power;
        System.out.printf("%s named boxer hit back with %d power the %s named boxer, " +
                "then he left %d lifepoints %n", this.name, this.power, boxer.name, boxer.hitPoints);
    }


    @Override
    public String toString() {
        return  "\n" +
                "-".repeat(15)  +
                "\n| name=" + name +
                "\n| age=" + age +
                "\n| wins=" + wins + "\n" +
                "-".repeat(15) + "\n"
                ;
    }
}
