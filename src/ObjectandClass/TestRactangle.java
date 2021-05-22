package ObjectandClass;

/**
 *
 * @author Sujan
 */
public class TestRactangle {
    public static void main(String[] args) {
        Ractangle r1=new Ractangle();
        Ractangle r2=new Ractangle();
        
        r1.insert(45, 100);
        r2.insert(69, 10);
        
        r1.calculateArea();
        r2.calculateArea();
    }
}
