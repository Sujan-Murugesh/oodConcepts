package ObjectandClass;

/**
 *
 * @author Sujan
 */
public class TestEmployee {
    
    public static void main(String[] args){
    Employee e1=new Employee();
    Employee e2=new Employee();
    Employee e3=new Employee();
    
    e1.insert(111,"Sujan",45000);
    e2.insert(222,"kayal",50000);
    e3.insert(333,"sujankayal",60000);
    
    e1.display();
    e2.display();
    e3.display();
    }         
}
