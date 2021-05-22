package MethodOverriding;

/**
 *
 * @author Sujan
 */
//without using overriding....
public class Bike extends Vehicle{
    public static void main(String[] args) {
        Bike b1=new Bike();//creating instance of child class
        b1.run();//calling the method with the child class instance
    }
}
