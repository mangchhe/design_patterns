package structural_patterns.flyweight.after;

public class Client {

    public static void main(String[] args) {
        final ColorFactory colorFactory = new ColorFactory();
        final Tree tree = new Tree(1, 2, colorFactory.getColor("black", "black", 100));
        final Tree tree2 = new Tree(2, 3, colorFactory.getColor("midnight", "black", 80));
        final Tree tree3 = new Tree(3, 4, colorFactory.getColor("grease", "black", 60));
        final Tree tree4 = new Tree(3, 4, colorFactory.getColor("grease", "black", 60));
        final Tree tree5 = new Tree(3, 4, colorFactory.getColor("grease", "black", 60));

        System.out.println(tree.getColor());
        System.out.println(tree2.getColor());
        System.out.println(tree3.getColor());
        System.out.println(tree4.getColor());
        System.out.println(tree5.getColor());
    }
}
