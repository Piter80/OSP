package chapter1;

public class TestNumber {
    public static void main(String[] args) {
        Test test = new ExtendedTest();
        System.out.println(test.x + " " + test.y);
        System.err.println("Err");

    }
}

class Test {
    int x,y;
    Test () {
        x = 10; y=20;
    }
    Test (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ExtendedTest extends Test {
    int x,y;
    ExtendedTest () {
        super(1000, 2000);
        this.x = 100;
        this.y = 200;
    }
}
