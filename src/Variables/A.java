package Variables;

/**
 *
 * @author Sujan
 */
public class A {
    //int a=40; //non static variable;
    static int a=40;
    public static void main(String[] args) {
        System.out.println(a);
    }
}
//running time error because java not allowed non static variable to non static methods..
