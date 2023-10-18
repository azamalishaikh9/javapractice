package designpatterns.abstfactory;

/**
 * @author Azam
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        
        if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}
