package oodconcepts;

/**
 *
 * @author Sujan
 */
//initialize throught methods
public class Student3 {
    int rollno;
    String name;
    
    void insertRecord(int r,String n){
        rollno=r;
        name=n;
    }
    
    void displayInfo(){
        System.out.println(rollno+"  "+name);
    }
}//testStuden3 file to output
