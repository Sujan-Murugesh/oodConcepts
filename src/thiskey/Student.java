package thiskey;

/**
 *
 * @author Sujan
 */
public class Student {
    int rollno;
    String name;
    float fee;
   
    
    public Student(int rollno,String name,float fee){
       
       /* rollno=rollno;
        name=name;
        fee=fee; */
        
        
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    
    void display(){
        System.out.println(rollno+"  "+name+"  "+fee);
    }
    
    //with out this key we dont have out put... only default values...
}
