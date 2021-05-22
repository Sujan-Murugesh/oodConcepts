package Finalkey;

/**
 *
 * @author Sujan
 */
public class Bike {
    final int speedlimit=90; //final variable...
    void run(){
     //speedlimit=400; //this appends error... 
        System.out.println(""+speedlimit);
    }
    
    public static void main(String[] args) {
        Bike b=new Bike();
        b.run();
    }
}
