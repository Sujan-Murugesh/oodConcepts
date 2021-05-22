package oodconcepts;

/**
 *
 * @author Sujan
 */
public class Student6 {
    int id;
    String name;
    
    //constructor to initialize 

    Student6(int i,String n){
        id=i;
        name=n;
    }
    
    //constructor to initialize another object
    Student6(Student6 s){
        id=s.id;
        name=s.name;
    }

    void display(){
        System.out.println(id+"  "+name);
    }
    public static void main(String[] args){
        Student6 obj=new Student6(1111, "Mywife");
        Student6 obj1=new Student6(obj);
        
        obj.display();
        obj1.display();
        
    }
    
}
