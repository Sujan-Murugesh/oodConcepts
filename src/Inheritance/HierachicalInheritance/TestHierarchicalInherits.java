package Inheritance.HierachicalInheritance;

/**
 *
 * @author Sujan
 */
public class TestHierarchicalInherits {
    public static void main(String[] args) {
        Cat c1=new Cat();
        c1.eat();
        c1.meow();
       // c1.bark(); we can't do this....
       
        System.out.println("\nDog class behaviours...\n");
       Dog d=new Dog();
       d.bark();
       d.eat();
       //d.meow();  we can't do this ....
       
       Dog da = new Dog();
       da.bark();
       da.eat();
    }
}
