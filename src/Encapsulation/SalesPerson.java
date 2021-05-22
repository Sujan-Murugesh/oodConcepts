package Encapsulation;

/**
 *
 * @author Sujan
 */
public class SalesPerson {
    private String name;
    private int id;
    private float commissionRate;
    private double sales;

    SalesPerson() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SalesPerson(String name, int id, float commissionRate) {
        this.name=name;
        this.id = id;
        this.commissionRate = commissionRate;
    }
     public void setName(String n){
        this.name=n;
    }
   
    
    public String getName(){
        return name;
    }
    
    public void setCommitionRate(double newRate){
        if(newRate >= 0.0 && newRate <= 0.20){
            commissionRate=(float)newRate;
        }else{
            System.out.println("ate must be between 0 and 20");
        }
    }
    
    public int getId(){
        return id;
    }
    
    public void addToSales(double s){
        sales += s;
    }
    
    public double computeCommission(){
        double commission =0.0;
        if(sales > 0.0){
            commission = sales * commissionRate;
        }
        sales =0.0;//start over
        return commission;
    }

    void setid(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
