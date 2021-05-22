package Encapsulation;
/**
 *
 * @author Sujan
 */
public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(){
        hour=0;
        minute=0;
        second=0;
    }

    public MyTime(int hour, int minute, int second) {
        if((hour <=23 && hour >=0)&&(minute <=59 && minute >=0)&&(second <=59 && second >=0)){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        }
        else{
            System.out.println("Invalid Hour,Munute,second...");
        }
    }
    
    public void setTime(int hour, int minute, int second){
        if((hour <=23 && hour >=0)&&(minute <=59 && minute >=0)&&(second <=59 && second >=0)){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
         }
        else{
            System.out.println("Invalid Hour,Munute,second...");
        }
    }
    
    public int getHour(){
        return hour;
    }
    
    public int getMinute(){
        return minute;
    }
    
    public int getSecond(){
        return second;
    }
    
    public void setHour(int hour){
        this.hour=hour;
    }
    
    public void setMinute(int minute){
        this.minute=minute;
    }
    
    public void setSecond(int second){
        this.second=second;
    }
    
    public String ToString(){
        return ""+this.hour+" : "+this.minute+" : "+this.second;
    }
    
    public void nextSecond(){
        if(this.second>=59){
            this.second=0;
            nextMinute();
        }else{
            this.second++;
        }
    }
    
    public void nextMinute(){
        if(this.minute>=59){
            this.minute=0;
            nextHour();
        }else{
            this.minute++;
        }
    }
    
    public void nextHour(){
        if(this.hour>=23){
            this.hour=0;
            nextSecond();
        }else{
            this.hour++;
        }
    }
    
    public void previousSecond(){
        if(0==this.second){
            this.second=59;
            previousMinute();
        }else{
            this.second--;
            
        }
    }
    
    public void previousMinute(){
        if(0==this.minute){
            this.minute=59;
            previousHour();
        }else{
            this.minute--;
        }
    }
    
    public void previousHour(){
        if(0==this.hour){
            this.hour=23;
            previousSecond();
        }else{
            this.hour--;
        }
    }
}
