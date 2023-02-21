package com.example.headfirstdesignpatterns.solid.Liskov;

public class Rectangle {
    protected int width, height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    /**
     * this can solve Liskov
     * @return
     */
    public boolean isSquare() {
        return width == height;
    }
}

class Square extends Rectangle {
    public Square() {}
    public Square(int size) {
        width = height = size;
    }

    /**
     * violates Liskov
     * @param width
     */
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    /**
     * violates Liskov
     * @param height
     */
    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

/**
 * Liskov can be solved with the factory pattern (below impl)
 */
class RectangleFactory {
    public static Rectangle newRectangle(int width, int height) {
        return new Rectangle(width, height);
    }
    public static Rectangle newSquare(int side) {
        return new Rectangle(side, side);
    }
}

class Demo {
    static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);
        // area = width * 10;
        System.out.println("Expected area: " + (width * 10) + ", got " + rectangle.getArea());
    }
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2,3);
        useIt(rc);

        Rectangle square = new Square();
        square.setWidth(5);
        useIt(square);

        Rectangle goodSquare = RectangleFactory.newSquare(5);
        useIt(goodSquare);
    }
}