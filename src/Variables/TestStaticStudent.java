package Variables;

/**
 *
 * @author Sujan
 */
//progrm to demonsrate static variables...
public class TestStaticStudent {
    public static void main(String[] args) {
        Student s1=new Student(111,"Dhanulove");
        Student s2=new Student(222, "kayal...");
        
        s1.display();
        s2.display();
        
        //we can change static variable value simply one line of code;
        Student.collage="Norwood";
        
        s1.display();
        s2.display();
    }
}
