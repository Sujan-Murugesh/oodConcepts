package ObjectandClass;

/**
 *
 * @author Sujan
 */
public class TestRactangle2 {
    public static void main(String[] args) {
        Ractangle r1=new Ractangle(),r2=new Ractangle();
        
        r1.insert(11, 5);
        r2.insert(50, 10);
        
        r1.calculateArea();
        r2.calculateArea();
    }
}
