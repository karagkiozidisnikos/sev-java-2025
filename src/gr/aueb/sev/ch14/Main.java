package gr.aueb.sev.ch14;

public class Main {

    public static void main(String[] args) {
        Point p1 = Point.getInstance(); // static methods belong to the class not to the instance
        Point p2 = Point.getRandomInstance();

        CodingFactory codingFactory = CodingFactory.getInstance();
        CodingFactory codingFactory2 = CodingFactory.getInstance();

        codingFactory2.sayHello();

        HelloUtil.sayHello();
    }
}
