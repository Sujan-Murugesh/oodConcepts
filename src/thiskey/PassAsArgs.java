package thiskey;

/**
 *
 * @author Sujan
 */
public class PassAsArgs {
    void m(PassAsArgs obj){
        System.out.println("method invoked...");
    }
    
    void p(){
        m(this);
    }
    
    public static void main(String[] args) {
        PassAsArgs p1=new PassAsArgs();
        p1.p();
    }
}
