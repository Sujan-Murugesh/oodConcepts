package oodconcepts;

/**
 *
 * @author Sujan
 */
//innitialize object throught methods...
public class TestStudent3 {
    public static void main(String[] args){
        Student3 obj=new Student3();
        Student3 obj1=new Student3();
        
        obj.insertRecord(500," Sujan");
        obj1.insertRecord(112,"Dhanu");
        
        obj.displayInfo();
        obj1.displayInfo();
    }
}
