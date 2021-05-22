package oodconcepts;

/**
 *
 * @author Sujan
 */
//initialization throught reference
public class TestStudent1 {
    public static void main(String[] args){
        Student s1=new Student();
        s1.id=248;
        s1.name="Sujan";
        System.out.println(s1.id+"  "+s1.name);
    }
}
