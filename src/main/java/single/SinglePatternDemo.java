package single;

/**
 * @author Azam
 */
public class SinglePatternDemo {

    public static void main(String[] args) {
        SingleObject obj = SingleObject.getInstance();

        obj.showMessage();
    }
}
