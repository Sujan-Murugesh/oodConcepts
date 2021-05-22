package thiskey;

/**
 *
 * @author Sujan
 */
public class CurConstructor {

    CurConstructor(){
        System.out.println("Hello dhanu...");  
    }
    
    CurConstructor(int x){
        this();
        System.out.println(x);
    }
    
}
