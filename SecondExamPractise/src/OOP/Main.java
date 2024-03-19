package OOP;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Tree> Trees = new HashSet<>();
        OakTree oakTree = new OakTree("Tölgyfa",100,130);
        System.out.print(oakTree);
        System.out.println(oakTree.getDescription());
        System.out.println(oakTree.getHungarianName());
        System.out.println(oakTree.toString());
        Trees.add(oakTree);
        OakTree oakTree2 = new OakTree("Tölgyfaketto",120,110);
        System.out.println(oakTree2.getDescription());
        System.out.println(oakTree2.getHungarianName());
        System.out.println(oakTree2.toString());
        Trees.add(oakTree2);
        OakTree oakTree3 = new OakTree("Tölgyfa",1120,130);
        System.out.println(oakTree2.getDescription());
        System.out.println(oakTree2.getHungarianName());
        System.out.println(oakTree2.toString());
        Trees.add(oakTree3);

        System.out.println(Trees.size());

/*        CherryTree cherryTree = new CherryTree();
        cherryTree.age = 45;
        cherryTree.height = 90;
        cherryTree.name = "Cseresznyefa";
        System.out.println(cherryTree.getDescription());
        System.out.println(cherryTree.getHungarianName());
        System.out.println(cherryTree.toString());

        MapleTree mapleTree = new MapleTree();
        mapleTree.age = 54;
        mapleTree.height = 67;
        mapleTree.name = "Juhar";
        System.out.println(mapleTree.getDescription());
        System.out.println(mapleTree.getHungarianName());
        System.out.println(mapleTree.toString());*/
    }
}
