package thiskey;

/**
 *
 * @author Sujan
 */
public class TestRealStudent {
    public static void main(String[] args) {
        RealStudent s1=new RealStudent(111,"Madhu","BTEC");
        RealStudent s2=new RealStudent(222, "Sujan","BICT",6000f);
        
        s1.display();
        s2.display();
    }
}
