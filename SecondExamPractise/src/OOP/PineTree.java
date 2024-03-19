package OOP;

public class PineTree extends Tree {
    @Override
    String getDescription() {
        return String.format("This tree is the Christmas tree and it has pines.%n This tree name is %s, it's %s years old, and the height is %s", name, age, height);
    }

    @Override
    String getHungarianName() {
        return ("fenyőfa");
    }

    @Override
    void bloom() {
        System.out.printf("A %s nevű fa virágzik", name);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
