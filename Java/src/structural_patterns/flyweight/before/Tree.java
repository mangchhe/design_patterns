package structural_patterns.flyweight.before;

public class Tree {

    private int x;
    private int y;

    private String colorName;
    private String color;
    private int contrast;

    public Tree(final int x, final int y, final String colorName, final String color, final int contrast) {
        this.x = x;
        this.y = y;
        this.colorName = colorName;
        this.color = color;
        this.contrast = contrast;
    }
}
