package ua.goit;

public class ShapeUtils {

    public static String getShapeType (Shape shape) {
        return shape.getShapeType();
    }
    public static String getShapeColor (Shape shape) {
        return shape.getShapeColor();
    }
    public static double getShapeSquare (Circle circle) {
        return circle.getSquare();
    }

    public static double getShapeSquare (Quad quad) {
        return quad.getSquare();
    }
    public static double getShapeVolume (Cube cube) {
        return cube.getVolume();
    }
}
