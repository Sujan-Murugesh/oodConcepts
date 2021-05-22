package Aggregation;

/**
 *
 * @author Sujan
 */
public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    void display(){
        System.out.println("Emp id; "+id+"\nEmp Name: "+name);
        System.out.println("Emp Address: "+address.city+"  \n"+"\t     "+address.state+" \n"+"\t     "+address.country+"\n");
    }
    
    public static void main(String[] args) {
        Address address1=new Address("hatton", "Central","Srilanka");
        Address address2=new Address("Norwood","Central","Srilanka");
        
        Employee e=new Employee(0111,"Sujan", address1);
        Employee e1=new Employee(0112,"Dhanusha", address2);
        
        e.display();
        e1.display();
    }
}
