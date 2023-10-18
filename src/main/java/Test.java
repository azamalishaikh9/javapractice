/**
 * @author Azam
 */
public class Test{

    public static void main(String[] args) {

        TestBase testBase = new TestBase();
        testBase.m1();
        testBase.m1("");
        testBase.m1(null);

        Tests tests = new Tests();
        tests.m1();
    }
}

class TestBase{
    void m1(){
        System.out.println("TestBase : Print m1() without parameter");
    }
    void m1(String str){
        System.out.println("TestBase : Print m1() with String parameter");
    }
}

class Tests extends TestBase{
//    void get(Integer num){
//
//    }
    @Override
    void m1(){
        System.out.println("Test : Print m1() without parameter");
    }
}