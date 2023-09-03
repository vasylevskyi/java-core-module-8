package ua.goit;

abstract class Shape {
    private String name;
    private int positionX;
    private int positionY;
    private Colors shapeColor;

    public Shape(String name) {
        this.name = name;
    }
    public Shape(String name, int positionX, int positionY) {
        this(name);
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public String getName() {
        return name;
    }
    public int getPositionX() {
        return positionX;
    }
    public int getPositionY() {
        return positionY;
    }

    public String getShapeColor() {
        return shapeColor.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public void setShapeColor(Colors shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeType() {
        return this.getClass().getSimpleName();
    }
}
