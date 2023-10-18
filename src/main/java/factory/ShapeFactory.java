package factory;

/**
 * @author Azam
 */
public class ShapeFactory {

    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }

        if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        }

        return null;
    }
}
