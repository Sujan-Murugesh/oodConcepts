package SuperKey.RealSuperkeyUseage;

/**
 *
 * @author Sujan
 */
public class Employee extends Person{
    float salary;

    public Employee(int id,String name,float salary){
        super(id,name);//reuseing parent constructor...
        this.salary=salary;
    }
    
    void display(){
        System.out.println(id+"  "+name+" "+salary);
    }
    
}
