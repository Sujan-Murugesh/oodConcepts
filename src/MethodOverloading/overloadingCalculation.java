package MethodOverloading;

/**
 *
 * @author Sujan
 */
//type promotions...
public class overloadingCalculation {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    
    void sum(int a ,int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        overloadingCalculation obj1=new overloadingCalculation();
        obj1.sum(20,30);
        //now second int literal will be promoted to long
        obj1.sum(20, 20, 20);
    }
    
}
