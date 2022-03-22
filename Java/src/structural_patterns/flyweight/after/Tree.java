package structural_patterns.flyweight.after;

public class Tree {

    private int x;
    private int y;
    private Color color;

    public Tree(final int x, final int y, final Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }
}
