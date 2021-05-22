package Encapsulation;

/**
 *
 * @author Sujan
 */
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1=new MyPoint();
        MyPoint p2=new MyPoint(2, 5);
        
        System.out.println("point p1 values:");
        System.out.println("X : "+p1.getX());
        System.out.println("Y : "+p1.getY());
        
        System.out.println("point p1's values: "+p1.toString());
        
        System.out.println("point p2 values:");
        System.out.println("X :"+p2.getX());
        System.out.println("Y :"+p2.getY());
        
        System.out.println("point p1 assining new values:");
        p1.setX(10);
        p1.setY(30);
        p1.setXY(50, 45);
        
        System.out.println("point p1 values:");
        System.out.println("X : "+p1.getX());
        System.out.println("Y : "+p1.getY());
        
        System.out.println("Distance is :"+p1.distance(10, 20));
        System.out.println(p1.distance(p2));
        
        System.out.println("X :"+p1.x); //cant access becausse private
        System.out.println("X :"+p1.y);
        
        
    }
}
