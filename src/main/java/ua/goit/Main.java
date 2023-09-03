package ua.goit;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Point point = new Point("Point1", 1, 1);
        System.out.println("Shape type is " + ShapeUtils.getShapeType(point));
        point.setShapeColor(Colors.YELLOW);
        System.out.println("Shape color is " + ShapeUtils.getShapeColor(point));

        System.out.println("------------------------");

        Line line = new Line("Line1", 25, 25,22);
        System.out.println("Shape type is " + ShapeUtils.getShapeType(line));
        line.setShapeColor(Colors.PURPLE);
        System.out.println("Shape color is " + ShapeUtils.getShapeColor(line));

        System.out.println("------------------------");

        Circle circle = new Circle("Cirle1", 10, 10, 5.5);
        System.out.println("Shape type is " + ShapeUtils.getShapeType(circle));
        circle.setShapeColor(Colors.GREEN);
        System.out.println("Shape color is " + ShapeUtils.getShapeColor(circle));
        System.out.println("Shape square = " + ShapeUtils.getShapeSquare(circle));

        System.out.println("------------------------");

        Quad quad = new Quad("Quad1", 15, 15, 10,5);
        System.out.println("Shape type is " + ShapeUtils.getShapeType(quad));
        quad.setShapeColor(Colors.RED);
        System.out.println("Shape color is " + ShapeUtils.getShapeColor(quad));
        System.out.println("Shape square = " + ShapeUtils.getShapeSquare(quad));

        System.out.println("------------------------");

        Cube cube = new Cube("Cube1", 20, 20, 7,8,5);
        System.out.println("Shape type is " + ShapeUtils.getShapeType(cube));
        cube.setShapeColor(Colors.BLUE);
        System.out.println("Shape color is " + ShapeUtils.getShapeColor(cube));
        System.out.println("Shape square = " + ShapeUtils.getShapeSquare(cube));
        System.out.println("Shape square = " + ShapeUtils.getShapeVolume(cube));


    }
}
