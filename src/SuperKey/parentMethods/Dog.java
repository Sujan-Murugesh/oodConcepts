package SuperKey.parentMethods;

/**
 *
 * @author Sujan
 */
public class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Eating breads...");
    }
    void bark(){
         System.out.println("Barking.....");
    }
    
    void work(){
        super.eat();
        bark();
    }
}
