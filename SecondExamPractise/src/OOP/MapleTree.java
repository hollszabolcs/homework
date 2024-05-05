package OOP;

public class MapleTree extends Tree {

    @Override
    String getDescription() {
        return String.format("This tree letter is the Candaian national symbol.%n This tree name is %s, it's %s years old, and the height is %s", name, age, height);
    }

    @Override
    String getHungarianName() {
        return ("juharfa");
    }

    @Override
    void bloom() {
        System.out.printf("A %s nevű fa virágzik", name);
    }

    @Override
    public String toString() {
        return "Ez gyönyörű fa istentelenül virágzik, aminek a neve: " + name;
    }
}
