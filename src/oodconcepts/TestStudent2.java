package oodconcepts;

/**
 *
 * @author Sujan
 */
//multiple objects
public class TestStudent2 {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        //initializing objects
        s1.id=256;
        s1.name="Dhanusha";
        s2.id=357;
        s2.name="Sujan kayal";
        
        System.out.println(s1.id+"  "+s1.name);
        System.out.println(s2.id+"  "+s2.name);
        
        
    }
}
