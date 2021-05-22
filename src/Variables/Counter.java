package Variables;

/**
 *
 * @author Sujan
 */
public class Counter {
  //int count=0;
  static int count=0;
  //so static variable retain it's new value;

    public Counter(){
        count++;
        System.out.println(count);
    }
    
    public static void main(String[] args) {
        //create obj
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        
    }

    
}
