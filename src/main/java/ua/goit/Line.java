package ua.goit;

public class Line extends Shape {
    double lineLength;

    public double getLineLength() {
        return lineLength;
    }

    public Line(String name, int positionX, int positionY, double lineLength) {
        super(name, positionX, positionY);
        this.lineLength = lineLength;
    }
}
