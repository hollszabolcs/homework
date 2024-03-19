package OOP;

public class OakTree extends Tree{


    public OakTree(String name,int age, int hegiht) {
        this.name =name;
        this.age = age;
        this.height = hegiht;
    }

    @Override
    String getDescription() {
        return String.format("This tree is a very old tree.%n This tree name is %s, it's %s years old, and the height is %s",name,age, height);
    }

    @Override
    String getHungarianName() {
        return ("Tölgyfa");
    }

    @Override
    void bloom() {
        String.format("A %s nevű fa virágzik", name);
    }
    @Override
    public String toString() {
        return super.toString();
    }



}

