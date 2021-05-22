package Variables;

/**
 *
 * @author Sujan
 */
public class TestSticMethodStudent {
    public static void main(String[] args) {
       Student.change();
        //create obj..
        Student s1=new Student(111, "sujan");
        Student s2=new Student(112, "sujankayal");
        Student s3=new Student(113, "sujandhanu");
        
        //display methods
        s1.display();
        s2.display();
        s3.display();
    }
 
}
