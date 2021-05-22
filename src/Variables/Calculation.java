package Variables;

/**
 *
 * @author Sujan
 */
public class Calculation {
    static int a =100;
    static int cube(int x){
        return x*x*x;
    }
    
    public static void main(String[] args) {
        int result=Calculation.cube(8);
        System.out.println(result);
    }  
}
