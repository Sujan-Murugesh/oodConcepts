package oodconcepts;

/**
 *
 * @author Sujan
 */
public class Student1 {
    int id;
    String name;
    
    void display(){
        System.out.println(id+"  "+name);
    }
    
    public static void main(String[] args){
        Student1 obj=new Student1();
        Student1 obj1=new Student1();
        
        obj.display();
        obj1.display();
    }
}
