package structural_patterns.flyweight.after;

public final class Color {

    private final String colorName;
    private final String color;
    private final int contrast;

    public Color(final String colorName, final String color, final int contrast) {
        this.colorName = colorName;
        this.color = color;
        this.contrast = contrast;
    }
}
