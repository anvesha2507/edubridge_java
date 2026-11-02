package P13;
class A {

    A(int value) {
        System.out.println("A constructor: " + value);
    }
}

class B extends A {

    B(int value) {
        super(value + 10);
        System.out.println("B constructor: " + value);
    }
}

public class ConstructorDemo extends B {

    ConstructorDemo(int value) {
        super(value + 20);
        System.out.println("C constructor: " + value);
    }

    public static void main(String[] args) {

        ConstructorDemo obj = new ConstructorDemo(10);
    }
}