package designpattern.fp;

public class FactoryPattern {

    public static void main(String[] args) {

        ShapeFactory sf = new ShapeFactory();

        Shape circle = sf.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = sf.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = sf.getShape("SQUARE");
        square.draw();
    }
}
