package ua.goit;

public class Cube extends Quad {
    private double height;
    private double volume;

    public double getVolume() {
        return volume;
    }

    public Cube(String name, int positionX, int positionY, double length, double width, double height) {
        super(name, positionX, positionY, length, width);
        this.height = height;
        this.volume = super.square * height;
    }
}
