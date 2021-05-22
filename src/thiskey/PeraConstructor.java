package thiskey;

/**
 *
 * @author Sujan
 */
public class PeraConstructor {

    PeraConstructor(){
        this(10);
        System.out.println("Hello lovely...");
    }
    
    PeraConstructor(int x){
        System.out.println(x);
    }
    
}
