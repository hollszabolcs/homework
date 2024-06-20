package BoxingGym;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Boxer Joe = new Boxer("Joe", 12, 500, 1);
        Boxer Chad = new Boxer("Chad", 34, 500, 2, 2);
        Boxer CripleJack = new Boxer("CripleJack", 39, 460, 6, 5);
        Boxer KrumpLee = new Boxer("KurmpLee", 25, 700, 3, 9);
        Boxer ZoltanCsipkes = new Boxer("CsipkesZoltan", 35, 380, 18, 1);
        List<Boxer> ThoughtGuys = new ArrayList<>();
        ThoughtGuys.add(Joe);
        ThoughtGuys.add(Chad);
        ThoughtGuys.add(CripleJack);
        ThoughtGuys.add(KrumpLee);
        ThoughtGuys.add(ZoltanCsipkes);
        Trainer trainer = new Trainer("Uncle Steve", 58, 7);
        for (Boxer boxer : ThoughtGuys) {
            for (int i = 0; i < 3; i++) {
                trainer.doGym(boxer);
            }
        }

        for (int i = 0; i < ThoughtGuys.size(); i++) {
            for (int j = i + 1; j < ThoughtGuys.size(); j++) {
                if (ThoughtGuys.get(i).equals(ThoughtGuys.get(j))) {
                    continue;
                }
                ThoughtGuys.get(i).getFight(ThoughtGuys.get(j));
                trainer.doHealing(ThoughtGuys.get(i));
                trainer.doHealing(ThoughtGuys.get(j));
            }
        }
        System.out.println(ThoughtGuys);
        Boxer mostWinBoxer = null;
        int mostWins = 0;
        for (Boxer boxer : ThoughtGuys) {
            if (boxer.getWins() > mostWins) {
                mostWins = boxer.getWins();
                mostWinBoxer = boxer;
            }
        }
        System.out.println("The Wolrd champion iiiis:" + mostWinBoxer.name + " with " + mostWinBoxer.wins + " wins");
    }
}
