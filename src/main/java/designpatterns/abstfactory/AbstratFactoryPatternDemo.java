package designpatterns.abstfactory;

/**
 * @author Azam
 */
public class AbstratFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shape = FactoryProducer.getFactory(false);

        Shape rectangle = shape.getShape("Rectangle");

        rectangle.draw();

        Shape square = shape.getShape("Square");

        square.draw();

        AbstractFactory roundedShape = FactoryProducer.getFactory(true);

        Shape roundedRectangle = roundedShape.getShape("Rectangle");

        roundedRectangle.draw();

        Shape roundedSquare = roundedShape.getShape("Square");

        roundedSquare.draw();

    }
}
