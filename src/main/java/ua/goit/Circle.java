package ua.goit;

public class Circle extends Shape {
    private double radius;
    private double Square;

    public double getSquare() {
        return Square;
    }

    public Circle(String name, int positionX, int positionY, double radius) {
        super(name, positionX, positionY);
        this.radius = radius;
        this.Square = Math.pow(radius, 2) * Math.PI;
    }

}
