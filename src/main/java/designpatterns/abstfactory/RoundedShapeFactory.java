package designpatterns.abstfactory;

/**
 * @author Azam
 */
public class RoundedShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        
        if(shape.equalsIgnoreCase("Rectangle")){
            return new RoundedRectangle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new RoundedSquare();
        }
        return null;
    }
}
