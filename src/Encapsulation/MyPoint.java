package Encapsulation;

/**
 *
 * @author Sujan
 */
public class MyPoint {
    /*private int x;
    private int y;*/
    
    int x;
    int y;

    public MyPoint(){//default constructor
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {//peramiter constructor
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(int x){
        this.x=x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    
    @Override
    public String toString(){
        return "X : "+this.x+"\nY : "+this.y;
    }
    
    public double distance(int x,int y){
        double diffX=this.x-x;
        double diffY=this.y-y;
        return Math.sqrt(diffX*diffX+diffY*diffY);
    }
    
    public double distance(MyPoint another){
        double diffX=this.x-another.getX();
        double diffY=this.y-another.getY();
        return Math.sqrt(diffX*diffX+diffY*diffY);
    }  
}
