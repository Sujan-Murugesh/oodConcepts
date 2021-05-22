package MethodOverloading;

/**
 *
 * @author Sujan
 */
public class Adder {
    static int add(int a,int b){
        return a+b;
    }
    //chang parameters
    static int add(int a,int b,int c){
        return a+b+c;
    }
    //changing data types
    static double add(double a,double b){
        return a+b;
    }
}
