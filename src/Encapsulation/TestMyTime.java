package Encapsulation;

/**
 *
 * @author Sujan
 */
public class TestMyTime {
    public static void main(String[] args) {
        MyTime t =new MyTime();
        System.out.println(t.ToString());
        
        MyTime t1=new MyTime(12,12,12);
        System.out.println("H:"+t1.getHour());
        System.out.println("M:"+t1.getMinute());
        System.out.println("S:"+t1.getSecond());
        
        System.out.println("HH:MM:SS "+t1.ToString());
        
        /*for(;;){
        t1.nextSecond();
        t1.nextMinute();
        t1.nextHour();
        System.out.println("HH:MM:SS "+t1.ToString());
        }
       */
        
        t1.nextSecond();
        t1.nextMinute();
        t1.nextHour();
        
        System.out.println("HH:MM:SS "+t1.ToString());
        
        MyTime t2=new MyTime();
        MyTime myTime = new MyTime(45,100,100);
        
        t1.previousHour();
        t1.previousMinute();
        t1.previousSecond();
        
        System.out.println("HH:MM:SS "+t1.ToString());
    }
}
