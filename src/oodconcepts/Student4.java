package oodconcepts;

/**
 *
 * @author Sujan
 */
public class Student4 {
    int id;
    String name;

    Student4(int i,String n) {//perameter cunstructor
        id=i;
        name=n;
    }
    
    void display(){
        System.out.println(id+"  "+name);
    }
    
    public static void main(String[] args){
        Student4 ob=new Student4(555, "baba");
        Student4 ob1=new Student4(777, "kanna");
        
        ob.display();
        ob1.display();
    }   
}
