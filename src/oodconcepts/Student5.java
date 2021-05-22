package oodconcepts;

/**
 *
 * @author Sujan
 */
//constructor overloading
public class Student5 {
   int id;
   String name;
   int age;
   
   //create 2 args constructor

    Student5(int i,String n){
        id=i;
        name=n;
    }
     //create 3 args constructor
    Student5(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    
    void display(){
        System.out.println(id+"  "+name+"  "+age);
    }
    
    public static void main(String[] args){
        Student5 s1=new Student5(111, "Sujankayal");
        Student5 s2=new Student5(555, "Dhanukayal", 25);
        
        s1.display();
        s2.display();
        
    }
} 

