package basic;

interface Bar {
    default void bar() {
    }

    ;
}

abstract class FooBase {

    public void bar() {
        System.out.println("In static bar.");
    }
}

public class Test5 extends FooBase implements Bar {

    public void bar() {
    }

    ;

}

