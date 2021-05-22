package SuperKey.ParentInstanceVariable;

/**
 *
 * @author Sujan
 */
public class Dog extends Animal{
    String color="Black";
    void printColor(){
        System.out.println(color);//print color of dog class
        System.out.println(super.color);//print color of animal class
    }
}
