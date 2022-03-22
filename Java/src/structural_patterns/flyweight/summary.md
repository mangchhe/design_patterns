# 플라이웨이트 패턴 (Flyweight Pattern)

- 공통으로 사용하는 부분을 묶어 클래스로 만들고 최초 한 번만 생성하여 재사용할 수 있게 하는 구조 패턴
- 변하는 속성(extrinsic), 변하지 않는 속성(intrinsic)을 분리하여 변하지는 않는 속성을 재사용하여 메모리 사용을 줄임

## 장점

- 실행 시에 객체 인스턴스의 개수를 줄여서 메모리를 절약할 수 있다.
- 여러 객체의 상태를 한 곳에 집중시켜놓을 수 있다.

## 단점

- 특정한 인스턴스만 다른 인스턴스와 다른 방식으로 행동하게 하는 것이 불가능하다.

## 다이어그램

<div align="center">

![flyweight](https://user-images.githubusercontent.com/50051656/159488254-04efa4d1-9dd7-4a92-a131-3bf0d41c1a21.png)

</div>

- Flyweight : 공유되는 클래스
- FlyweightFactory : Flyweight 인스턴스 생성 또는 관리

## Before

- colorName, color, contrast는 공유될 수 있지만, 매번 생성되기 때문에 그만큼 메모리도 차지하게 된다.

```java
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
```

## After

- Tree 클래스에 공유되는 부분을 Color로 추출

### Flyweight

```java
public class Tree {

    private int x;
    private int y;
    private Color color;

    public Tree(final int x, final int y, final Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    // getter 생략
}

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
```

### FlyweightFactory

- ColorFactory를 만들어 이미 만들어진 컬러가 존재한다면 저장된 인스턴스 반환
- 그렇지 않다면 새로 생성하여 저장 후 반환

```java
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
```

### Client

- grease 라는 컬러 이름을 가진 black 계열의 명암 60은 새로 인스턴스가 계속 생성되지 않고 기존 인스턴스가 재사용된 것을 확인할 수 있다.

```java
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
        System.out.println(tree3.getColor()); // 동일
        System.out.println(tree4.getColor()); // 동일
        System.out.println(tree5.getColor()); // 동일
    }
}
```