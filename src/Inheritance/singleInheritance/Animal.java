package Inheritance.singleInheritance;

/**
 *
 * @author Sujan
 */
public class Animal {
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
