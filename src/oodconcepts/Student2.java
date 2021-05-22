package oodconcepts;

/**
 *
 * @author Sujan
 */
public class Student2 {
    int id;
    String name;

    //create perameterize constructor
    Student2(int i,String n){
        id=i;
        name=n;
    }
    
    void display(){
        System.out.println(id+"  "+name);
    }
    
    public static void main(String[] args){
        Student2 obj=new Student2(111, "Sujan kayal");
        Student2 obj1=new Student2(222,"Dhanusha");
        
        obj.display();
        obj1.display();
    }   
}
