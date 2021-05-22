package Variables;

/**
 *
 * @author Sujan
 */
public class Student {
    int rollno;
    String name;
    static String collage="Bosco's"; //declare static variable...
    //constructor
    
    Student(int r,String n){
        rollno=r;
        name=n;
    }
    //method to display the values
    void display(){
        System.out.println(rollno+"  "+name+"  "+collage);
    }   
    
    //decare static methods
    static void change(){
        collage="GTMV";
    }
}
