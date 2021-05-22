package Inheritance;

/**
 *
 * @author Sujan
 */
public class Programmer extends Employee{
    int bonus=10000;
    
    public static void main(String[] args) {
        Programmer p1=new Programmer();
        System.out.println("Program salary is: "+p1.salary+"$");
        System.out.println("bonus of Programmer is: "+p1.bonus+"$");
        System.out.println("Total Salary: "+(p1.bonus+p1.salary+"$"));
    }
    
}
