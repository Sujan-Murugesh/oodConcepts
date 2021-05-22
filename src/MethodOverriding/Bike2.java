package MethodOverriding;

/**
 *
 * @author Sujan
 */
public class Bike2 extends Vehicle{
    //define same method as in the parent class...
    void run(){
        System.out.println("Bike is Running Saftly...");
    }
    
    public static void main(String[] args) {
        Bike2 b1=new Bike2();
        b1.run();
    }
}
