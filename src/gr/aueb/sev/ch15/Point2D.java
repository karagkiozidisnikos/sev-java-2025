package gr.aueb.sev.ch15;

public class Point2D extends Point{
    private double y;

    /**
     * Java initiates the superclass and this class
     */
    public Point2D() {
//        super(); // super points to the superclass, super() is the constructor of the superclass
//        y = 0.0;
    }

    public Point2D(double x, double y) {
        super(x);
//        super();
//        this.setX(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void movePlusOne() { //Liskov substitution principle = όχι πιο restrictive access
        super.movePlusOne();
        y += 1;
    }

    @Override
    protected void movePlus10() {
        super.movePlus10();
        y += 10;
    }
}
