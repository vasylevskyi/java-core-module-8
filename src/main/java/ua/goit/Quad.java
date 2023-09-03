package ua.goit;

public class Quad extends Shape{
    private double length;
    private double width;
    protected double square;

    public double getSquare() {
        return square;
    }

    public Quad(String name, int positionX, int positionY, double length, double width) {
        super(name, positionX, positionY);
        this.length = length;
        this.width = width;
        this.square = length * width;
    }
}
