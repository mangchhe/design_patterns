package structural_patterns.flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class ColorFactory {

    Map<String, Color> colorMap = new HashMap<>();

    public Color getColor(String colorName, String color, int contrast) {
        if (colorMap.containsKey(colorName)) {
            return colorMap.get(colorName);
        } else {
            final Color newColor = new Color(colorName, color, contrast);
            colorMap.put(colorName, newColor);
            return newColor;
        }
    }
}
