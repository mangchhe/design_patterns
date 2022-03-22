package structural_patterns.flyweight.before;

public class Client {

    public static void main(String[] args) {
        Tree tree = new Tree(1, 2, "black", "black", 100);
        Tree tree2 = new Tree(2, 3, "midnight", "black", 80);
        Tree tree3 = new Tree(3, 4, "grease", "black", 60);
        Tree tree4 = new Tree(4, 5, "sable", "black", 40);

        System.out.println(tree);
        System.out.println(tree2);
        System.out.println(tree3);
        System.out.println(tree4);
    }
}
