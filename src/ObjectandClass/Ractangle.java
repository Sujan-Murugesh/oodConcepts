package ObjectandClass;
/**
 *
 * @author Sujan
 */
public class Ractangle {
    int length;
    int width;
    
    void insert(int l,int w){
        length=l;
        width=w;
    }
    
    void calculateArea(){
        System.out.println(length*width);
    }
}
