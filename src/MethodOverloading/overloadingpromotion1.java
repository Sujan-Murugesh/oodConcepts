package MethodOverloading;

/**
 *
 * @author Sujan
 */
//ststic polymorphism

public class overloadingpromotion1 {
    void sum(int a,int b){
        System.out.println("int arg method is invoked...");
    }
    
    void sum(long a,long b){
        System.out.println("long arg method is invoked...");
    }
    
    public static void main(String[] args) {
        overloadingpromotion1 obj=new overloadingpromotion1();
        obj.sum(20, 10); //now int argument method is invoked...
        
    }
}
