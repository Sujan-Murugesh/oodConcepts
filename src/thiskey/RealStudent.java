package thiskey;
/**
 *
 * @author Sujan
 */
public class RealStudent {
    int rollno;
    String course;
    String name;
    float fee;
    

    public RealStudent(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course=course;
    }

    RealStudent(int rollno,String name,String course,float fee){
        //this.fee=fee;  RTERROR... we must call 1st statement inconstructor  
        this(rollno,name,course);
        this.fee=fee;
    }
    
    void display(){
        System.out.println(rollno+"  "+name+"  "+fee+"  "+course);
    }

   
    
}
