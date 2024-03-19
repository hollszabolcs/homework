package OOP;

public class CherryTree extends Tree {
    @Override
    String getDescription() {
        return String.format("This tree have very tasty fruits.%n This tree name is %s, it's %s years old, and the height is %s", name, age, height);
    }

    @Override
    String getHungarianName() {
        return ("cseresznyefa");
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
